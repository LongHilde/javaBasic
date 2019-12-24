package homework_12_24;
//按要求编写一个Java应用程序：
//（1）定义一个类，描述一个矩形，包含有长、宽两种属性和计算面积方法。
//（2）编写一个类，继承自矩形类，同时该类描述长方体，
// 具有长、宽、高属性和计算体积的方法。
//（3）编写一个测试类，对以上两个类进行测试，
// 创建一个长方体，定义其长、宽、高，输出其底面积和体积。
public class Rectangle {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void area(){
        int area = length * width;
        System.out.println("面积为："+area);
    }
}
