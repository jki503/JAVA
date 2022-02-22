package practice.basicjava.inheritance;

public class InherPratice {
    public static void main(String[] args) {

        Wizard wizard = new Wizard("인민영웅", "마법사");

        wizard.move();
        wizard.basicAttack();
        wizard.teleport();
        wizard.magicAttack();

    }
}
