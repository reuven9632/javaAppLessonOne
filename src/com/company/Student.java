package com.company;
//здесь мы разберем наследование классов, для того что бы Student унаследовал класс Human нужно написать extends
public class Student extends Human{     //класс Student унаследовал класс Human
    public int course = 1;

    public Student () {
        System.out.println("student " + name + " on couse #: " + (this.course = course));
    }

    public Student (int course) {
        System.out.println("student " + name + " on couse #: " + (this.course = course));
    }


}
