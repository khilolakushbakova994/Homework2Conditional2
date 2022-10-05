public class Main {
    public static void main(String[] args) {
        // Task Number 1
        System.out.println("Task Number 1\n");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else {
            System.out.println("становите версию приложения для Android по ссылке\n");
        }
        // Task Number 2
        System.out.println("Task Number 2\n");
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
            if (clientDeviceYear < 2015 && clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                if (clientDeviceYear >= 2015 && clientOS == 0) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для IOS по ссылке");
                    if (clientDeviceYear < 2015 && clientOS == 0) {
                        System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                    } else {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
                    }
                    //
                    // Task Number 3
                    System.out.println("Task Number 3\n");


                }
            }
        }
    }
}
