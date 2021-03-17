public class F {
    int i;
    static String s;

    void imethod() {
        F f = new F();
        System.out.println(f.i);
        //System.out.println(F.i);
    }
    static void smethod() {
        F f = new F();
        System.out.println(f.s);
        System.out.println(F.s);
    }
    public static void main(String[] args) {
        F f = new F();
        //F.imethod();
        f.imethod();
        F.smethod();
        f.smethod();
    }
}
