package co.com.computrabajo.qa.computrabajo.models;

public class CredentialsModel {
    private String user;
    private String password;

    public String getUser() {
    	System.out.println("Get del User");
        return user;
    }

    public void setUser(String user) {
    	System.out.println("Set del User");
    	this.user = user;
    }

    public String getPassword() {
    	System.out.println("Get del Password");
        return password;
    }

    public void setPassword(String password) {
    	System.out.println("Set del Password");
    	this.password = password;
    }
}
