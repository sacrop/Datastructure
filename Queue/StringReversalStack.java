import java.util.Scanner;
import java.util.Stack;

public class StringReversalStack {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string for palindrome check");
        String palind=scan.nextLine();
        String s="";
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<palind.length();i++){
            stk.push(palind.charAt(i));
        }
        for(int i=0;i<palind.length();i++){
            
            s=s+stk.pop();
        }
        if(s.equals(palind))System.out.println("it is a palindrome");
        else{
            System.out.println("it is not");
        }
    }
}
