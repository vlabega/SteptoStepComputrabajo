package co.com.computrabajo.qa.computrabajo.utils;
//Este
import java.util.HashMap;
import java.util.Map;

public class ConsoleMessageUtil {
    private static Map<String, String> messages = new HashMap<>();

    static {
        // Agregar los mensajes al mapa
    	messages.put("cargaBrowser", "Carga del Browser");
    	
    	messages.put("cargaPagina", "Carga de la Pagina Principal");
    	
    	messages.put("ejecutarGiven", "Ejecutar tarea del Given cargar Home Page");
    	
    	messages.put("maxBrowser", "Maximizar el Browser");
        
        messages.put("errorConexion", "Error al establecer conexión");
        // Agrega más mensajes aquí según tus necesidades
    }

    public static void printMessage(String key) {
        String message = messages.get(key);
        if (message != null) {
            System.out.println(message);
        } else {
            System.out.println("Mensaje no encontrado para la clave: " + key);
        }
    }
}

