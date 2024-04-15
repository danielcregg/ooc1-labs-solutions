package ie.atu.abstraction.multipleinheritancedemo;

class SpeedyMonster extends Monster implements SuperSpeed {
    public void runFast() {
        System.out.println("Running at super speed like a speedy monster does!");
    }
}
