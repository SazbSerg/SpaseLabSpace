package StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Basket{
    private List<Basket> components = new ArrayList<>();

    public void addComponent(Basket component){
        components.add(component);
    }
    public void removeComponent(Basket component){
        components.remove(component);
    }

    @Override
    public void put() {
        for (Basket component: components){
         component.put();
    }
}}
