package com.company;

public class Main {

    /*Задание 1: Создать пустой проект в IntelliJ IDEA и прописать метод main().*/

    public static void main(String[] args) {
	/*Задание 2: Создать переменные всех пройденных типов данных и инициализировать их значения.*/

        byte val1 = -120;
        short val2 = 12442;
        int val3 = 1000;
        long val4 = 200000L;
        float val5 = 12.23f;
        double val6 = -123.123;
        char val7 = '*';
        char val8 = '\u2242';
        boolean val9 = false;

    /*Задание 3:Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
                где a, b, c, d – аргументы этого метода, имеющие тип float.*/


        float rezult1 = function1(10.5f,20.5f,30.5f,2.5f);
        System.out.println("Результат выражения 'a * (b + (c / d))' будет равен: " + rezult1);

    /*Задание 4:Написать метод, принимающий на вход два целых числа и проверяющий,
                что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
                в противном случае – false.*/

        int rezult2 = function2(10,5);

    /*Задание 5:Написать метод, которому в качестве параметра передается целое число,
                метод должен напечатать в консоль, положительное ли число передали или отрицательное.
                Замечание: ноль считаем положительным числом.*/

        int rezult3 = function3(4);

    /*Задание 6:Написать метод, которому в качестве параметра передается целое число.
                Метод должен вернуть true, если число отрицательное,
                и вернуть false если положительное.*/

        int rezult4 = function4(-10);

    /*Задание 7:Написать метод, которому в качестве параметра передается строка, обозначающая имя.
                Метод должен вывести в консоль сообщение «Привет, указанное_имя!».*/
        printMyText("Denis");

    /*Задание 8:Написать метод, который определяет, является ли год високосным,
                и выводит сообщение в консоль. Каждый 4-й год является високосным,
                кроме каждого 100-го, при этом каждый 400-й – високосный.*/

        int rezult5 = function5(2000);

    }

    public static float function1(float a, float b, float c, float d){
        float rezult = a * (b + (c / d));
        return rezult;
    }

    public static int function2(int a, int b) {
       int c = a + b;
        if (c >= 10 & c <= 20) {

            System.out.println("Результат выражения суммы двух чисел будет равен: " + c + "\n"
                    + "Условие выполняется, ответ: true");
        } else {

            System.out.println("Результат выражения суммы двух чисел будет равен: " + c + "\n"
                    + "Условие не выполняется, ответ: false");
        }
        return c;
    }


    public static int function3(int a){
        if (a >= 0){
            System.out.println("Число: " + a + "  - положительное");
        }else{
            System.out.println("Число: " + a + "  - отрицательное");
        }
        return a;
    }

    public static int function4(int a){
        if (a >= 0){
            System.out.println("Число: " + a + "  - положительное " + " Ответ: false");
        }else{
            System.out.println("Число: " + a + "  - отрицательное " + " Ответ: true");
        }
        return a;
    }

    public static void printMyText(String txtToPrint){
        System.out.println("Привет, " + txtToPrint + "!");
    }

    public static int function5(int a) {
        if ((a % 4) == 0 & (a % 100) != 0 ||(a % 400) == 0) {
            System.out.println("Год: " + a + "  - високосный ");
        } else {
            System.out.println("Год: " + a + "  - не високосный ");
        }
        return a;
    }



    }

