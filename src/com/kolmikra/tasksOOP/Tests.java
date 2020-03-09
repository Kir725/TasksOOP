package com.kolmikra.tasksOOP;

import java.net.Socket;
import java.util.Collections;

public class Tests {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Frenki", "Smolich", 15000);

        System.out.println(employee);
        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(50) + "\n");

        Book steppenwolf = new Book("SteppenWoolf", 1500, new Author[]{new Author("German Gesse", "GG@mail.com", 'M')}, 200);
        System.out.println(steppenwolf);

        System.out.println(steppenwolf.getAuthorNames()+"\n");
        MyComplex complex = new MyComplex(5,3);
        MyComplex complexRight = new MyComplex(4,7);

        System.out.println(complex.isImaginary());
        System.out.println(complex.magnitude() + "- Модуль");
        System.out.println(complex.conjugate());
        System.out.println(complex.argument()+"- Аргумент");
        System.out.println(complex.multiply(complexRight));
        System.out.println(complex.divide(complexRight));

        MyPolynomial polynomialFirst = new MyPolynomial(3,2,4);
        System.out.println(polynomialFirst);
        System.out.println(polynomialFirst.getDegree());

        MyPolynomial polynomialSecond = new MyPolynomial(3,2,4);
        System.out.println(polynomialFirst.add(polynomialSecond)+"\n");
        System.out.println(polynomialFirst.multiply(polynomialSecond)+"\n");

        Ball ball = new Ball(5,4,2,1,90);
        Container bigContainer = new Container(0,0,8,7);
        Container smallContainer = new Container(0,0,4,4);
        System.out.println(bigContainer.collides(ball));
        System.out.println(smallContainer.collides(ball));
        ball.move();
        ball.move();
        ball.move();
        System.out.println(bigContainer.collides(ball));


    }
}
