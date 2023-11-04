package com.duing.repository;

import com.duing.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository<对应的实体类, 主键类型>
 */
public interface GuestRepository extends JpaRepository<Guest, Long> {

}
