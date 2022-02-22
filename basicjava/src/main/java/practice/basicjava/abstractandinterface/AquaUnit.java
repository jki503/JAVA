package practice.basicjava.abstractandinterface;

public class AquaUnit extends Unit implements Walkable, Swimable{

    public AquaUnit(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + "수중 유닛이 잠수를 시작합니다.");
    }

    @Override
    public void attack() {
        System.out.println(name + "이 수중 공격을 시작합니다.");
    }

    @Override
    public void walk() {
        System.out.println(name + " 수중 유닛이 걷기 시작합니다.");
    }
}
