package practice.basicjava.accessmodifier.other;

import practice.basicjava.accessmodifier.base.Access1;

public class Access2 extends Access1 {

    public static void main(String[] args) {
        Access2 access2 = new Access2();
        // 상속 받은 클래스에서는 패키지 달라도 가능
        access2.protect = "child class possible";
        System.out.println(access2.protect);
    }
}
