package com.company;

import java.util.Scanner;

public class Square_Figure extends Geometric_Figure{
    public void draw_Figure () { //описание абстрактного метода draw_Figure реализуеться тут
        int anglesOfFigure;
        Scanner UserData = new Scanner(System.in);
        System.out.println("How many angles does a geometric figure have? ");
        anglesOfFigure = UserData.nextInt();
        if (anglesOfFigure == 4)
            System.out.println("Figure is square");
        else
            System.out.println("error of this kind does not exist");
    }
}
