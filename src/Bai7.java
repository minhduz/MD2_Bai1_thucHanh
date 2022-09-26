import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight(kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height(m): ");
        double height = scanner.nextDouble();
        double BMI = weight / (height*height);
        if (BMI < 18.5){
            System.out.println("Underweight");
        } else if (BMI < 25.0){
            System.out.println("Normal");
        } else if (BMI < 30.0){
            System.out.println("Overweight");
        } else{
            System.out.println("Obese");
        }
    }
}
