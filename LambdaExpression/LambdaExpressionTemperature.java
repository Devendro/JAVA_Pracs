package com.prac1;

import java.util.function.Function;

public class LambdaExpressionTemperature {
	public static void main(String[] args) {
        // Lambda expression to convert Fahrenheit to Celsius
        Function<Double, Double> fahrenheitToCelsius = fahrenheit -> (fahrenheit - 32) * 5/9;

        // Lambda expression to convert Kilometers to Miles
        Function<Double, Double> kilometersToMiles = kilometers -> kilometers / 1.60934;

        // Test the conversions
        double fahrenheit = 68.0; // 68 degrees Fahrenheit
        double kilometers = 10.0; // 10 kilometers

        double celsius = fahrenheitToCelsius.apply(fahrenheit);
        double miles = kilometersToMiles.apply(kilometers);

        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
}
