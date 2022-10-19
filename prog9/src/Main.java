import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayListOper oper = new ArrayListOper();
        System.out.println("Enter the num of colors");
        int n  = s.nextInt();
        s.nextLine();
        System.out.println("Enter colors one by one");
        for(int i = 0;i<n;i++) oper.addele(s.nextLine());

        String[] arr = oper.copytoArr();
        System.out.println("To arrayed array is");
        for (String str : arr) System.out.print(str + " ");
        System.out.println();

        System.out.println("The reversed list is \n"+oper.rev());

        System.out.println("The sorted list is \n"+oper.sortt());

        int sI,eI;
        System.out.println("Enter start index and end index off sublist you want to get");
        sI = s.nextInt();
        eI = s.nextInt();
        System.out.println("The subList of the given array from "+sI+" to "+eI+" index is\n"+oper.sublist(sI, eI));

        System.out.println("The cloned list is\n"+oper.clone());
    }
}