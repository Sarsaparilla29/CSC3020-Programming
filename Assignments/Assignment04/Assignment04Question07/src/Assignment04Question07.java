public class Assignment04Question07 {
    public static void main(String[] args) {
        String s = "Welcome to Java";
        MyString2 ms2 = new MyString2(s);
        String n = ms2.getArray();
        System.out.println("Testing: " + n);
        ms2 = ms2.substring(4);
        System.out.println("Testing substring: " + ms2.getArray());
        ms2 = ms2.toUpperCase();
        System.out.println("Testing toUpperCase: " + ms2.getArray());
        boolean val = false;
        ms2 = ms2.valueOf(val);
        System.out.println("Testing valueOf: " + ms2.getArray());
    }
}

class MyString2 {
    char[] arr;
    public MyString2(String s) { //constructor
        //MyString2 obj;
        arr = new char[s.length()];
        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
    }
    public String getArray() { //return the data field as a String.
        String newString = new String(arr);
        return newString;
    }
    public MyString2 substring(int begin) { //create a new string starts at begin and return it.
        MyString2 obj;// = new MyString2();
        char[] tempArr = new char[arr.length - begin];
        for(int i = 0; i < tempArr.length; i++) {
            tempArr[i] = arr[begin + i];
        }
        arr = tempArr;
        //MyString2 newS = new MyString2(tempArr); // change to MyString2 to String
        obj = new MyString2(getArray());
        return obj;
    }
	public MyString2 toUpperCase() { //convert all characters in a string to uppercase and return it.
        MyString2 upperCase;
        char[] tempArr = new char[arr.length];
        //System.out.print("Testing array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 97; j < 122; j++) {
                if (arr[i] == (char)j || arr[i] == (char)j - 32) {
                    int upper = j - 32;
                    tempArr[i] = (char)upper;
                }
                else if (arr[i] == ' ') { // check for spaces ' '
                    tempArr[i] = arr[i];
                }
            }
            //System.out.print(tempArr[i]);
        }
        //System.out.println();
        arr = tempArr;
        //String newS = new String(tempArr);
        upperCase = new MyString2(getArray());
        return upperCase;
    } // 65 - 90
	public static MyString2 valueOf(boolean b) {
        // convert b value to string and return it.
        //Do not use any method from String (you can use length),
        //StringBuilder, or StringBuffer
        MyString2[] bArr = new MyString2[5];
        //String bool = " ";
        //boolean tempB = b;
        char[] newArr;
        MyString2 value;
        //StringBuilder str = new StringBuilder();
        if (b == false) {
            bArr = new MyString2[5];
            /*newArr = new char[5];
            newArr[0] = 'f';
            newArr[1] = 'a';
            newArr[2] = 'l';
            newArr[3] = 's';
            newArr[4] = 'e';*/
            bArr[0] = new MyString2("f");
            bArr[1] = new MyString2("a");
            bArr[2] = new MyString2("l");
            bArr[3] = new MyString2("s");
            bArr[4] = new MyString2("e");
            value = new MyString2(bArr[0].getArray() + bArr[1].getArray() +
                    bArr[2].getArray() + bArr[3].getArray() + bArr[4].getArray());
            return value;
        }
        else{
            bArr = new MyString2[4];
            bArr[0] = new MyString2("t");
            bArr[1] = new MyString2("r");
            bArr[2] = new MyString2("u");
            bArr[3] = new MyString2("e");
            /*newArr = new char[4];
            newArr[0] = 't';
            newArr[1] = 'r';
            newArr[2] = 'u';
            newArr[3] = 'e';*/
            value = new MyString2(bArr[0].getArray() + bArr[1].getArray() + bArr[2].getArray() + bArr[3].getArray());
            return value;
        }
        //StringBuilder newS = new StringBuilder(str);
        //value =
        //return value;
        //return value;
    }

}