package com.zzy.mvc.controller;

/**
 * arg请求过来的对象
 *
 * @author zhengzhiyuan
 * @since May 3, 2016
 */
public class ArgForm {
    private Integer id;
    private String name;
    private String other;

    public ArgForm() {
        this.other = "other info";
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

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

}
