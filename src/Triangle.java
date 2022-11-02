public class Triangle {
    int a;
    int b;
    int c;

    public float area(){
        int p = (a + b + c)/2;
        int s = p * (p - a) * (p - b) * (p - c);
        return (float) Math.sqrt(s);
    }
}
