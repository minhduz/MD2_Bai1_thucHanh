import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.printf("%d là năm nhuận",year);
                } else {
                    System.out.printf("%d không phải năm nhuận",year);
                }
            } else {
                System.out.printf("%d là năm nhuận",year);
            }
        }  else {
            System.out.printf("%d không phải năm nhuận",year);
        }
    }
}
