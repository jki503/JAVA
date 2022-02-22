package practice.basicjava.abstractandinterface;

public class LandUnit extends Unit implements Walkable{

    public LandUnit(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "이 지상 공격을 시작합니다.");
    }

    @Override
    public void walk() {
        System.out.println(name + " 지상 유닛이 걷기 시작합니다.");
    }
}
