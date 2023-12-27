package ntd.javaguides.springannotations;

import ntd.javaguides.springannotations.controller.MyController;
import ntd.javaguides.springannotations.controller.PizzaController;
import ntd.javaguides.springannotations.lazy.LazyLoader;
import ntd.javaguides.springannotations.propertysource.PropertySourceDemo;
import ntd.javaguides.springannotations.scope.PrototypeBean;
import ntd.javaguides.springannotations.scope.SingletonBean;
import ntd.javaguides.springannotations.service.VegPizza;
import ntd.javaguides.springannotations.value.ValueAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);
	}

}
