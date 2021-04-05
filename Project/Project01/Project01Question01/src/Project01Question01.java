import java.util.Scanner;
public class Project01Question01 {
    public static boolean isConsecutiveFour(int[][] values) {
        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j < values[i].length; j++) {
                // check right because checking left goes over already visited values
                if(checkRight(values, i, j)) {
                    System.out.println("Horizontal Match: (" + i + "," + j + ")");
                    return true;
                }
                // check down so as to decrease time
                else if (checkDown(values, i , j)) {
                    System.out.println("Vertical Match: (" + i + "," + j + ")");
                    return true;
                }
                else if (checkDiagonalLeft(values, i , j)) {
                    System.out.println("Diagonal Left Match: (" + i + "," + j + ")");
                    return true;
                }
                else if (checkDiagonalRight(values, i , j)) {
                    System.out.println("Diagonal Right Match: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Sorry, there is no match...");
        return false;
    }
    static boolean checkRight(int[][] values, int row, int column) {
        // check if there can be 4 to the left
        if (column + 3 <= values[row].length) {
            // check possible positions
            if (values[row][column] == values[row][column+1] &&
                    values[row][column] == values[row][column+2] &&
                    values[row][column] == values[row][column+3]) {
                // consecutive four pattern is found
                return true;
            }
            else
                // pattern not found
                return false;
        }
        else {
            // out of bounds
            return false;
        }
    }
    static boolean checkDown(int[][] values, int row, int column) {
        // check if there can be 4 down
        if (row + 3 < values.length) {
            // check possible positions
            if (values[row][column] == values[row+1][column] &&
                    values[row][column] == values[row+2][column] &&
                    values[row][column] == values[row+3][column]) {
                // consecutive four has been found
                return true;
            }
            else
                // consecutive four not found
                return false;
        }
        else {
            // out of bounds
            return false;
        }
    }
    static boolean checkDiagonalLeft(int[][] values, int row, int column) {
        // check if there can be 4 diagonal left
        if (row + 3 <= values.length && column - 3 >= 0) {
            // check possible positions
            if (values[row][column] == values[row+1][column-1] &&
                    values[row][column] == values[row+2][column-2] &&
                    values[row][column] == values[row+3][column-3]) {
                // consecutive four has been found
                return true;
            }
            else
                // no consecutive four
                return false;
        }
        else {
            // out of bounds
            return false;
        }
    }
    static boolean checkDiagonalRight(int[][] values, int row, int column) {
        // check if there can be 4 diagonal right
        if (row + 3 <= values.length && column + 3 <= values[row].length) {
            // check possible positions
            if (values[row][column] == values[row+1][column+1] &&
                    values[row][column] == values[row+2][column+2] &&
                    values[row][column] == values[row+3][column+3]) {
                // consecutive four has been found
                return true;
            }
            else
                // no pattern has been found
                return false;
        }
        else {
            // out of bounds
            return false;
        }
    }
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);

        // enter number of rows
        int numRows;
        System.out.print("Enter number of rows: ");
        numRows = input.nextInt();
        input.nextLine(); // clear input

        // enter number of columns
        int numColumns;
        System.out.print("Enter number of columns: ");
        numColumns = input.nextInt();
        input.nextLine(); // clear input

        int[][] values = new int[numRows][numColumns];
        // loop through and enter values in array
        for(int i = 0; i < values.length; i++) {
            //System.out.print("Enter values for row " + i + ": ");
            for(int j = 0; j < values[i].length; j++) {
                System.out.print("(" + i + "," + j + ") = "); // (i,j) = user input
                values[i][j] = input.nextInt(); // insert value
                input.nextLine(); // clear input
                //System.out.print(values[i][j] + " "); // testing
            }
            System.out.println();
        }

        // print 2d matrix
        for(int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
        // call function to check if there are four consecutive values
        boolean answer = isConsecutiveFour(values);
        System.out.println(answer);
    }
}
