import java.util.*;
public class wildcard{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input= sc.nextLine();

    int position = Position(input);
    if (position != -1) {
        System.out.println("The wildcard character '@' is located at position " + position);
    } else {
        System.out.println("The wildcard character '@' is not found in the string.");
    }


}
public static int Position(String input) {
    for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) == '@') {
            return i;
        }
    }
    return -1; 
}
}