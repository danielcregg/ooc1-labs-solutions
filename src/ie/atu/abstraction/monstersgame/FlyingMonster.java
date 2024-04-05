package ie.atu.abstraction.monstersgame;

class FlyingMonster extends Monster implements Flyable {
    public void fly() {
        System.out.println("Flying high in the sky!");
    }
}
