/*1) Есть круг с центром в начале координат и радиусом 4. Пользователь
вводит с клавиатуры координаты точки x и y. Написать программу которая
определит лежит ли эта точка внутри круга или нет.
*/
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Кординати точок
        double xO = 0;
        double yO = 0;
        //Радіус кола
        double radius = 4;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point A (x ; y) \nx = ");
        double xA = sc.nextDouble();
        System.out.print("y = ");
        double yA = sc.nextDouble();
        double lenghtAO = Math.sqrt(Math.pow(xA - xO,2)+Math.pow((yA-yO),2));
        System.out.println("Is this point in circle? Result : " + (lenghtAO <= radius ? (lenghtAO == radius ? "Point on circle" : "Yes") : "No"));
    }
}
