/*
* Реализуйте 3 метода, чтобы в каждом из них 
получить разные исключения
* Посмотрите на код, и подумайте сколько разных типов 
исключений вы тут сможете получить? 
public static int sum2d(String[][] arr){ 
    int sum = 0; 
    for (int i = 0; i < arr.length; i++) { 
        for (int j = 0; j < 5; j++) { 
            int val = Integer.parseInt(arr[i][j]); 
            sum += val; } 
        } return sum; 
    }
* Реализуйте метод, принимающий в качестве аргументов 
два целочисленных массива, и возвращающий новый массив, 
каждый элемент которого равен частному элементов 
двух входящих массивов в той же ячейке. Если длины массивов 
не равны, необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, 
которое пользователь может увидеть - RuntimeException
 */

public class seminar1 {
    public static void main(String[] args) {
        // первое задание

        //System.out.println(divisionByZero(10, 0));
        //int[] arr = new int[10];
        //System.out.println(wrongArrayLength(arr, 12));
        //notNullPrint(null);

        
    }

    public static int divisionByZero(int a1, int a2) {
        if (a2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return a1/a2;
    }
    public static int[] wrongArrayLength(int[] arr, int index) {
        if (index > arr.length-1) {
            throw new ArrayIndexOutOfBoundsException("Такого индекса нет в массиве");
        }
        arr[index] = 10;
        return arr;
    }
    public static void notNullPrint(String s) {
        if (s == null) {
            throw new NullPointerException("текст, не Null");
        }
        System.out.println("Inside method print: " + s);
    }

    // второе задание
    public static int sum2d(String[][] arr){ 
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < 5; j++) { 
                int val = Integer.parseInt(arr[i][j]); 
                sum += val; } 
            } return sum; 
        }
        /*
         * 1. Исключение, если во входных данных будет символ 
         * вместо цифры
         * 2. Исключение ArrayIndexOutOfBoundsExseption, если мы выдим за границы массива
         * 3. Исключение ArithmeticException, если деление на ноль будет
         */
    
    // третье задание
    public static float[] quotientOfArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        float[] quotientOfArray = new float[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            quotientOfArray[i] = arr1[i]/arr2[i];
        } 
        return quotientOfArray;
    }
}