package ntd.javaguides.springannotations.service;

public class NonVegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Non Veg Pizza";
    }
}
