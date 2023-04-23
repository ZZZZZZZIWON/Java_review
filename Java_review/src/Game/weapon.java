package Game;

interface weapon {
    void fire(int power);

    int getRestPower();

    int charge(int power);
}