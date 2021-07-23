package StructuralPatterns.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightApp {
    public static void main(String[] args) {
        SymbolFactory symbolFactory = new SymbolFactory();
        List<PrintSymbols> symbols = new ArrayList<>();

        symbols.add(symbolFactory.getSymbol("A"));
        symbols.add(symbolFactory.getSymbol("B"));
        symbols.add(symbolFactory.getSymbol("C"));

        symbols.add(symbolFactory.getSymbol("C"));
        symbols.add(symbolFactory.getSymbol("B"));
        symbols.add(symbolFactory.getSymbol("A"));

        symbols.add(symbolFactory.getSymbol("A"));
        symbols.add(symbolFactory.getSymbol("B"));
        symbols.add(symbolFactory.getSymbol("C"));
        System.out.print("/////  ");

        for (PrintSymbols printSymbols: symbols){
            printSymbols.print();
            System.out.print("  /////  ");
        }
    }
}
