public class Main {
    public static void main(String[] args) {
     System.out.println( "УСЛОВНЫЕ ОПЕРАТОРЫ");}
     public static void jobe1() {
     System.out.println("Задание 1");

        int clientOs = 1;
        int  Yos =0;
        if (clientOs == 1 ) {

            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (Yos == 0) {
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

            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
            }
        } else {
            System.out.println("Установите  версию приложения для Андроид по ссылке");
        }
    }

    public static void jobe3() {
        System.out.println("Задание 3");


        int year = 2021;
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0 ) {
            System.out.println(year + " ВИСОКОСНЫЙ ГОД ");
        } else {

            System.out.println( year + " НЕ ВИСОКОСНЫЙ");

        }
        }
    public static void jobe4() {
        System.out.println("Задание 4");
       int delaveryDistance = 95;
       int delaveryDays = 1;


       if (delaveryDistance > 20);{
           delaveryDays++;
        }
        if (delaveryDistance > 60) {
            delaveryDays++;
        }
        System.out.println("Потребуется дней" + delaveryDays);
        }

    public static void jobe5() {
        System.out.println("Задание 5");

     int monthNumber = 12;
         switch (monthNumber) {


        case 12:
        case 1:
        case 2:
            System.out.println(" Зима ");
            break;

            case 3:
          case 4:
          case 5:
            System.out.println(" Весна ");
            break;

          case 6:
          case 7:
          case 8:

            System.out.println(" Лето ");
            break;

          case 9:
          case 10:
          case 11:

            System.out.println(" Осень ");
            break;

          default:
              System.out.println("Некорректный месяц" + monthNumber);

    }}







}