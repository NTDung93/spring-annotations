package ntd.javaguides.springannotations.config;

import ntd.javaguides.springannotations.controller.PizzaController;
import ntd.javaguides.springannotations.service.NonVegPizza;
import ntd.javaguides.springannotations.service.Pizza;
import ntd.javaguides.springannotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "vegPizzaBean")
    public Pizza vegPizza() {
        return new VegPizza();
    }

    @Bean(name = "nonVegPizzaBean")
    public Pizza nonVegPizza() {
        return new NonVegPizza();
    }

    @Bean()
    public PizzaController pizzaController() {
        return new PizzaController(nonVegPizza());
    }
}
