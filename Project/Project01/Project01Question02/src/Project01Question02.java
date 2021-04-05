import java.util.Scanner;
public class Project01Question02 {
    public static void mainMenu(int ID) {
        // create scanner
        Scanner input = new Scanner(System.in);
        // main menu options
        boolean exit = false;
        Account obj = new Account();
        obj.setId(ID);
        while(exit == false) {
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            // prompt for user choice
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();
            input.nextLine();


            if (choice == 1) {
                System.out.println("The balance is " + obj.getBalance());
                System.out.println(); // for spacing
            }
            else if (choice == 2)
                obj.withdraw();
            else if (choice == 3)
                obj.deposit();
            else if (choice == 4) {
                exit = true;
                System.out.println(); // for spacing
            }
        }
    }
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);
        // prompt for id
        Account aObj = new Account();
        boolean stop = false;
        while (stop == false) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            System.out.println(); // for spacing
            input.nextLine();
            mainMenu(id);
        }

    }
}
