package com.myjava;

import com.kotlin.CustomName;
import com.kotlin.MyFirstKt;

public class MyJavaFile {
    public static void main(String args[]) {
        // Calling Kotlin method into Java
        int sum = MyFirstKt.add(2, 4);
        System.out.println(sum);

        int addition = CustomName.addition(10, 2);
        System.out.println("Addition is: " + addition);
    }

    public static int getArea(int l, int b) {
        return l * b;
    }
}