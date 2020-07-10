package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //перегрузка функций
        OverloadFunction sumOfNumber = new OverloadFunction();
        sumOfNumber.out();





        //Абстрактные классы
        Geometric_Figure square = new Square_Figure(); //создаем переменную square абстрактного класса Geometric_Figure,
        // но разрешение переменной указываем !!!не родительского класса Geometric_Figure!!!, !!!а дочернего Square_Figure!!!
        square.draw_Figure();//вызов фенкции которая нарисует наш квадрат





        //Анонимные классы и вложенные классы
        Computer comp = new Computer(); // переменная представляющая конкретный компьютер
        String comp_On_Or_Off;          // переменная представляющая ответ пользователя включить или выключить компьютер
        Scanner userData = new Scanner(System.in);  // сканирование данных введеных пользователем
        System.out.println("you wont power on computer? (y/n)"); //запрос
        comp_On_Or_Off = userData.nextLine();       //присвоение данных пользователя соответствующей переменной о вкл.\выкл.
        if (comp_On_Or_Off.equals("y"))
            comp.startComputer();
        else if (comp_On_Or_Off.equals("n"))
            comp.offComputer();
        else
            System.out.println("error of this kind does not exist");



        /*// Анонимные класс НЕПОНЯТНО КАК ИМ ПОЛЬЗОВАТЬСЯ
        new Computer() {
            void StartProcess() {
                System.out.println("Computer is on");
                this.i7.start();
                this.matrix256.start();
            }
        };*/





        //полиморфизм на примере классов Paper в котором Sircle и Triangle применяют ощий метод со своими параметрами
        Paper array[] = new Paper[] {new Sircle(), new Triangle(), new Sircle()};
        for (int i = 0; i < array.length; i++)
            array[i].draw();





        //классы  , конструкторы
        Human haiim = new Human("Haiim"); //создан е переменной Haiim обьекта Human
        Human sara = new Human("Sara", 175);
        System.out.println("name is: " + sara.name);
        System.out.println("name is: " + sara.height);

