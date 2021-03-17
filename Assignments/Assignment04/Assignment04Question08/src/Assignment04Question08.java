public class Assignment04Question08 {
    public static void main(String[] args) {
        MyStringBuilder2 msb2;
        msb2 = new MyStringBuilder2("Hello, World!");
        System.out.println("String: " + msb2.getChar());
        System.out.println("Size: " + msb2.getSize());
        System.out.println("Capacity: " + msb2.getCapacity());
        MyStringBuilder2 msbSub = msb2.substring(3,8);
        System.out.println("Substring: " + msbSub.getChar());
        MyStringBuilder2 msb = new MyStringBuilder2(" Welcome to Java");
        msb2 = msb2.append(msb);
        System.out.println("Append: " + msb2.getChar());
        System.out.println("Size: " + msb2.getSize());
        System.out.println("Capacity: " + msb2.getCapacity());
    }
}

class MyStringBuilder2 {
    char[] arr;
    int size;
    int capacity;
    public MyStringBuilder2(String s) { // constructor (1 points)
        arr = new char[s.length()];
        capacity = s.length();
        size = s.length();
        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
    }
    public void increaseCapacity(MyStringBuilder2 s) {
        char[] tempArr = new char[arr.length + s.size];
        System.out.print("Increase Capacity: ");
        for(int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
            System.out.print(tempArr[i]);
        }
        System.out.println();
        capacity = tempArr.length;
        size = arr.length;
        arr = tempArr;
        //return arr;
    }
    public MyStringBuilder2 append(MyStringBuilder2 s) {
        // ; a method that takes s object and add s array of characters
        // to this array of characters, then returns this.  (3 points)
        MyStringBuilder2 app;
        //capacity = arr.length + s.size;
        increaseCapacity(s);
        //System.out.println(getCapacity());
        //System.out.println(getSize());
        char[] tempArr = arr;
        /*for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }*/
        for(int i = 0; i < s.size; i++) {
            tempArr[size + i] = s.arr[i];
            //System.out.print(getChar());
        }
        //System.out.println();
        arr = tempArr;
        capacity = arr.length;

        //System.out.println(arr[7]);
        app = new MyStringBuilder2(getChar());
        return app;
    }
    public MyStringBuilder2 substring(int begin, int end) { // (3 points)
        MyStringBuilder2 obj;
        char[] subArr = new char[end - begin];
        for(int i = 0; i < end - begin; i++) {
            subArr[i] = arr[begin + i];
        }

        obj = new MyStringBuilder2(getChar());
        obj.capacity = end - begin;
        obj.size = end - begin;
        obj.arr = subArr;
        return obj;
    }
    // Accessors methods that return the size, the capacity, and the array of characters as a string. (3 points)
    //  Do not use any method from String (you can use length), StringBuilder, or StringBuffer
    public int getSize() {
        return size;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getChar() {
        String newS = new String(arr);
        return newS;
    }

}