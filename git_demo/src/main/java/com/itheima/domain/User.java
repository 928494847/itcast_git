package com.itheima.domain;

/**
 *   用户实体类
 */
public class User {
    private Integer id;

    private String name;

    private Integer age;  // 年

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
}
