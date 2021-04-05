public class Test {
    public static void main(String[] args) {
        Apple a = new Apple();
        System.out.println(a);
        System.out.println("---------------");

        GoldenDelicious g = new GoldenDelicious(7);
        System.out.println(g);
        System.out.println("---------------");

        Apple c = new GoldenDelicious(8);
        System.out.println(c);
    }
}

class Apple {
    double weight;

    public Apple() {
        this(1);
        System.out.println("Apple no-arg constructor");
    }

    public Apple(double weight) {
        this.weight = weight;
        System.out.println("Apple constructor with weight");
    }

    @Override
    public String toString() {
        return "Apple: " + weight;
    }
}

class GoldenDelicious extends Apple {
    public GoldenDelicious() {
        this(5);
        System.out.println("GoldenDelicious non-arg constructor");
    }

    public GoldenDelicious(double weight) {
        super(weight);
        this.weight = weight;
        System.out.println("GoldenDelicious constructor with weight");
    }

    @Override
    public String toString() {
        return "GoldenDelicious: " + weight;
    }
}
