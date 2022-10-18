import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of Objects");
        int n=sc.nextInt();
        Student[] stu=new Student[n];
        College[] col=new College[n];
        Employee[] emp=new Employee[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Student"+(i+1));
            System.out.print("\tEnter the USN: ");
            String usn= sc.next();
            System.out.print("\tEnter the Name: ");
            String name= sc.next();
            System.out.print("\tEnter the Address: ");
            Address addr= askinput();
            stu[i]=new Student(usn,name,addr);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("College"+i+1);
            System.out.print("\tEnter the Name: ");
            String name= sc.next();
            System.out.print("\tEnter the Address: ");
            Address addr= askinput();
            col[i]=new College(name,addr);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Employee"+i+1);
            System.out.print("\tEnter the EmpID: ");
            String empi= sc.next();
            System.out.print("\tEnter the Name: ");
            String name= sc.next();
            System.out.print("\tEnter the Address: ");
            Address addr= askinput();
            emp[i]=new Employee(empi,name,addr);
        }
        System.out.println("Student Details");
        System.out.println("   USN\tName\tAddress");
        System.out.println("\t\t\t\tStreetnum\tCity\tState\tCountry");
        for(int i=0;i<n;i++)
        {
            System.out.print((i+1)+") ");
            stu[i].displaystud(stu[i].addr);
        }
        System.out.println();

        System.out.println("College Details");
        System.out.println("   Name\tAddress");
        System.out.println("\t\t\t\tStreetnum\tCity\tState\tCountry");
        for(int i=0;i<n;i++)
        {
            System.out.print((i+1)+") ");
            col[i].displaycol(col[i].addr);
        }
        System.out.println();

        System.out.println("Employee Details");
        System.out.println("   EmpID\tName\tAddress");
        System.out.println("\t\t\t\tStreetnum\tCity\tState\tCountry");
        for(int i=0;i<n;i++)
        {
            System.out.print((i+1)+") ");
            emp[i].displayemp(emp[i].addr);
        }
        System.out.println();
    }
    static Address askinput()
    {
        Scanner sc= new Scanner(System.in);

            System.out.print("\tEnter the street number: ");
            int sn = sc.nextInt();
            System.out.print("\tEnter the city: ");
            String c = sc.next();
            System.out.print("\tEnter the state: ");
            String s = sc.next();
            System.out.print("\tEnter the country: ");
            String co = sc.next();
            Address add = new Address(sn, c, s, co);
            return add;

    }
}