//        Scanner readUserData = new Scanner(System.in);
//        System.out.println("what is you name? ");
//        haiim.name = readUserData.nextLine();
//        System.out.println(haiim.name);
//
//        System.out.println("what is you height? ");
//        haiim.height = readUserData.nextInt();
//        System.out.println(haiim.height);

        Student frefhman = new Student(1, "viktor"); //нужно разблокировать соответствующие конструкторы в Human и Student

        Student boris = new Student(2);
        Student igor = new Student();
        Student stas = new Student("Stas");


        stas.tell_hi_userName();

        haiim.male();
        sara.male();












        /*System.out.print("hello world");
        System.out.println("hello world");

        System.out.print("Hi user enter your string hire-->");
        Scanner str = new Scanner(System.in);
        System.out.println("Your sting is:" + str.nextLine());
        int first, second, result;
        boolean trueOrfalse = true;
        System.out.print("hello user, entered please first number: ");
        first = str.nextInt();
        System.out.print("hello user, entered please second number: ");
        second = str.nextInt();
        result = first + second;
        System.out.println("(first number: " + first + ") + (" + "second number: " + second + ") = " + result);*/

        /*System.out.print("how old are you? ");
        second = 50;
        first = str.nextInt();
        if (first >= second && first <1000)         //  && обозначает и         || обозначает или
            System.out.println("hhh hello grandfather");
        else if (first == 40)
            System.out.println("hi duuuud");
        else
            System.out.println("hello my friend you are old lover then " + second);

        //так же этот блок можно записать в более короткой форме как-->

        trueOrfalse = first >= second ? true : false; //читаеться как:
        System.out.println("first >= second, trueOrfalse = " + trueOrfalse);
        //trueOrfalse присвоить, если first больше или равен second, то true иначе false
        //= после переменной означает что ей будет присвоенно значение
        //? если предшествующая этому знаку проверка(first >=   second в данном случае)возвращает true то будет присвоенно первое что стоит после ?
        //: означает    иначе, тоесть если проверка вернеть отрицательный результат т.е. false, то будет присвоенно действие которое стоит после :
        */


        //еще один условный оператор switch/case
        /*switch (first){     //проверяем переменную first
            case 51:        //при условии что переменная равна заявленному значению будет выполненны строки кода что стоят ниже
                System.out.println("hi duuuud \nfirst = " + first);
                break;      //break;  обьявляет об остановке выполнения кода при верном условии
            case 59:        //при условии что переменная равна заявленному значению будет выполненны строки кода что стоят ниже
                System.out.println("hi duuuud \nfirst = " + first);
                break;
            default:
                System.out.println("hi duuuud \nfirst = " + first);     //в конце default break стакить не нужно


        }*/





        //циклы     for/while/while-do
        //если в цикле присутствует только одна строка кода то скобки ставить не обязательно
        /*for (int i = 1; i < 100; i++)    //создаем или используем переменную; условие при котором будет выполняться цикл; присваеваем переменной новое значение
            System.out.println("changes i equal = " + i);*/

        /*int j = 0;
        while(j < 20) {
            j++;
            System.out.println(j);
        }*/

        /*int m = 0;
        while(m < 20) {
            m++;
            if(m % 2 == 0)
                continue;                       //пример использования  continue; для пропуска определенных условий
            System.out.println("m equal = " + m);
        }*/

        /*boolean isthrue = true;
        j = 0;
        while(isthrue){
            j++;
            System.out.println(j);
            if(j > 20)
                isthrue = false;
        }*/

        /*int x = 0;
        do {
            x++;
            System.out.println("x equal = " + x);
        } while(x < 0);         //даже с заведомо неверным условием этот цикл выполниться хотя бы один
                                // раз так как сначала он выполняеться а только затем проверяеться условие
                                */




        //массивы
        /*Scanner scanUserData = new Scanner(System.in);

        int[] arrayName;
        int numItems;
        System.out.println("enter how much items you want");
        numItems = scanUserData.nextInt();
        arrayName = new int [numItems];
        for(int i = 0; i < numItems; i++){
            System.out.print("enter item # [" + (i + 1) + "]:");
            arrayName[i] = scanUserData.nextInt();
        }*/

        //мтогомерные массивы
        /*char[][] arrayChars;
        Scanner UserData = new Scanner(System.in);
        int arrayCharsNOne, arrayCharsNTwo;
        System.out.print("enter arrayCharsNOne:");
        arrayCharsNOne = UserData.nextInt();
        System.out.print("enter arrayCharsNTwo:");
        arrayCharsNTwo = UserData.nextInt();
        arrayChars = new char[arrayCharsNOne][arrayCharsNTwo];
        *//*if (arrayCharsNOne == 3 && arrayCharsNTwo == 6){
            arrayChars[2][6] = 'C';
        }*//*
        for (int i=0; i<arrayChars.length; i++){
            System.out.print("Char [" + (i + 1) + "] ");
            for (int j=0; j< arrayChars.length; j++){
                System.out.println("[" + (j + 1) + "] = " + arrayChars[i][j]);
            }
        }*/


        //создание функций
        /*int temp = func (3, 4);
        Scanner UserData = new Scanner(System.in);
        System.out.print("enter nupber and after his power: ");
        func(UserData.nextInt(), UserData.nextInt());
        //or
        System.out.print("enter nupber and after his power: ");
        temp = func(UserData.nextInt(), UserData.nextInt());
        //or
        System.out.print("enter nupber and after his power: ");
        System.out.println(func(UserData.nextInt(), UserData.nextInt()));//ели в фенкции не указан вывод данных

        powerArray();*/



    }
        //создание функций
        //      функции не должны описываться одна в дугой хотя не ограниченны использованием одна в другой
        public static int[] powerArray () {
            int[] funcArray;
            int number;
            Scanner readUserData = new Scanner(System.in);
            System.out.println("How much elements of array you wont? ");
            number = readUserData.nextInt();
            funcArray = new int[number];
            for (int i = 0; i < funcArray.length; i++){
                System.out.println("enter element #" + (i+1) + ": ");
                funcArray[i] = readUserData.nextInt();
            }
            for (int i = 0; i < funcArray.length; i++){
                System.out.println("element of array #" + (i+1) + ": " + funcArray[i]);
            }
            return funcArray;
        }

        public static int func(int a, int b) {
            int numberPower = 1;
            for (int i = 0; i < b; i++)
                numberPower *= a;
            System.out.println("number " + a + " of power " + b + " is equal = " + numberPower);
            return numberPower;
        }




}

