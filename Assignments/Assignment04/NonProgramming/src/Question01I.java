public class Question01I {
    public static void main(String[] args) {
        String s = "Welcome to Java";
        System.out.println(s);
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        s = str.toString();
        System.out.println(s);
    }
}
