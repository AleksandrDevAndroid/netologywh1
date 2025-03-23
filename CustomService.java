package ru.netology.service;
import org.aleks.perov.Main;

import java.util.Scanner;

public class CustomService {

     public static final int calculateCustoms(int price, int weight) {
          int tax = price / 100 + weight  * 100;
          return tax;
     }
}



