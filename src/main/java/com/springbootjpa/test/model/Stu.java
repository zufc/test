package com.springbootjpa.test.model;

import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author  zufeichao
 */
@Entity
@Proxy(lazy = false)
public class Stu {

    /**
     * 学生id
     */
    @Id
    @GeneratedValue
    private  Integer id;

    /**
     * 学生姓名
     */
    private  String name;

    /**
     * 学生学校
     */
    private  String school;

    public Stu() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
