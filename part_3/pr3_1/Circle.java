//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_3.pr3_1;
public class Circle extends GeometricObject {
    private double radius;
    public Circle() {

    }
    public Circle(double r) {
        setRadius(r);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getDiameter() {
        return getRadius() /2;
    }

    public double getArea() {
        System.out.print("Area of Circle is ");
        return 3.14* getRadius() * getRadius();
    }
    public double getPerimeter() {
        System.out.print("Perimeter of Circle is ");
        return 2*3.14* getRadius();
    }
    public String toString() {
        System.out.print("radius of Circle is ");
        return getRadius() + " " ;
    }
}