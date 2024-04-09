package ie.atu.abstraction.multipleinheritancedemo;

class FlyingMonster extends Monster implements Flyable {
    public void fly() {
        System.out.println("Flying high in the sky!");
    }
}
