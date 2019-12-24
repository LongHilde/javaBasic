package homework_12_24;

public class Ostrich extends Bird {
    private int height;
    private int speed;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public void fly() {
        System.out.println("can not fly");
    }

    @Override
    public void extremity() {
        System.out.println("翅膀："+getWing()+",腿："+getLeg());
    }
}
