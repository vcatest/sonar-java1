public class ConfigurationBeanNamesCheck {

    // Noncompliant - Bean name starts with lowercase
    private String myConfig;

    public String getMyConfig() {
        return myConfig;
    }

    public void setMyConfig(String myConfig) {
        this.myConfig = myConfig;
    }

    // Noncompliant - Bean name contains lowercase characters after the first
    private String MyConfigValue;

    public String getMyConfigValue() {
        return MyConfigValue;
    }

    public void setMyConfigValue(String myConfigValue) {
        this.MyConfigValue = myConfigValue;
    }

    // Compliant - Bean name starts with uppercase
    private String MyConfig;

    public String getMyConfigCompliant() {
        return MyConfig;
    }

    public void setMyConfigCompliant(String myConfig) {
        this.MyConfig = myConfig;
    }

    // Compliant - Bean name is all uppercase
    private String MY_CONFIG;

    public String getMY_CONFIG() {
        return MY_CONFIG;
    }

    public void setMY_CONFIG(String MY_CONFIG) {
        this.MY_CONFIG = MY_CONFIG;
    }
}
