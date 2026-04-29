package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {

    private static final String NAME = " + extra cheese";

    public PizzaExtraCheese() {
        super();
    }

    @Override
    public String name() {
        return super.name() + NAME;
    }

}
