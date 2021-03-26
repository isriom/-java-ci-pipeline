package Calculator;

import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args){
        System.console();
        double num1;
        double num2;
        Scanner input= new Scanner(System.in);
        System.out.print("please input the operation using:\nadd\ndivide\npwr\nmultiply");
        while (true){
            String operator=input.nextLine();
            switch (operator){
                case "stop":
                    return;
                case "add":
                    System.out.print("input number 1\n");
                    num1 =input.nextDouble();
                    System.out.print("input number 2\n");
                    num2= input.nextDouble();
                    System.out.print(add(num1,num2)+"\n");
                    break;
                case "divide":
                    System.out.print("input number 1\n");
                    num1 =input.nextDouble();
                    System.out.print("input number 2\n");
                    num2= input.nextDouble();
                    System.out.print(divide(num1,num2)+"\n");
                    break;
                case "pwr":
                    System.out.print("input number 1\n");
                    num1 =input.nextDouble();
                    System.out.print("input number 2\n");
                    num2= input.nextDouble();
                    System.out.print(pwr(num1,num2)+"\n");
                    break;
                case "multiply":
                    System.out.print("input number 1\n");
                    num1 =input.nextDouble();
                    System.out.print("input number 2\n");
                    num2= input.nextDouble();
                    System.out.print(multiply(num1,num2)+"\n");
                    break;
            }
            num1=1;
            num2=1;
            System.out.print("\n\n~~~~~~~~~~~~~~\nPlease enter the next operation");
        }
    }
    static public double add(double num1, double num2){
        return num1+num2;
    }
    static public double divide(double num1, double num2){
        return num1/num2;
    }
    static public double pwr(double num1, double num2){
        return Math.pow(num1, num2);
    }
    static public double multiply(double num1, double num2){
        return num1*num2;
    }

}
