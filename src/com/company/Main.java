package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> list = new ArrayList<>(3);

        list.add("Red");
        list.add("Green");
        list.add("Black");

        list.ensureCapacity(6);

        list.add("Pink");
        list.add("Yellow");
        list.add("White");


        Collections.sort(list);
        System.out.println("A to Z");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("_________________");
        Collections.reverse(list);
        System.out.println("Z to A");
        iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("________________");
        Collections.shuffle(list);
        System.out.println("После shuffle");
        iter = list.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
        }

    }
