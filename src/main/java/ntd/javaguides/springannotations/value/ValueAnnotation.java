package ntd.javaguides.springannotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {
    @Value("Default Name")
    private String defaultName;

    @Value("${mail.account}")
    private String account;

    @Value("${mail.password}")
    private String password;

    public String getDefaultName() {
        return defaultName;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }
}
