package com.company;

import java.util.*;

public class Main {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        ArrayList<String> namesA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a name to store in  a list A: ");
            namesA.add(scan.next());


        }
        System.out.println("This is our A list :" + namesA);

        scan = new Scanner(System.in);
        ArrayList<String> namesB = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            System.out.println("Enter a name to store in  a list B: ");
            namesB.add(scan.next());




                
            }
        System.out.println("This is our B list :" + namesB);
        ArrayList<String> namesC = new ArrayList<>();
            Collections.reverse(namesC);
            Iterator<String> iteratorA = namesA.iterator();
            Iterator<String> iteratorB = namesB.iterator();
            for (int i = 0; i < namesA.size(); i++) {
                namesC.add(iteratorA.next());
                namesC.add(iteratorB.next());
        }
        System.out.println(namesC);
 Collections.sort(namesC,new LegthsComparator());
        System.out.println(namesC);
        Collections.sort(namesC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });

        System.out.println(namesC);
                }


}



