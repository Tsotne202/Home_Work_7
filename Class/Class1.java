package Class;
import java.util.*;
import Interface.Interface1;

public class Class1 implements Interface1 {

    @Override
    public void method1(){
        String input;
        StringBuilder revInput= new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        input = in.nextLine();
        int len = input.length();
        for(int i = len - 1; i >= 0; i--)
            revInput.append(input.charAt(i));
        if (input.equals(revInput.toString()))
            System.out.println("It's a Palindrome");
        else
            System.out.println("It's not a Palindrome");

    }
}