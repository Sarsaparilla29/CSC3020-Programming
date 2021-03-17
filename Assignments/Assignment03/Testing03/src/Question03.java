public class Question03 {
    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        System.out.println("t1's i = " + t1.i + " and j = " + t1.j);
        System.out.println("t2's i = " + t2.i + " and j = " + t2.j);
    }

    /*public static void swap(T t) {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
        //System.out.println("n1 = " + n1 + " n2 = " + n2);
    }*/
}

class T {
    static int i = 1;
    int j = 1;
    T() {
        i++;
        j = 1;
    }
}