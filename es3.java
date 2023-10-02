public class es3 {
    public static void main(String[] args) {

        System.out.println(perimetroRettangolo(2.6, 3.4));
        System.out.println(equalControl(7));
        System.out.println(perimetroTriangolo(2, 3, 4));
    }


    public static double perimetroRettangolo(double b, double h) {
        return (b + h) * 2;
    }

    public static int equalControl(int b) {
        return b % 2 == 0 ? 0 : 1;
    }

    public static double perimetroTriangolo(double l1, double l2, double l3) {
        return (l1 + l2 + l3) / 2;
    }
}

