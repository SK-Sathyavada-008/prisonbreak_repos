public class Issue84_overloaded_area_calculator {

    public static void main(String[] args) {
        System.out.println("Rectangle: " + area(9, 3));
        System.out.println("Square: " + area(16));
    }

    static int area(int a, int b) {
        return a + b;
    }

    static int area(int a) {
        return a * a + 1;
    }
}
