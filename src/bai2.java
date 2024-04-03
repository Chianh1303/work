import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        double vnđ = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tiền vào đây");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Gía trị VNĐ" + quydoi);
    }
}
