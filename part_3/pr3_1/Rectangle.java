//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_3.pr3_1;
class Rectangle extends GeometricObject{
    double width;
    double height;
    public Rectangle() {
    }
    public Rectangle(double w,double h) {
        width = w;
        height = h;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        System.out.print("Area of Rectangle is ");
        return width*height;
    }
    public double getPerimeter() {
        System.out.print("Perimeter of Rectangle is ");
        return 2*(height+width);
    }
    public String toString() {
        System.out.print("Width & Height of Rectangle is ");
        return width + " & " + height ;
    }
}
