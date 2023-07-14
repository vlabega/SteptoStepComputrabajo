package co.com.computrabajo.qa.computrabajo.utils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenshotUtil {
    private static int screenshotCounter = 0;
    private static FileWriter writer;

    public static void init() {
        try {
            // Crear el archivo de texto para almacenar los nombres de las imágenes
            writer = new FileWriter("screenshots.txt");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo de texto: " + e.getMessage());
        }
    }

    public static void captureScreenshot(String imageName) {
        try {
            // Capturar la pantalla actual
            BufferedImage screenshot = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            // Generar un nombre único para la imagen
            String screenshotName = generateScreenshotName(imageName);

            // Guardar la imagen en una carpeta del proyecto
            File outputDir = new File("screenshots");
            if (!outputDir.exists()) {
                outputDir.mkdirs();
            }
            File outputFile = new File(outputDir, screenshotName);
            ImageIO.write(screenshot, "png", outputFile);

            // Escribir el nombre de la imagen en el archivo de texto
            writer.write(screenshotName + "\n");

            System.out.println("Screenshot capturado: " + screenshotName);
        } catch (AWTException | IOException e) {
            System.out.println("Error al capturar el screenshot: " + e.getMessage());
        }
    }

    public static void close() {
        try {
            // Cerrar el archivo de texto
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo de texto: " + e.getMessage());
        }
    }

    private static String generateScreenshotName(String imageName) {
        screenshotCounter++;
        return String.format("%03d_%s.png", screenshotCounter, imageName);
    }
}
