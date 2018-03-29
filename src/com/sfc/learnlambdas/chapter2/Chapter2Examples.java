package com.sfc.learnlambdas.chapter2;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Created by Prophet on 2018/3/29.
 */
public class Chapter2Examples {

    public void allLambdaForms() {

        // <1> no arguments
        Runnable noArguments = () -> System.out.println("Hello World");

        // <2> one argument
        ActionListener oneArgument = event -> System.out.println("button clicked");

        // <3> multi statement
        Runnable multiStatement = () -> { // <3>
            System.out.print("Hello");
            System.out.println(" World");
        };

        // <4> multi arguments
        BinaryOperator<Long> add = (x, y) -> x + y;

        // <5> explicit arguments
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
    }

    public void testPredicated() {
        Predicate<Integer> biggerThanZero = x ->  x > 0;
    }
}
