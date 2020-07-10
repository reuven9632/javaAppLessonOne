package com.company;
//здесь мы разберем наследование классов, для того что бы Student унаследовал класс Human нужно написать extends
public class Student extends Human{     //класс Student унаследовал класс Human
    public int course = 1;





    //создаю методы
    void tell_hi_userName () {
       /* System.out.println("hi " + Human.name);//выдаст ошибку так как обращение к полям родителя делаеться через метод super*/
        System.out.println("hi " + super.name);
    }


    //создаю конструкторы
    public Student () {
        System.out.println("student " + name + " on couse #: " + (this.course = course));
    }

    public Student (int course) {
        System.out.println("student " + name + " on couse #: " + (this.course = course));
        this.course = course;   //при использовании одинаковых имен переменных в конструкторе и классе то используем метод
        //this. для указания что эта переменная принадлежит классу в котором храниться
    }

    public Student (String name) {
        System.out.println("name of student is " + name + " hi is sudy on couse #: " + (this.course = course));
        super.name = name;      //при использовании одинаковых имен переменных в конструкторе и классе !!родителе!! то используем метод
        //super. для указания что эта переменная принадлежит классу !!родителю!! в котором храниться
    }


}
