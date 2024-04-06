import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");

        int[] expense = {13561, 27505, 23056, 31080, 17000};
        int sum = 0;

        for (int i = 0; i < expense.length; i++) {
            sum = sum + expense[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        //Задача 2
        System.out.println("Задача 2");

        int minExpense = 50000;
        int maxExpense = -1;

        for (final int current : expense) {
            if (current > maxExpense) {
                maxExpense = current;
            }
        }

        for (final int current : expense) {
            if (current < minExpense) {
                minExpense = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей." +
                "Максимальная сумма трат за неделю составила " + maxExpense + " рублей");


        //Задача 3
        System.out.println("Задача 3");

        double mediumExpense = (double) sum / expense.length;
        System.out.println("Средняя сумма трат за месяц составила " + mediumExpense + " рублей");


        //Задача 4
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}