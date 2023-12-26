package ntd.javaguides.springannotations.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {
    @Autowired
    private Environment environment;

//    @Value("${gmail.host}")
    private String host;

//    @Value("${gmail.gmail}")
    private String gmail;

//    @Value("${gmail.password}")
    private String password;

//    @Value("${app.name}")
    private String appName;

//    @Value("${app.description}")
    private String appDescription;

    public String getHost() {
        return environment.getProperty("gmail.host");
    }

    public String getGmail() {
        return environment.getProperty("gmail.gmail");
    }

    public String getPassword() {
        return environment.getProperty("gmail.password");
    }

    public String getAppName() {
        return environment.getProperty("app.name");
    }

    public String getAppDescription() {
        return environment.getProperty("app.description");
    }
}
