package practice.basicjava.abstractandinterface;

public class FlyUnit extends Unit implements Flyable, Walkable{

    public FlyUnit(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "이 공중 공격을 시작합니다.");
    }

    @Override
    public void fly() {
        System.out.println(name + " 공중 유닛이 날기 시작합니다 .");
    }

    @Override
    public void walk() {
        System.out.println(name + " 공중 유닛이 걷기 시작합니다.");
    }
}
