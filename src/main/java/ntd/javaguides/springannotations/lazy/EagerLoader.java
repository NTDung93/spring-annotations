package ntd.javaguides.springannotations.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class EagerLoader {
    public EagerLoader() {
        System.out.println("EagerLoader created");
    }
}
