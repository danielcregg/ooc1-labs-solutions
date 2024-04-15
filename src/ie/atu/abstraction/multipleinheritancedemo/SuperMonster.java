package ie.atu.abstraction.multipleinheritancedemo;

class SuperMonster extends Monster implements Flyable, SuperSpeed {
    public void fly() {
        System.out.println("Flying high in the sky like a super monster does!");
    }

    public void runFast() {
        System.out.println("Running at super speed like a super monster does!");
    }
}
