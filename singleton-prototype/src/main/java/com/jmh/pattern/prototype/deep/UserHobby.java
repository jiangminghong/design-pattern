package com.jmh.pattern.prototype.deep;

import java.io.Serializable;

/**
 * @description:
 * @author: JMH
 * @create: 2019-03-21 15:05
 */
public class UserHobby implements Serializable {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
