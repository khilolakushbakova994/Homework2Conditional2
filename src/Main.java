public class Main {
    public static void main(String[] args) {
        // Task Number 1
        System.out.println("Task Number 1\n");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("становите версию приложения для Android по ссылке\n");
        }
        // Task Number 2
        System.out.println("Task Number 2\n");
        int clientDeviceYear = 2015;
        int clientOs = 0;
        if (clientDeviceYear >= 2015 && clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке\n");
        } else if (clientDeviceYear < 2015 && clientOs == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOs == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        }

        System.out.println("Task Number 3\n");

        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("год является високосным");
        } else if (year % 100 != 0) {
            System.out.println("год является невисокосным\n");
        }
        System.out.println("Task Number 4\n");

        int deliveryDistance = 95;
        if (deliveryDistance == 20) {
            System.out.println("Потребуется 1 день на доставку");
        } else if (deliveryDistance > 20 && deliveryDistance == 60) {
            System.out.println("Потребуется 2 дня на доставку");
        } else if (deliveryDistance > 60 && deliveryDistance <= 80) {
            System.out.println("Потребуется 3 дня на доставку");
        }else if (deliveryDistance >80 && deliveryDistance <= 100) {
            System.out.println("Потребуется 4 дня на доставку\n");
        }
        System.out.println("Task Number 5\n");

        int monthNumber = 3;
        switch (monthNumber){
            case 1:
                System.out.println("Декабрь");
                break;
            case 2:
                System.out.println("Январь");
                break;
            case  3:
                System.out.println("Февраль");
                System.out.println("Зима");
                break;
            case 4:
                System.out.println("Март");
                break;
            case 5:
                System.out.println("Апрель");
                break;
            case 6:
                System.out.println("Май");
                System.out.println("Весна");
                break;
            case 7:
                System.out.println("Июнь");
                break;
            case 8:
                System.out.println("Июль");
                break;
            case 9:
                System.out.println("Август");
                System.out.println("Лето");
                break;
            case 10:
                System.out.println("Сентябрь");
                break;
            case 11:
                System.out.println("Октябрь");
                break;
            case 12:
                System.out.println("Ноябрь");
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }

        }
    }







