package Game;

import java.util.Random;

class MyWeapon implements weapon {

    private int curPower;
    private Random random;

    public MyWeapon() {
        random = new Random();
    }

    @Override
    public void fire(int power) {
        this.curPower -= power;
    }

    @Override
    public int getRestPower() {
        return this.curPower;
    }

    @Override
    public int charge(int power) {
        return this.curPower += power;
    }

    public boolean Success() {
        return random.nextBoolean();
    }

    public boolean chargeSuccess() {
        return random.nextBoolean();
    }
}
