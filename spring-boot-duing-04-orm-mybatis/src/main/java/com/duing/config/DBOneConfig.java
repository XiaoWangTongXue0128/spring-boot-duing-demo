package com.duing.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @MapperScan(basePackages = "com.duing.mapper",sqlSessionFactoryRef ="sqlSessionFactory1" )
 * basePackages关联的mapper
 * sqlSessionFactoryRef关联的SqlSessionTemplate
 */
@Configuration
@MapperScan(basePackages = "com.duing.mapper",sqlSessionFactoryRef ="sqlSessionFactory1" )
public class DBOneConfig {
    @Autowired
    @Qualifier("db1")
    private DataSource dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory1() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory1());
        return sqlSessionTemplate;
    }
}
