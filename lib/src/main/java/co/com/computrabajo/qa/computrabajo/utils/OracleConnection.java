package co.com.computrabajo.qa.computrabajo.utils;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.sql.*;

import co.com.bancolombia.certification.FIINQUIRECDT.interactions.InsertRequest2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class OracleConnection implements Task {

	@Override
    	public <T extends Actor> void performAs(T actor) {
    		
    		
    		String usuario = "dbread";
        	String password = "dbread";

        	String host = "scan-qfitcdt.bancolombia.corp"; // tambien puede ser una ip como "192.168.1.14"
        	String puerto = "1523";
        	String sid = "null";
        	String servicename = "FICDTFDB.bancolombia.corp";

            String driver = "oracle.jdbc.driver.OracleDriver";

            String ulrjdbc = ("jdbc:oracle:thin:" + usuario + "/" + password + "@" + host + ":" + puerto + "/" + servicename);

           

            Connection connection = null;
            try {
                Class.forName(driver).newInstance();
                connection = DriverManager.getConnection(ulrjdbc);

                // Ya tenemos el objeto connection creado
                System.out.println("CONEXION REALIZADA");

                
              ResultSet result = connection.createStatement().executeQuery
               ("select count (PROD_NUM) from CUSTOM.C_CXREF_REQ_DTLS_TBL\r\n" + 
               		"--where TRIM (REQ_BOD_DATE) = '21/06/18'\r\n" + 
               		"--order by LCHG_time desc \r\n" + 
               		"\r\n" + 
               		"where PROD_NUM IN ('27600114717')");
              result.next();
              System.out.println(result.getString(1));
              
              
              /*
              
              ResultSet rs = null;
    
          		Object obj[][] = null;
          		int j = 0;
          		try {
          			rs.last();
          			ResultSetMetaData rsmd = rs.getMetaData();
          			int numCols = rsmd.getColumnCount();
          			int numFils = rs.getRow();
          			obj = new Object[numFils][numCols];		
          			rs.beforeFirst();
          			while (rs.next()) {
          				for (int i = 0; i < numCols; i++) {
          					obj[j][i] = rs.getObject(i + 1);
          				}
          				j++;
          			}
          		} catch (Exception e) {
          		}
          */
        
              
              
              
              
              
                
                
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                    }
                }
            }
    		
    		
    	}

	public static OracleConnection at() {
		// TODO Auto-generated method stub
		return instrumented(OracleConnection.class);
	}

}

/*
 * 
 * String usuario = "dbread"; String password = "dbread";
 * 
 * String host = "scan-qfitcdt.bancolombia.corp"; // tambien puede ser una ip
 * como "192.168.1.14" String puerto = "1523"; String sid = "null"; String
 * servicename = "FICDTFDB.bancolombia.corp";
 * 
 * String driver = "oracle.jdbc.driver.OracleDriver";
 * 
 * String ulrjdbc = "jdbc:oracle:thin:" + usuario + "/" + password + "@" + host
 * + ":" + puerto + "/" + servicename;
 * 
 */
