package com.company;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        var cats = Cat.makeCats(10);
        Printer.print(cats);


        cats.sort(Cat::byBread);
        Printer.print(cats);
        cats.sort(Comparator.comparing(Cat::getName).thenComparing(Cat::getAge));
        Printer.print(cats);
        cats.removeIf(cat -> cat.getName().length() == 5);
        Printer.print(cats);
        cats.removeIf(cat -> cat.getColor().toString().equals("SILVER"));
        Printer.print(cats);

    }
}
