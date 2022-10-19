import java.util.*;

public class str {
    Scanner sc=new Scanner(System.in);
    void part1()
    {
        System.out.println("To print the Penultimate word");
        System.out.println("Enter the sentence: ");
        String stri=sc.nextLine();
        String[] words=stri.split(" ",0);
        System.out.println(words[words.length-2]);
    }
    void part2()
    {
        System.out.println("To Replace the string word");
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        a=a.replace("java","temp");
        a=a.replace("python","java");
        a=a.replace("temp","python");
        System.out.println(a);
    }
    void part3()
    {
        System.out.println("Substrings");
        System.out.println("Enter a string:");
        String a=sc.nextLine();
        System.out.println("Enter the character delimiter");
        String charr = sc.next();
        String[] arr=a.split(charr,0);
        for(String x:arr) System.out.print(x+"\n");
    }

}
