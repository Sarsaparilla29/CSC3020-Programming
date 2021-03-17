public class Assignment03Question06 {
    public static void main(String[] args) {
        MyInteger mainObj = new MyInteger(4);

        System.out.println("getValue() = " + mainObj.getValue()); // test out getValue()
        System.out.println("isEven() = " + mainObj.isEven()); // test out isEven()
        System.out.println("isOdd() = " + mainObj.isOdd()); // test out isOdd()
        System.out.println("isPrime() = " + mainObj.isPrime()); // test isPrime()
        System.out.println("isEven(int v) = " + mainObj.isEven(17));
        System.out.println("isOdd(int v) = " + mainObj.isOdd(23));
        System.out.println("isPrime(int v) = " + mainObj.isPrime(47));
        System.out.println("isEven(MyInteger eObj) = " + mainObj.isEven(82));
        System.out.println("isOdd(MyInteger oObj) = " + mainObj.isOdd(64));
        System.out.println("isPrime(MyInteger eObj) = " + mainObj.isPrime(6));

        System.out.println("equals(int v) = " + mainObj.equals(7));
        MyInteger obj2 = new MyInteger(5);
        System.out.println("equals(MyInteger eqObj) = " + mainObj.equals(obj2));
        char[] arr = {'1','2','3','4','5'};
        System.out.println("parseInt(char[] arr) = " + mainObj.parseInt(arr));
        System.out.println("parseInt(String str) = " + mainObj.parseInt("12345"));
    }
}

class MyInteger {
    int value;
    MyInteger(int v) {
        value = v;
        //miObj.value = v;
    }
    int getValue() {
        return this.value;
    }
    // ()
    boolean isEven() {
        return (value%2 == 0);
    }
    boolean isOdd() {
        return (value%2 == 1);
    }
    boolean isPrime() {
        for(int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }
    // static (int)
    static boolean isEven(int v) {
        return (v%2 == 0);
    }
    static boolean isOdd(int v) {
        return (v%2 == 1);
    }
    static boolean isPrime(int v) {
        for(int i = 2; i <= Math.sqrt(v); i++) { // start at 2 as 2 is first prime
            if(v % i == 0) // number would be even which is not prime
                return false;
        }
        return true;
    }
    // static (MyInteger)
    static boolean isEven(MyInteger eObj) {
        return (eObj.isEven());
    }
    static boolean isOdd(MyInteger oObj) {
        return (oObj.isOdd());
    }
    static boolean isPrime(MyInteger pObj) {
        return (pObj.isPrime());
    }
    // equal statements
    boolean equals(int v) {
        return (value == v);
    }
    boolean equals(MyInteger eqObj) {
       return (value == eqObj.getValue());
    }
    // conversion to array
    static int parseInt(char[] arr) {
        int newValue = 0;
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            //newValue = newValue + (arr[i] * (Math.pow()));
        }
        for(int i = 0; i < newArr.length; i++) {
            newArr[i] = newArr[i] - 48;
        }
        /*for(int i = 0; i < newArr.length; i++)
            System.out.println(newArr[i]);*/
        int ac = 0;
        for(int i = newArr.length - 1; i >= 0; i--) {
            newValue = newValue + (newArr[i] * (int)(Math.pow(10,ac)));
            //System.out.println((int)(Math.pow(10,ac)));
            //System.out.println(newValue);
            ac = ac + 1;
        }
        return newValue;
    }
    static int parseInt(String Str) {
        int newValue = 0;
        int[] newArr = new int[Str.length()];
        for(int i = 0; i < Str.length(); i++) {
            newArr[i] = Str.charAt(i);
            newArr[i] = newArr[i] - 48;
            //System.out.println(newArr[i]);
        }
        int ac = 0;
        for(int i = newArr.length - 1; i >= 0; i--) {
            newValue = newValue + (newArr[i] * ((int)Math.pow(10,ac)));
            ac = ac + 1;
        }

        return newValue;
    }

}
