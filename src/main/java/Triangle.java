public class Triangle {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 9;

        int p = (a + b + c) / 2;
        int S = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь" + "=" + S);
    }
}

