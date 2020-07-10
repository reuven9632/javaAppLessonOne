package com.company;

public class Computer {
    private boolean powerOn = false;//переменная powerOn являеться показателем включения или выключения
    Processor i7 = new Processor();
    Ram matrix256 = new Ram();

    public void startComputer () {//функция start включает присваивая  powerOn --> true
        powerOn = true;
        System.out.println("powerOn of Computer is " + powerOn);
        this.i7.start();
        this.matrix256.start();
    }
    public void offComputer () {//функция off выключает присваивая  powerOn --> false
        powerOn = false;
        System.out.println("powerOn of Computer is " + powerOn);
        this.i7.off();
        this.matrix256.off();
    }
    class Processor {
        private boolean powerOn = false;//переменная powerOn являеться показателем включения или выключения

        public void start () {//функция start включает процессор присваивая  powerOn --> true
            powerOn = true;
            System.out.println("Processor is on");
        }
        public void off () {//функция off выключает процессор присваивая  powerOn --> false
            powerOn = false;
            System.out.println("Processor is off");
        }
    }

    class Ram {
        private boolean powerOn = false;//переменная powerOn являеться показателем включения или выключения

        public void start () {//функция start включает присваивая  powerOn --> true
            powerOn = true;
            System.out.println("Ram is on");
        }
        public void off () {////функция off выключает присваивая  powerOn --> false
            powerOn = false;
            System.out.println("Ram is off");

        }
    }


}
