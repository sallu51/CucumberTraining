package pagesnactions;

import com.sf.driver.Driver;
import com.sf.driver.DriverManager;

public class Basetest {

    public Basetest() {
    }

    public void launchBrowser(){
        Driver.initDriver("chrome");
        DriverManager.getDriver().get("https://www.statefarm.com/");
    }
}
