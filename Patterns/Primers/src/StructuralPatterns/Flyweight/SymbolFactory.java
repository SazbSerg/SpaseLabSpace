package StructuralPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class SymbolFactory {
    private static final Map<String, PrintSymbols> symbols = new HashMap<>();
    public PrintSymbols getSymbol(String symbolName){
        PrintSymbols printSymbols = symbols.get(symbolName);
        if (printSymbols==null){
            switch (symbolName){
                case "A":
                    printSymbols = new Symbol_A();
                    break;
                case "B":
                    printSymbols = new Symbol_B();
                    break;
                case "C":
                    printSymbols = new Symbol_C();
                    break;
            }
            symbols.put(symbolName,printSymbols);
        }
        return printSymbols;
    }
}
