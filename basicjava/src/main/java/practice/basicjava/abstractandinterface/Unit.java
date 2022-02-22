package practice.basicjava.abstractandinterface;

public abstract class Unit {

    protected String name;

    public Unit(String name){
        this.name = name;
    }

    public void move(){
        System.out.println(name + " unit이 움직입니다.");
    }

    public abstract void attack();

}
