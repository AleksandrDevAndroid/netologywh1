package org.aleks.perov;
import java.util.Scanner;
import static ru.netology.service.CustomService.calculateCustoms;

public class Main {



    public static void main(String[] args) {
        System.out.println("Здраствуйте!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.):");
        int price = sc.nextInt();
        System.out.print("Введите цену вес товара(в руб.):");
        int weight = sc.nextInt();
        int answer = calculateCustoms(price, weight);
    System.out.printf("Размер пошлины (в руб.) составит: %s", answer);
    }


    }
