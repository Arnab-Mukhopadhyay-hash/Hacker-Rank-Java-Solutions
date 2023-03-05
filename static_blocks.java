import java.util.Scanner;

public class static_blocks {
    public static boolean flag = true;
    public static int B;
    public static int H;
    static {
        // why to use this block honestly I don't even know
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        ;
        scan.close();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }
}
