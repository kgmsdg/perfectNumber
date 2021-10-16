import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, bolen = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                bolen += i;
            }
        }
        if (bolen == number){
            System.out.println(number + " Mükemmel bir sayıdır.");
        }else {
            System.out.println(number + " Mükemmel bir sayı değildir.");
        }
    }
}

