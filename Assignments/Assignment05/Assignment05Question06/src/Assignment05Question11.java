import java.util.*;
public class Assignment05Question11 {
    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> arr = list1;
        for(int i = 0; i < 5; i++) {
            arr.add(list2.get(i));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<Integer>(5);
        System.out.print("Enter five integers for list1: ");
        for(int i = 0; i < 5; i++) {
            arr1.add(input.nextInt());
            //input.nextLine();
        }
        ArrayList<Integer> arr2 = new ArrayList<Integer>(5);
        System.out.print("Enter five integers for list2: ");
        for(int i = 0; i < 5; i++) {
            arr2.add(input.nextInt());
            //input.nextLine();
        }
        ArrayList<Integer> finalArr = union(arr1, arr2);
        System.out.print("The combined list is");
        for(int i = 0; i < finalArr.size(); i++) {
            System.out.print(" " + finalArr.get(i));
        }
    }
}
