package co.com.computrabajo.qa.computrabajo.utils;

import org.openqa.selenium.WebDriver;
import net.thucydides.core.annotations.Managed;
import co.com.computrabajo.qa.computrabajo.utils.ConsoleMessageUtil;

public class BrowserUtil {
    // Inicializamos el Driver
    @Managed(driver = "chrome")
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setup() {
        // Realizar otras configuraciones del navegador aquí si es necesario
        // Por ejemplo, maximizar la ventana, configurar timeouts, etc.
    	ConsoleMessageUtil.printMessage("maxBrowser");
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        // Cerrar el navegador cuando sea necesario
        driver.quit();
    }
}
