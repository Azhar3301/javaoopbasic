public class IT24031{
    public static void main(String[] args) {
        // Each pair of arguments represents brand and color.
        Vehicle c1 = new Vehicle(args[0], args[1]);
        c1.start();
        System.out.println();
        Vehicle c2 = new Vehicle(args[2], args[3]);
        c2.start();
    }
}