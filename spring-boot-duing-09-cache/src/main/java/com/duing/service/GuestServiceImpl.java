package com.duing.service;

import com.duing.mapper.GuestMapper;
import com.duing.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 设置@Cacheable中的相同元素
 */
@CacheConfig(cacheNames = "guests")
@Service
public class GuestServiceImpl implements GuestService{

    /**
     * @Caching:组合多个Cache注解
     */
    @Caching(cacheable = {
            @Cacheable(value = "1", key = "1"), @Cacheable(value = "2", key = "2")
    }, put = {
            @CachePut(value = "3", key = "3"), @CachePut(value = "4", key = "4")
    }, evict = {
            @CacheEvict(value = "5", key = "5"), @CacheEvict(value = "6", key = "6")
    })
    public String save(Guest guest) {
        return "success";
    }

    @Autowired
    private GuestMapper mapper;
//    @Autowired
//    private GuestMapper2 mapper;

    @Override
    public List<Guest> getGuests() {
        return mapper.getGuests();
    }

    /**
     * @Cacheable()执行逻辑:查找缓存，有就返回，没有就执行方法体，将结果缓存起来；适用于查询数据的方法
     * cacheNames/value ：用来指定缓存组件的名字
     * key ：缓存数据时使用的key，可以用它来指定。默认使用方法参数的值。（这个key可以使用spEL表达式来编写）
     * keyGenerator ：key的生成器。key和keyGenerator二选一使用
     * cacheManager ：可以用来指定缓存管理器。从哪个缓存管理器里面获取缓存。
     * condition ：可以用来指定符合条件的情况下才缓存
     * unless ：否定缓存。当 unless 指定的条件为 true ，方法的返回值不会被缓存。当然你也可以获取到结果进行判断。（通过 #result 获取方法结果）
     * sync ：是否使用异步模式。
     */
    @Cacheable(/*cacheNames = "guests",*/key = "#id",unless = "#id>1")
    @Override
    public Guest getGuestById(int id) {
        System.out.println("查询第"+id+"位嘉宾");
        return mapper.getGuestById(id);
    }

    /**
     * @CachePut 执行逻辑是：执行方法体，将结果缓存起来；适用于更新数据的方法。
     *condition：缓存的条件，可以为空，使用 SpEL 编写，返回 true 或者 false，只有为 true 才进行缓存
     * 设置key值和@Cacheable的key值一致，这样@Cacheable再次查询时才能查到
     * 方式一：key = "#guest.id"
     * 方式二：key = "#result.id"
     */
    @CachePut(/*cacheNames = "guests" ,*/ key = "#guest.id")
    @Override
    public Guest updateGuest(Guest guest) {
        mapper.updateGuest(guest);
        System.out.println("更新第" + guest.getId() + "位嘉宾");
        return guest;
    }

    /**
     * @CachEvict:根据一定的条件对缓存进行清空,适用于删除数据的方法
     *condition：缓存的条件，可以为空，使用 SpEL 编写，返回 true 或者 false，只有为 true 才进行缓存
     * allEntries：是否清空所有缓存内容，默认为 false，如果指定为 true，则方法调用后将立即清空所有缓存
     * beforeInvocation：是否在方法执行前就清空，默认为 false，如果指定为 true，则在方法执行前就清空缓存，默认情况下，如果方法执行抛出异常，则不会清空缓存
     */
    @CacheEvict(/*cacheNames = "guests",*/key = "#id")
    @Override
    public void deleteGuest(int id) {
        mapper.deleteGuest(id);
        System.out.println("删除第" +id + "位嘉宾");
    }

    /**
     * @CacheEvict
     * allEntries = true删除所有缓存实例
     * beforeInvocation = true在调用方法之前清楚缓存逻辑
     */
    @CacheEvict(/*cacheNames = "guests",*/allEntries = true,beforeInvocation = true)
    @Override
    public void deleteAllGuest() {
        mapper.deleteAllGuest();
        System.out.println("删除所有嘉宾");
        int a = 1 / 0;
    }
}
