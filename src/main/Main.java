package main;

import interfaces.*;

public class Main {

    public static void main(String[] args) {

        Flyable eagle = new Eagle("Степной орел", "Решка");
        System.out.print(eagle); eagle.fly(); eagle.eat();

        Flyable parrot = new Parrot("Какаду", "Повторюшка");
        System.out.print(parrot); parrot.fly(); parrot.eat();

        Flyable pigeon = new Pigeon("Почтовый голубь", "Ясен");
        System.out.print(pigeon); pigeon.fly(); pigeon.eat();

    }
}
