import java.util.Scanner;

public class TestAccount {
    //Scanner input = new Scanner(System.in);
    public static void mainMenu(Account[] obj, int ID) {
        // create scanner
        Scanner input = new Scanner(System.in);
        // main menu options
        boolean exit = false;
        //Account obj;// = //new Account();

        while(!exit) {
            // menu options
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            // prompt for user choice
            System.out.print("Enter a choice: ");
            int choice = input.nextInt();
            input.nextLine(); // clear input


            if (choice == 1) {
                System.out.println("The balance is " + obj[ID].getBalance());
                System.out.println(); // for spacing
            }
            else if (choice == 2)
                obj[ID].withdraw();
            else if (choice == 3)
                obj[ID].deposit();
            else if (choice == 4) {
                exit = true; // allow user to exit
                System.out.println(); // for spacing
            }
        }
    }
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);
        // prompt for id
        Account[] aObj = new Account[10];
        for(int i = 0; i < 10; i++) {
            aObj[i] = new Account(i, 100);
        }
        //System.out.println("testing balance" + aObj[1].getBalance());
        boolean stop = false;
        boolean correct = false;
        while (!stop) {
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            input.nextLine();
            //System.out.println("testing balance" + aObj[1].getBalance());
            System.out.println(); // for spacing
            if(id >= 0 || id <= 9)
                mainMenu(aObj, id);
            else
                System.out.println("enter a correct id");
        }

    }
}
