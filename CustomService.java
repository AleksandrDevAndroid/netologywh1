package ru.netology.service;

public class CustomService {
     public static final int COEFFICIENT_WEIGHT = 100;
     public static int calculateCustoms(int price, int weight) {
          int tax = price / 100 + weight  * COEFFICIENT_WEIGHT;
          return tax;
     }
}




