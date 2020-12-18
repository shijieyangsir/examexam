package com.itheima.domain;

public class huanzhe {
    private Integer id;
    private String name;
    private Integer gender;
    private Integer did;
    private String advice;
    private keshi keshi;


    public huanzhe() {
    }

    public huanzhe(Integer id, String name, Integer gender, Integer did, String advice, keshi keshi) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.did = did;
        this.advice = advice;
        this.keshi = keshi;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return gender
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return did
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置
     * @param did
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * 获取
     * @return advice
     */
    public String getAdvice() {
        return advice;
    }

    /**
     * 设置
     * @param advice
     */
    public void setAdvice(String advice) {
        this.advice = advice;
    }

    /**
     * 获取
     * @return keshi
     */
    public keshi getKeshi() {
        return keshi;
    }

    /**
     * 设置
     * @param keshi
     */
    public void setKeshi(keshi keshi) {
        this.keshi = keshi;
    }

    public String toString() {
        return "huanzhe{id = " + id + ", name = " + name + ", gender = " + gender + ", did = " + did + ", advice = " + advice + ", keshi = " + keshi + "}";
    }
}
