import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c') {
                return counter++;
            }
            else if (str.charAt(i) == 'b'){
                return counter++;
            }
            else if (str.charAt(i) == 'a'){
                return counter++;
            }
        }

        return counter;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String THE = "the";
        if (str.toLowerCase().indexOf(THE.toLowerCase()) != -1) {
            return true;
        }
        else{
            return false;
        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int b = 0, a = str.length() - 1; 
        while (b < a ){
            if (str.charAt(b) != str.charAt(a))
                return false;
            a--;
            b++;

        }
        
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Any sentence or phrase: ");
        String abc = scan.nextLine();
        System.out.println(countABC(abc));
        System.out.print("Any sentence or phrase: ");
        String the = scan.nextLine();
        System.out.println(containsThe(the));
        System.out.print("A word: ");
        String palindrome = scan.nextLine();
        System.out.println(isPalindrome(palindrome));


    }
}
