import java.util.Scanner;

public class CalcNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        long sumN = 0;
        long sumSqrt = 0;
        long sumEven = 0;
        long sumTwoDigit = 0;

        for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
            sumSqrt = sumSqrt + i * i;
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            }
        }

        for (int i = 10; i < 99; i++) {
            sumTwoDigit = sumTwoDigit + i;
        }

        System.out.println("Сумма первых n натуральных чисел: " + sumN);
        System.out.println("Сумма квадратов первых n натуральных чисел: " + sumSqrt);
        System.out.println("Сумма всех чётных чисел в диапазоне от 1 до n: " + sumEven);
        System.out.println("Сумма всех двузначных чисел: " + sumTwoDigit);
    }
}