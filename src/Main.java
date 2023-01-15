import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = inputAttempts();
        dayOfWeek(num);
        numberType(num);
    }

    public static void numberType(int num) {
        System.out.print(num + " - ");
        if(num >= 0 && num <= 9) {
            System.out.println("Одиничне");
        }
        else if(num >= 10 && num <= 99) {
            System.out.println("Десятки");
        }
        else if(num >= 100 && num <= 999) {
            System.out.println("Сотні");
        }
        else if(num >= 1000 && num <= 9999) {
            System.out.println("Тисячі");
        }
        else if(num >= 10000 && num <= 99999) {
            System.out.println("Десятки тисяч");
        }
        else {
            System.out.println("Невідомий тип");
        }
    }

    public static void dayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1 -> {
                System.out.println("Понеділок");
            }
            case 2 -> {
                System.out.println("Вівторок");
            }
            case 3 -> {
                System.out.println("Середа");
            }
            case 4 -> {
                System.out.println("Четвер");
            }
            case 5 -> {
                System.out.println("П'ятниця");
            }
            case 6 -> {
                System.out.println("Субота");
            }
            case 7 -> {
                System.out.println("Неділя");
            }
            default -> {
                System.out.println(dayNumber + " - неправильний номер дня тижня");
            }
        }
    }

    public static int inputAttempts() {
        int attempts = 3;
        int dayNumber;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введіть номер дня тижня(1-7): ");
            dayNumber = sc.nextInt();
            if(dayNumber <= 7 && dayNumber >= 1) break;
            else {
                attempts--;
                System.out.println("Некоректне значення! Кількість спроб: " + attempts);
            }
            dayNumber = 0;
        } while(attempts != 0);
        if(attempts == 0) {
            System.out.println("Кількість спроб вичерпана");
            return 666;                                                        // Повернення числа 666 в якості помилки
        }
        return dayNumber;
    }
}
