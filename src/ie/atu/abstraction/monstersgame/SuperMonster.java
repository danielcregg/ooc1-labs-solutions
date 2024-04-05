package ie.atu.abstraction.monstersgame;

class SuperMonster extends Monster implements Flyable, SuperSpeed {
    public void fly() {
        System.out.println("Flying high in the sky!");
    }

    public void runFast() {
        System.out.println("Running at super speed!");
    }
}
