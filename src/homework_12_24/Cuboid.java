package homework_12_24;

public class Cuboid extends Rectangle {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void bulk(){
        System.out.println("体积为：" + getLength() * getWidth() * height);
    }
}
