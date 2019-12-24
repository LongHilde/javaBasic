package homework_12_24;

public class Spadger extends Bird {
    private int age;
    private int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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
