package com.java.skill.accessmodifier.other;
import com.java.skill.accessmodifier.base.Access1;

public class Practice2 {
    public static void main(String[] args) {
        Access1 access1 = new Access1();

        // has private access -> 다른 패키지
//        access1.secret;

        // has protected access -> 다른 패키지
//        access1.protect;

        // is not public -> 다른 패키지
//        access1.basic;
    }
}
