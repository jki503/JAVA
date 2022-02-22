package practice.basicjava.abstractandinterface;

public class AbstractPractice {

    public static void main(String[] args) {

        AquaUnit aquaUnit = new AquaUnit("잠수함");

        aquaUnit.move();
        aquaUnit.attack();
        aquaUnit.walk();
        aquaUnit.swim();

        System.out.println();

        FlyUnit flyUnit = new FlyUnit("전투기");
        flyUnit.move();
        flyUnit.attack();
        flyUnit.walk();
        flyUnit.fly();

        System.out.println();

        LandUnit landUnit = new LandUnit("탱크");
        landUnit.move();;
        landUnit.attack();
        landUnit.walk();

    }
}
