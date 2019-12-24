package homework_12_24;
// 写一个Java应用程序，
// 主要是体现父类子类间的继承关系。
// 父类：鸟，子类：麻雀、鸵鸟、鹰。
// 子类继承父类的一些特点，如都是鸟的话就都会有翅膀、两条腿等，
// 但它们各自又有各自的特点，
// 如麻雀的年龄、体重；鸵鸟的身高、奔跑速度；鹰的捕食、飞翔高度等。
public class Bird {
    private int wing;
    private int leg;

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    public void fly(){
        System.out.println("fly");
    }
    public void extremity(){
        System.out.println("翅膀："+getWing()+",腿："+getLeg());
    }
}
