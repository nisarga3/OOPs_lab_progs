import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the complex number 1");
        cmplx c1=askinput();
        System.out.println("Enter the complex number 2");
        cmplx c2=askinput();
        System.out.println("Enter the complex number 3");
        cmplx c3=askinput();

        c1.display();
        c2.display();
        c3.display();

        System.out.print("sum= ");
        cmplx ans1=new cmplx();
        ans1=ans1.add(c1,c2);
        ans1.display();
        System.out.print("sum3= ");
        cmplx ans2=new cmplx();
        ans2=ans2.add(c1,c2,c3);
        ans2.display();
        System.out.print("diff= ");
        cmplx ans3=new cmplx();
        ans3=ans3.sub(c1,c2);
        ans3.display();

    }
    public static cmplx askinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\tEnter the real part: ");
            int real= sc.nextInt();
            System.out.print("\tEnter the img part: ");
            int img= sc.nextInt();
            cmplx c=new cmplx(real,img);
            return c;
    }
}