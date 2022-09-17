//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_3.pr3_1;
public class TestGeometricObject {
    public static void main(String[] args)
    {
        GeometricObject a = new Circle(10);
        GeometricObject b = new Rectangle(20,30);
        System.out.println(a);
        System.out.println(b + "\n");
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter() + "\n");
        System.out.println(b.getArea());
        System.out.println(b.getPerimeter());

    }
}
