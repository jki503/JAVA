package practice.basicjava.inheritance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    protected String name;
    protected String job;

    protected User(String name,String job) {
        this.name = name;
        this.job = job;
    }

    protected void move(){
        System.out.println("이동 합니다.");
    }
    protected void basicAttack(){
        System.out.println("기본 공격을 합니다.");
    }
}
