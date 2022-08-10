public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int clientOs = 1;
        if (clientOs == 1) {

            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }


    }

    public static void jobe2() {
        System.out.println("Задание 2");
    }

    {
        int clientOs = 0;
        int clientDeviceYear = 2015;
        if (clientOs == 0) {

            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите  версию приложения для iOS по ссылке");
            }

        if (clientDeviceYear <2015)  {
            System.out.println("Установите облегченную версию приложения для Андроид по ссылке");}
        } else {
        System.out.println("Установите  версию приложения для Андроид по ссылке");}
    }
}