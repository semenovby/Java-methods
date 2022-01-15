import java.util.Scanner;
public class method {
    public static void main(String[] args) {
    readNumber();
    }
    static void fail(){
        System.out.println("ОШИБКА! Вы ввели неправильное число, попробуй еще раз!");
    }
    static void inputText(){
        System.out.println("Введите число в диапазоне от 10 до 100:");
    }
    static int readNumber(){

        Scanner scanner = new Scanner(System.in);
        inputText();
        int varFirst = scanner.nextInt();
        while (varFirst <= 10 | varFirst >= 100){
            fail();
            varFirst = scanner.nextInt();
        }
        System.out.println("ОТЛИЧНО! ПЕРВОЕ число равно: " + varFirst);

        inputText();
        int varSecond = scanner.nextInt();
        while (varSecond <= 10 | varSecond >= 100){
            fail();
            varSecond = scanner.nextInt();
        }
        System.out.println("ОТЛИЧНО! ВТОРОЕ число равно: " + varSecond);

        inputText();
        int varThird = scanner.nextInt();
        while (varThird <= 10 | varThird >= 100){
            fail();
            varThird = scanner.nextInt();
        }
        System.out.println("ОТЛИЧНО! ТРЕТЬЕ число равно: " + varThird);
        scanner.close();

        int result = varFirst * varSecond * varThird;
        System.out.println("Результат произведения введенных чисел равен: " + result);
        return varFirst * varSecond * varThird;
    }
}


