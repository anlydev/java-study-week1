package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("source 온도체계(C,F) 혹은 종료하려면 exit를 입력하세요 : ");
            String answer = in.next();

            if (answer.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (answer.equals("C")) {
                System.out.print("섭씨로 온도를 입력하세요 : ");
                double c = in.nextDouble();
                celsiusToFahrenheit(c);
            }
            else if (answer.equals("F")) {
                System.out.print("화씨로 온도를 입력하세요 : ");
                double f = in.nextDouble();
                fahrenheitToCelsius(f);
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("섭씨 %.1f도는 화씨 %.1f도입니다.\n\n", celsius, fahrenheit);
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("화씨 %.1f도는 섭씨 %.1f도입니다.\n\n", fahrenheit, celsius);
        return celsius;
    }
}