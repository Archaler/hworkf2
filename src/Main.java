public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задание 1");
        int deposit = 15000;
        int total = 0;
        int month = 1;

        while(total <= 2_459_000) {
            total = total+ total/100;
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }

    }
    public static void task2() {
        System.out.println("Zadanie 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;

        }
        System.out.println("");
        for (int a = 10; a >= 1; a--) {
            System.out.print(a +" ");
        }
        System.out.println();

    }
    public static void task3() {
        System.out.println("Zadanie 3");
        int totalHuman = 12_000_000;
        float populationAdd = 17 / 1000;
        float populationDead = 8 / 1000;

        for (int years = 1; years <= 10; years++) {
            totalHuman = (int) (totalHuman + (populationAdd * totalHuman) - (populationDead * totalHuman));
            System.out.println("Год " + years + ", численность населения составляет " + totalHuman);
        }
    }
    public static void task4() {
            System.out.println("Zadanie 4");
            int deposit = 15_000;
            int totalNeed = 12_000_000;
            int month = 1;

            while (deposit <totalNeed) {
                deposit = (deposit + deposit * 7/100);
                month++;
                if (month % 6    == 0) {
                    System.out.println("Месяц " + month + " Собралось " + deposit);
                }
            }
        }
        public static void task6() {
            System.out.println("Zadanie 6");
            int depositVasiliy = 15_000;
            int total = 0;

            for (int month = 1; month <=108; month++) {
                total += depositVasiliy + total * 7/100;
                if (month % 6 == 0) {
                    System.out.println("За " + month + " месяцев накопилось " + total);
                }
            }
        }
        public static void task7() {
            System.out.println("Zadanie 7");
            for (int friday = 5; friday <=31; friday += 7) {

                    System.out.println("Сегодня пятница," + friday + " -е число. Необходимо подготовить отчет");

            }
        }
        public static void task8() {
            System.out.println("Zadanie 8");
            int years = 1822;
            for (; years <= 2122; years +=79) {
                System.out.println(years + " упадет мне на голову");
            }
        }
    }

