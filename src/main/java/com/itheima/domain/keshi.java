package com.itheima.domain;

public class keshi {
    private Integer id;
    private String kname;


    public keshi() {
    }

    public keshi(Integer id, String kname) {
        this.id = id;
        this.kname = kname;
    }

    /**
     * 获取
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取
     * @return kname
     */
    public String getKname() {
        return kname;
    }

    /**
     * 设置
     * @param kname
     */
    public void setKname(String kname) {
        this.kname = kname;
    }

    public String toString() {
        return "keshi{id = " + id + ", kname = " + kname + "}";
    }
}