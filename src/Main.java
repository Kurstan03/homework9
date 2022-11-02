public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.a = 6;
        triangle.b = 7;
        triangle.c = 9;
        System.out.println("Уч бурчтук а b c: ");
        System.out.printf("a = %d\nb = %d\nc = %d",triangle.a,triangle.b,triangle.c);
        System.out.println();
        System.out.println("\nS = "+triangle.area());
    }
}