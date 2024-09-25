package org.example;

import java.util.Scanner;

public class Inform {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите личный код: ");
        String Code = scanner.nextLine();

        char cent = Code.charAt(0);
        String century = "";

        switch (cent) {
            case '1':
                century = "18";
                break;
            case '2':
                century = "18";
                break;
            case '3':
                century = "19";
                break;
            case '4':
                century = "19";
                break;
            case '5':
                century = "20";
                break;
            case '6':
                century = "20";
                break;
            default:
                System.out.println("Неверный личный код.");
                scanner.close();
                return;
        }

        String year = century + Code.substring(1, 3);
        String month = Code.substring(3, 5);
        String day = Code.substring(5, 7);

        String monthName = "";
        switch (month) {
            case "01": monthName = "января"; break;
            case "02": monthName = "февраля"; break;
            case "03": monthName = "марта"; break;
            case "04": monthName = "апреля"; break;
            case "05": monthName = "мая"; break;
            case "06": monthName = "июня"; break;
            case "07": monthName = "июля"; break;
            case "08": monthName = "августа"; break;
            case "09": monthName = "сентября"; break;
            case "10": monthName = "октября"; break;
            case "11": monthName = "ноября"; break;
            case "12": monthName = "декабря"; break;
            default:
                System.out.println("Неверный месяц.");
                return;
        }
        System.out.println(firstName + " " + lastName + " родился " + day + " " + monthName + " " + year + " года.");

        scanner.close();
    }
}
