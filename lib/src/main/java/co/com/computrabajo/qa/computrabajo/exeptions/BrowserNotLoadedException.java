package co.com.computrabajo.qa.computrabajo.exeptions;

import co.com.computrabajo.qa.computrabajo.utils.ConsoleMessageUtilDataDriven;

@SuppressWarnings("serial")
public class BrowserNotLoadedException extends RuntimeException {

    public BrowserNotLoadedException(String message, Throwable cause) {
    	super(message, cause);
    	ConsoleMessageUtilDataDriven.printMessage("errorControlBrowser");
    }
}

