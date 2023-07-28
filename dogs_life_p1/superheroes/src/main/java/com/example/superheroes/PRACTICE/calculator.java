package com.example.superheroes.PRACTICE;
import org.springframework.stereotype.Component;
@Component
public class calculator {
    public int addition(int num1, int num2){
        return num1+num2;
    }


    public static void main(String[] args) {
        calculator acalculator = new calculator();
        int calculation = acalculator.addition(10,12);
    }
}
