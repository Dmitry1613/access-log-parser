import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите 1-ое целое число: ");
        int number_1 = new Scanner(System.in).nextInt();
        System.out.println("Введите 2-ое целое число: ");
        int number_2 = new Scanner(System.in).nextInt();

        System.out.println("Результат сложения чисел " + "\"" + number_1 + "\"" + " и " + "\"" + number_2 + "\"" + " = " + sum(number_1, number_2));

        System.out.println("Результат вычитания чисел " + "\"" + number_1 + "\"" + " и " + "\"" + number_2 + "\"" + " = " + sub(number_1, number_2));

        System.out.println("Результат умножения чисел " + "\"" + number_1 + "\"" + " и " + "\"" + number_2 + "\"" + " = " + multi(number_1, number_2));

        System.out.println("Результат деления чисел " + "\"" + number_1 + "\"" + " и " + "\"" + number_2 + "\"" + " = " + quotient(number_1, number_2));
    }

    public static int sum(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int sub(int x, int y) {
        int sub = x - y;
        return sub;
    }

    public static int multi(int x, int y) {
        int multi = x * y;
        return multi;
    }

    public static double quotient(int x, int y) {
        double quotient = (double)x / (double)y;
        return quotient;
    }
}
