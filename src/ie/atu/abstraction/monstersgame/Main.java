package ie.atu.abstraction.monstersgame;

public class Main {
    public static void main(String[] args) {
        FlyingMonster flyingMonster = new FlyingMonster();
        flyingMonster.roar();
        flyingMonster.fly();

        SpeedyMonster speedyMonster = new SpeedyMonster();
        speedyMonster.roar();
        speedyMonster.runFast();

        SuperMonster superMonster = new SuperMonster();
        superMonster.roar();
        superMonster.fly();
        superMonster.runFast();
    }
}
