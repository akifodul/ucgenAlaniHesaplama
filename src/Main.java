import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, alan, u;

        System.out.print("Üçgenin ilk kenarını girin: ");
        a = input.nextDouble();

        System.out.print("Üçgenin ikinci kenarını girin: ");
        b = input.nextDouble();

        System.out.print("Üçgenin üçüncü kenarını girin: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan);
    }
}




