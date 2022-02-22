package practice.basicjava.accessmodifier.base;

public class Practice {
    public static void main(String[] args) {

        Access1 access1 = new Access1();
        // has private access -> 같은 패키지여도 다른 클래스
//        access1.secret;

        // default로 동일 package에서는 접근 가능
        System.out.println(access1.basic);

        // protected 동일 package에서 접근 가능
        System.out.println(access1.protect);
    }

}
