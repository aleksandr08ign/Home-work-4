public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }


    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int a = 10; a >= 0; a--) {
            System.out.println(a);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int b = 2; b <= 17; b = b + 2) {
            System.out.println(b);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int c = 10; c >= -10; c = c - 1) {
            System.out.println(c);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int d = 1904; d <= 2096; d = d + 4) {
            System.out.println(d + " год является високосным.");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int g = 1; g <= 512; g = g * 2) {
            System.out.println(g);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int savings = 29000;
        int total = 0;
        for (int h = 1; h <= 12; h++) {
            total = total + savings;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + total);
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int savings9 = 29000;
        int total9 = 0;
        for (int h9 = 1; h9 <= 12; h9++) {
            total9 = total9 + total9 / 100;
            total9 = total9 + savings9;
            System.out.println("Месяц " + h9 + ", сумма накоплений равна " + total9);
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int x = 1; x <= 10; x++) {
            System.out.println("2 * " + x + " = " + 2 * x);
        }
    }
}

