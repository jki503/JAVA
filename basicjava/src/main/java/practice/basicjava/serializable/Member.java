package practice.basicjava.serializable;

import lombok.Data;

import java.io.Serializable;

@Data
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    Long age;
    transient String password;

    public Member(String name, Long age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Member() {

    }
}
