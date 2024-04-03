import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Nhập số:");
        switch(n/10) {
            case 1: System.out.println("Ten"); break;
            case 2:
                System.out.println("Twenty"); break;
            case 3:
                System.out.println("thirty"); break;
            case 4:
                System.out.println("forty"); break;
            case 5:
                System.out.println("fifty"); break;
            case 6:
                System.out.println("sixty"); break;
            case 7:
                System.out.println("seventy"); break;
            case 8:
                System.out.println("eighty"); break;
            case 9:
                System.out.println("ninety"); break;
        }
        switch (n%10)
        {
            case 0:
                System.out.println(".");
            case 1: System.out.println("One"); break;
            case 2:
                System.out.println("Two"); break;
            case 3:
                System.out.println("three"); break;
            case 4:
                System.out.println("for"); break;
            case 5:
                System.out.println("five"); break;
            case 6:
                System.out.println("six"); break;
            case 7:
                System.out.println("seven"); break;
            case 8:
                System.out.println("eight"); break;
            case 9:
                System.out.println("nine"); break;
        }
    }
}
