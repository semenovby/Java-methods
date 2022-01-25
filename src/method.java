import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        int firstNumber = readNumber();
        int secondNumber = readNumber();
        int thirdNumber = readNumber();
        int result = firstNumber * secondNumber * thirdNumber;
        System.out.println("Результат произведения введенных чисел равен: " + result);
    }

    static int readNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в диапазоне от 10 до 100:");
        int inputNumber = scanner.nextInt();
        while (inputNumber <= 10 | inputNumber >= 100) {
            System.out.println("ОШИБКА! Вы ввели неправильное число, попробуй еще раз!");
            inputNumber = scanner.nextInt();
        }
        scanner.close();
        System.out.println("ОТЛИЧНО!Вы ввели число: " + inputNumber);
        return (inputNumber);
    }
}


