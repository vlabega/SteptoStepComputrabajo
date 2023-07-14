package co.com.computrabajo.qa.computrabajo.utils;
//Este
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConsoleMessageUtilDataDriven {
    private static Map<String, String> messages = new HashMap<>();

    static {
        loadMessagesFromFile("C:\\Users\\Arbusta\\eclipse-workspace\\SteptoStepComputrabajo\\lib\\src\\main\\java\\co\\com\\computrabajo\\qa\\computrabajo\\utils\\Messages.txt");
    }

    private static void loadMessagesFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String key = parts[0];
                    String value = parts[1];
                    messages.put(key, value);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar los mensajes desde el archivo: " + fileName);
        }
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
