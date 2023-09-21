import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(findSquare(3, 2));

        System.out.println(getMonthAndSeason(5));

        System.out.println(caesarEncryption("Amir", 5));

        Scanner scnr = new Scanner(System.in);
        System.out.println("Введите 5 чисел:");
        int n1 = scnr.nextInt();
        int n2 = scnr.nextInt();
        int n3 = scnr.nextInt();
        int n4 = scnr.nextInt();
        int n5 = scnr.nextInt();
        minAndMax(n1, n2, n3, n4, n5);

        System.out.println(getCorrectAge(21));
        System.out.println(getCorrectAge(12));
        System.out.println(getCorrectAge(2));
    }

    public static double findSquare(int a, int h) {
        return 0.5 * a * h;
    }

    public static String getMonthAndSeason(int n) {
        HashMap<Integer, String> monthsAndSeasons = new HashMap<>();
        monthsAndSeasons.put(1, "Январь - Зима");
        monthsAndSeasons.put(2, "Февраль - Зима");
        monthsAndSeasons.put(3, "Март - Весна");
        monthsAndSeasons.put(4, "Апрель - Весна");
        monthsAndSeasons.put(5, "Май - Весна");
        monthsAndSeasons.put(6, "Июнь - Лето");
        monthsAndSeasons.put(7, "Июль - Лето");
        monthsAndSeasons.put(8, "Август - Лето");
        monthsAndSeasons.put(9, "Сентябрь - Осень");
        monthsAndSeasons.put(10, "Октябрь - Осень");
        monthsAndSeasons.put(11, "Ноябрь - Осень");
        monthsAndSeasons.put(12, "Декабрь - Зима");
        return monthsAndSeasons.get(n);
    }

    public static String caesarEncryption(String word, int secretKey) {
        String encryptedWord = "";
        for (int i = 0; i < word.length(); i++) {
            encryptedWord += (char) (((int) word.charAt(i)) - secretKey);
        }
        return encryptedWord;
    }

    public static void minAndMax(int n1, int n2, int n3, int n4, int n5) {
        int array[] = new int[]{n1, n2, n3, n4, n5};
        // Вызов метода getMax () для получения максимального значения
        int max = getMax(array);
        System.out.println("Максимальное число: " + max);

        // Вызов метода getMin () для получения минимального значения
        int min = getMin(array);
        System.out.println("Минимальное число: " + min);
    }

    //здесь находим максимум
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // здесь находим минимум
    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static String getCorrectAge(int age){
        if (10 < age && age < 15) return age + " лет";
        else if (0 < age % 10 && age % 10 < 5) {
            if (age % 10 == 1) return + age + " год";
            else return age + " года";
        }else return age + " лет";
    }
}

