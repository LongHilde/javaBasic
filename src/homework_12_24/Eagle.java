package homework_12_24;

public class Eagle extends Bird {
    private boolean prey;
    private int flyingheight;

    public boolean isPrey() {
        return prey;
    }

    public void setPrey(boolean prey) {
        this.prey = prey;
    }

    public int getFlyingheight() {
        return flyingheight;
    }

    public void setFlyingheight(int flyingheight) {
        this.flyingheight = flyingheight;
    }
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void extremity() {
        System.out.println("翅膀："+getWing()+",腿："+getLeg());
    }
}
