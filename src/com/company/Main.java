package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name to store in  a list A: ");
            names.add(scan.next());
            System.out.println("This is our A list :" + names);

        }
        scan = new Scanner(System.in);
        ArrayList<String> group = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            System.out.println("Enter a name to store in  a list B: ");
            group.add(scan.next());
            System.out.println("This is our B list :" + group);
            System.out.println("____________");

          ArrayList<String> cList = new ArrayList<>();
          names.addAll(group);
          System.out.println("List C:" +names);
        }

        }
    }
