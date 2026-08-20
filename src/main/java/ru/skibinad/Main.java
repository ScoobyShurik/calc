package ru.skibinad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputPrice;
        double inputWeight;
        double calculatedFee;
        System.out.print("Введите цену товара (в руб.): ");
        inputPrice = scanner.nextDouble();
        System.out.print("Введите вес товара (в кг.): ");
        inputWeight = scanner.nextDouble();
        calculatedFee = calculateCustoms(inputPrice, inputWeight);
        System.out.println("Пошлина на товар составляет: " + calculatedFee + " руб.");

    }

    public static double calculateCustoms(double price, double weight){
        double ratePrice = 0.01;
        double rateWeight = 100;
        return (rateWeight * weight) + (ratePrice * price);
    }
}