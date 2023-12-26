package ntd.javaguides.springannotations.controller;

import ntd.javaguides.springannotations.service.Pizza;
import ntd.javaguides.springannotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class PizzaController {
    private Pizza pizza;

    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza() {
        return pizza.getPizza();
    }

    public void init() {
        System.out.println("Bean is going through init.");
    }

    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}
