import java.util.Scanner;
public class solidrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times : ");
        int n = sc.nextInt();
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n;j++) {
                
                System.out.print("*"+" ");
            }
            System.out.println("*");
        }
        sc.close();
    }
}
