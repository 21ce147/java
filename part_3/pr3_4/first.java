//21CE147_UMAT_VISHVDIP
//https://github.com/21ce147/java.git
package part_3.pr3_4;
public class first {
    int a;
    public void one(){
        System.out.println("This is a one of class first");
    }
    public void two(){
        System.out.println("This is a two of class first");
    }
}
class second extends first{
    @Override
    public void one(){
        System.out.println("This is a one of class second, which is being override");
    }
    public void two(){
        System.out.println("This is two of class second, which is being override");
    }
}

