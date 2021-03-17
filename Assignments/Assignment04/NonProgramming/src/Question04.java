public class Question04 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("HTML");
        System.out.println("a." + s1.append(" is fun"));
        System.out.println("b." + s1.append(s2));
        System.out.println("c." + s1.insert(3, "is fun"));
        System.out.println("d." + s1.insert(2, s2));
        System.out.println("e." + s1.charAt(2));
        System.out.println("f." + s1.length());
        System.out.println("g." + s1.deleteCharAt(3));
        System.out.println("h." + s1.delete(1, 3));
        System.out.println("i." + s1.reverse());
        System.out.println("j." + s1.replace(1, 3, "Computer"));
        System.out.println("k." + s1.substring(1, 3));
        System.out.println("l." + s1.substring(1));

    }
}
