package com.java.skill.accessmodifier.base;

public class Access1 {

    private String secret; // class 내부에서만 사용 가능
    String basic; // 해당 패키지에서는 접근 가능
    protected String protect; // 해당 패키지의 클래스 or 상속받은 클래스에서만 접근 가능

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public void print(){
        System.out.println("secret = " + secret);
    }
}
