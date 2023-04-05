package java作业;
import java.util.Scanner;
public class 检测素数 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + "不是素数");
                break;
            }
        }
        if (n==i){
            System.out.println(n+"是素数");

        }
    }
}
