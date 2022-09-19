import java.util.Scanner;

public class RyabovJava {
    private final String HI = "Привет";
    private final String EMPTY = "";
    private final String NAME = "Вячеслав";
    private final String HI_NAME = "Привет, Вячеслав";
    private final String INCORRECT_NAME = "Нет такого имени";
    private final static String INPUT_NUM = "Введите число: ";
    private final static String INPUT_NAME = "Введите имя: ";
    private final String LENGTH_ARRAY = "Введите длину массива: ";
    private final String INPUT_ARRAY = "Введите массив: ";
    private final String RESULT = "элементы массива кратные 3: ";

    public static void main(String[] args) {
        RyabovJava test = new RyabovJava();
        Scanner scanner = new Scanner(System.in);

        System.out.print(INPUT_NUM);
        int num = Integer.parseInt(scanner.nextLine());
        test.inputNumber(num);

        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();
        test.inputString(name);

        test.arrayElements(test.inputArray());
    }

    private void inputNumber(int num) {
        System.out.println(num > 7 ? HI : EMPTY);
    }

    private void inputString(String name) {
        System.out.println(name.equalsIgnoreCase(NAME) ? HI_NAME : INCORRECT_NAME);
    }

    private void arrayElements(int[] arr) {
        System.out.print(RESULT);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(LENGTH_ARRAY);
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        System.out.println(INPUT_ARRAY);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }
}
