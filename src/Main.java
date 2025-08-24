
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        byte clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Не можем определить вашу операционную систему");
        }

        System.out.println("Задание 2");
        byte clientOsSecondCase = 0;
        short clientDeviceYear = 2015;
        if (clientOsSecondCase == 0 && clientDeviceYear == 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOsSecondCase == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOsSecondCase == 1 && clientDeviceYear == 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOsSecondCase == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Не можем определить вашу операционную систему");
        }

        System.out.println("Задание 3");
        short year = 2021;
        if (year < 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Задание 4");
        short deliveryDistance = 95;
        boolean oneDayDelivery = deliveryDistance < 20;
        boolean twoDayDelivery = deliveryDistance >= 20 && deliveryDistance < 60;
        boolean threeDayDelivery = deliveryDistance >= 60 && deliveryDistance <= 100;
        boolean noDelivery = deliveryDistance > 100;
        if (oneDayDelivery) {
            System.out.println("Потребуется дней для доставки: 1");
        } else if (twoDayDelivery) {
            System.out.println("Потребуется дней для доставки: 2");
        } else if (threeDayDelivery) {
            System.out.println("Потребуется дней для доставки: 3");
        } else if (noDelivery) {
            System.out.println("На такое расстояние доставка недоступна");
        }

        System.out.println("Задание 5");
        byte monthNumber = 12;
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Введите корректный номер месяца");
        }
        switch (monthNumber){
            case 1:
                System.out.println("Январь, сезон: зима");
                break;
            case 2:
                System.out.println("Февраль, сезон: зима");
                break;
            case 3:
                System.out.println("Март, сезон: весна");
                break;
            case 4:
                System.out.println("Апрель, сезон: весна");
                break;
            case 5:
                System.out.println("Май, сезон: весна");
                break;
            case 6:
                System.out.println("Июнь, сезон: лето");
                break;
            case 7:
                System.out.println("Июль, сезон: лето");
                break;
            case 8:
                System.out.println("Август, сезон: лето");
                break;
            case 9:
                System.out.println("Сентябрь, сезон осень");
                break;
            case 10:
                System.out.println("Октябрь, сезон осень");
                break;
            case 11:
                System.out.println("Ноябрь, сезон осень");
                break;
            case 12:
                System.out.println("Декабрь, сезон зима");
                break;
        }
    }
}