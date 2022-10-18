import java.util.Scanner;

public class Main {

    public static boolean isEqual(Cylinder cyl1,Cylinder cyl2)
    {
        if(cyl1.getArea()==cyl2.getArea() && cyl1.getVolume()==cyl2.getVolume() && cyl1.color==cyl2.color)
            return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Cylinder 1 dimensions:");
        System.out.print("Enter the radius:");
        double r1=sc.nextDouble();
        System.out.print("Enter the height:");
        double h1=sc.nextDouble();
        System.out.print("Enter the color number 1.Blue 2.Green:");
        int c1=sc.nextInt();
        Cylinder cyl1=new Cylinder(h1,r1,c1);

        System.out.println("Enter the Cylinder 2 dimensions:");
        System.out.print("Enter the radius:");
        double r2=sc.nextDouble();
        System.out.print("Enter the height:");
        double h2=sc.nextDouble();
        System.out.print("Enter the color number 1.Blue 2.Green:");
        int c2=sc.nextInt();
        Cylinder cyl2=new Cylinder(h2,r2,c2);

        if(isEqual(cyl1,cyl2)) System.out.println("The given cylinders are similar.");
        else
            System.out.println("The given cylinders are different.");
    }
}