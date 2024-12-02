package chapter01;

import chapter01.tests.FindGuitarTester;

public class Main {
    public static void main(String[] args) {
        System.out.println(".:: Rick's guitar app! ::.");
        System.out.println();

        FindGuitarTester guitarTester = new FindGuitarTester();
        guitarTester.WhatErinLikesTest();
    }
}
