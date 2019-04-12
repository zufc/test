package com.springbootjpa.test.dao;

import com.springbootjpa.test.model.Stu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author  zufeihao
 */
public interface StuRepository extends JpaRepository<Stu,Integer> {



}
