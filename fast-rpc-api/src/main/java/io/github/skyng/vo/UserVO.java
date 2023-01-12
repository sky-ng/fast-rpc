package io.github.skyng.vo;

import java.io.Serializable;

public class UserVO implements Serializable {

    private static final long serialVersionUID = 8517063067412353902L;

    private String name;

    private Integer age;

    private String sex;

    private String job;

    public UserVO() {
    }

    public UserVO(String name, Integer age, String sex, String job) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
