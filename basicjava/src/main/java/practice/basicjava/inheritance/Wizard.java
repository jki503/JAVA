package practice.basicjava.inheritance;

public class Wizard extends User{

    public Wizard(String name, String job) {
        super(name, job);
    }

    public void magicAttack(){
        System.out.println("마법 공격을 실행합니다.");
    }

    public void teleport(){
        System.out.println("텔레포트로 이동합니다.");
    }

}
