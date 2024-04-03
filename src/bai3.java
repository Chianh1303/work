import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Điểm chuyên cần: ");
        System.out.print("Điểm thi học kỳ: ");
        System.out.print("Điểm kiểm tra: ");

        double diemKiemTra = scanner.nextDouble();
        double diemThi = scanner.nextDouble();
        double diemChuyenCan = scanner.nextDouble();

        double diemTrungBinh = (diemChuyenCan + diemKiemTra + diemThi) / 3;
        String xepLoai = "";

        if (diemTrungBinh >= 8.5) {
            xepLoai = "A";
        } else if (diemTrungBinh >= 7 && diemTrungBinh < 8.5) {
            xepLoai = "B";
        } else if (diemTrungBinh >= 5.5 && diemTrungBinh < 7) {
            xepLoai = "C";
        } else if (diemTrungBinh >= 4 && diemTrungBinh < 5.5) {
            xepLoai = "D";
        } else {
            xepLoai = "F";
        }

        System.out.println("Xếp loại điểm của sinh viên là: " + xepLoai);
    }
}