import java.util.Scanner;

public class seminar2 {
    public static void main(String[] args) {
        inputSring();
    }

    /*
     * Реализуйте метод, который запрашивает у пользователя ввод 
     * дробного числа (типа float), и возвращает введенное значение. 
     * Ввод текста вместо числа не должно приводить к падению 
     * приложения, вместо этого, необходимо повторно запросить 
     * у пользователя ввод данных.
     */
    public static float inputNumber() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите число:");
            float num = in.nextFloat();
            System.out.println(num);
            return num;
        } catch (Exception e) {
            System.out.println("Вводить только числа!");
            inputNumber();
            return 0;
        }
    }

    public static void task2() {
        int[] intArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 7};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
    /*
     * Тут вроде все в порядке, можно добавить перехват на выход за границы массива
     */

    // public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    //     System.out.println(a + b);
    //  }

    // public static void task3() {
    //     try {
    //         int a = 90;
    //         int b = 3;
    //         System.out.println(a / b);
    //         printSum(23, 234);
    //         int[] abc = { 1, 2 };
    //         abc[3] = 9;
    //     } catch (Throwable ex) {
    //         System.out.println("Что-то пошло не так...");
    //     } catch (NullPointerException ex) {
    //         System.out.println("Указатель не может указывать на null!");
    //     } catch (IndexOutOfBoundsException ex) {
    //         System.out.println("Массив выходит за пределы своего размера!");
    //     }
    // }
    /*
     * 1. NullPointerException и IndexOutOfBoundsException не будет обрабатываться т.к.
     * блок Throwable является суперклассом всех ошибок, по идее его можно испольнять
     * в самом конце
     * 2. printSum не может быть исключением FileNotFoundException поскольку данный метод не работает
     * с файлами и данное исключение уже есть в Java.
     */
    public static void inputSring(){
        System.out.println("Введите текст:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if (str.isEmpty()) {
            throw new IllegalArgumentException("String is empty");
        } else {
            System.out.println(str);
        }
    }
}
