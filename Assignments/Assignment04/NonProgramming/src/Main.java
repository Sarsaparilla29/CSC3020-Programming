import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.print("Enter SSN: ");
        String s = input.nextLine();
        System.out.println(s.matches("\\d{3}-\\d{2}-\\d{4}"));*/
        String regTest1 = "ac";
        System.out.println(regTest1.matches("ab*c"));
        String regTest2 = "abc";
        System.out.println(regTest2.matches("ab+c"));
        String regTest3 = "ac";
        System.out.println(regTest3.matches("ab?c"));
        String regTest4 = "abbbbc";
        System.out.println(regTest4.matches("ab{0,3}c"));
        String regTest5 = "blue";
        System.out.println(regTest5.matches("red|blue"));
        String regTest6 = "0123456789";
        System.out.println("6. " + regTest6.matches("[0-9]"));
        String regTest7 = "ABCDEFGHIJ";
        System.out.println("7. " + regTest7.matches("^[a-zA-Z0-9]*$"));
        String year1 = "21";
        String year2 = "2021";
        String year3 = "021";
        System.out.println("8. " + year3.matches("\\d{2}|\\d{4}"));

    }
}
