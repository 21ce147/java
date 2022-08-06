package practical_2_1;
public class Circle {
    private double radius;
    public Circle() {
        radius = 1;
    }
    public Circle (double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 22*radius*radius/7;
    }
    public double getPerimeter(){
        return 2*22*radius/7;
    }
}

