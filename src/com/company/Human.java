package com.company;

public class Human {
    public  int height = 180;
    public  int width = 45;
    public  Boolean race = true;//true -- male, false -- fimale



    //классы
    //создавая новый класс нужно оьявить его pulic так как иначе все его функции и переменные не будут видны в других классах
    //переменные записанные в классе принято называть полями(переменные --  полями), а функции --  методами
    //имя классу принято давать с большой буквы, последующие слова в названии пишуться с большой буквы и слитно или
    //нижнее подчеркивание и с маленькой буквы      пример:
    //Person        or      PersonHuman     or      Person_human







    //конструкторы
    //модификатор доступа затем имя его класса
    //это конструктор по умолчанию даже не записывая его он имеет место быть
    public Human () {}


    //сам определяет по введеным данным к какому конструктору относиться
    //конструктор с вводом данных одной целой переменной
    public Human (int h) {
        height = h;
    }


    public Human (int h, String name, char male) {
        if (male == 'm') {
            race = true;
            System.out.println("name is: " + name + " and his height = " + h);
            }
        else if (male == 'w') {
            race = false;
            System.out.println("name is: " + name + " and shis height = " + h);
            }
        else
            System.out.println("ERROR" + name + " has nonexistend male");


        height = h;
    }



}
