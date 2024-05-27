import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Maaş Hesaplama Programı ===");

        System.out.print("Maaşınızı giriniz (TL):");
        double salary = scanner.nextDouble();
        System.out.print("Aylık çalıştığınız gün sayısını giriniz:");
        int day = scanner.nextInt();

        if (day<25){
            double dailySalary = salary / 25;
            double x = dailySalary * day;
            System.out.println("Bu ayki kazancınız:" + x + " TL");
        }
        else if (day==25) {
            System.out.println("Bu ayki kazancınız:" + salary + " TL");
        }
        else {
            double extraDay = day-25;
            double y = salary + (extraDay * 1000);
            System.out.println("Bu ayki kazancınız:" + y + " TL");
        }
    }
}