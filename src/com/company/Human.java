package com.company;

import java.util.Scanner;

public class Human {
    public String name = "DefaultName";
    public  int height = 180;
    public  int width = 45;
    public  String male = "default_dasn`t_have_male"; // m -- man | w -- woman




    //классы
    //создавая новый класс нужно оьявить его pulic так как иначе все его функции и переменные не будут видны в других классах
    //переменные записанные в классе принято называть полями(переменные --  полями), а функции --  методами
    //имя классу принято давать с большой буквы, последующие слова в названии пишуться с большой буквы и слитно или
    //нижнее подчеркивание и с маленькой буквы      пример:
    //Person        or      PersonHuman     or      Person_human








    //создаю метод в котором реализуеться вопрос у пользователя какого он рода м\ж и вывод ошибки в случае некоректного ввода
    public void male() { // если метод(функция) являеться static то нельзя обращаться к полям(переменным) класса
        String usermale;
        Scanner userData = new Scanner(System.in);
        System.out.print(name + " what is your male? ");
        usermale = userData.next();
        //String male;
        if (usermale.equals("m")) {   // строку нельзя проверять на равенство каким либо символам, только такая запись
            male = "man";
            System.out.println(name + " is man");
        }
        else if (usermale.equals("w")){
            male = "woman";
            System.out.println(name + " is woman");
        }
        else
            System.out.println("error of this kind does not exist");


        System.out.println("user male is: " + male);

    }




    //конструкторы
    //модификатор доступа затем имя его класса
    //это конструктор по умолчанию даже не записывая его он имеет место быть
    public Human () {}


    //сам определяет по введеным данным к какому конструктору относиться
    //конструктор с вводом данных одной целой переменной
    public Human (int h) {
        height = h;
    }


    public Human (String nameOfUser, int h) {

        name = nameOfUser;
        height = h;
    }



}
