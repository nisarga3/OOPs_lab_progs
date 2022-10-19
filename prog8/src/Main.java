import java.util.Scanner;
import static java.lang.System.exit;
public class Main {
    public static void main(String[] args){
        PerformOperation isOdd=(int n)-> n%2!=0;
        PerformOperation isPrime=(int n)->
        {
            for(int i=2;i<Math.sqrt(n);i++)
            {
                if(n%i==0) return false;
            }
            return true;
        };
        PerformOperation isPalindrome=(int n)->
        {
            String str=String.valueOf(n);
            StringBuilder st=new StringBuilder(str);
            st.reverse();
            String rev=st.toString();
            return rev.equals(str);
        };
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
        System.out.println("Enter your choice\n\t1.To check Odd/even\n\t2.To check Prime/Composite\n\t3.To check if the number is palindrome\n\t4-Exit");
        ch=sc.nextInt();
        System.out.println("Enter the number");
        int num=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println(isOdd.operation(num)?"Odd":"Even");
                break;
            case 2:
                System.out.println(isPrime.operation(num)?"Prime":"Composite");
                break;
            case 3:
                System.out.println(isPalindrome.operation(num)?"Palindrome":"Not palindrome");
            default:
                exit(0);
        }}while(ch!=4);


    }
}