import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 3 числа ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a % 5 == 0) {
            System.out.println("a = " + a);
        }
        if (b % 5 == 0) {
            System.out.println("b = " + b);
        }
        if (c % 5 == 0) {
            System.out.println("c = " + c);
        }
        int result1 = a / b;
        System.out.println("Результат целочисленного деления a на b: " + result1);
        double result2 = (double) a / b;
        System.out.println("Результат деления a на b: " + result2);
        int result3 = (int)Math.ceil ((double)a / b);
        System.out.println("Результат деления a на b с округлением в большую сторону: " + result3);
        int result4 = (int)Math.floor (a / b);
        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + result4);
        int result5 = Math.round (a / b);
        System.out.println("Результат деления a на b с математическим округлением: " + result5);
        int result6 = b % c;
        System.out.println("Остаток от деления b на c: " + result6);
        int result7 = Math.min(a, b);
        System.out.println("Наименьшее значение из a и b: " + result7);
        int result8 = Math.max(b, c);
        System.out.println("Наибольшее значение из b и c: " + result8);
        in.close();
    }
}
