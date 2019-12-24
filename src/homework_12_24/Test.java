package homework_12_24;

public class Test {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.setLength(100);
        cuboid.setWidth(100);
        cuboid.setHeight(100);
        cuboid.area();
        cuboid.bulk();




        Bird bird = new Bird();
        bird.setWing(2);
        bird.setLeg(2);
        bird.fly();
        bird.extremity();
        Bird spa = new Spadger();
        spa.fly();
        spa.extremity();
        Bird ost = new Ostrich();
        ost.fly();
        ost.extremity();
        Bird eag = new Eagle();
        eag.fly();
        eag.extremity();
    }
}
