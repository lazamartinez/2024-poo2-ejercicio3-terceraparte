package ejercicio3;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Clase Logger implementada con el patrón Singleton para registrar eventos en un archivo de log.
 */
public class Logger {
    private static Logger instance;
    private static final String LOG_FILE = "application.log";
    private PrintWriter writer;

    // Constructor privado para evitar instanciación directa
    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter(LOG_FILE, true), true);
        } catch (IOException e) {
            throw new RuntimeException("Error al inicializar el Logger: " + e.getMessage());
        }
    }

    /**
     * Método estático para obtener la única instancia de Logger.
     * 
     * @return Instancia única de Logger.
     */
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Registra un mensaje de información en el log.
     * 
     * @param message Mensaje a registrar.
     */
    public void info(String message) {
        log("INFO", message);
    }

    /**
     * Registra un mensaje de advertencia en el log.
     * 
     * @param message Mensaje a registrar.
     */
    public void warning(String message) {
        log("WARNING", message);
    }

    /**
     * Registra un mensaje de error en el log.
     * 
     * @param message Mensaje a registrar.
     */
    public void error(String message) {
        log("ERROR", message);
    }

    // Método privado para escribir en el log con el nivel especificado
    private void log(String level, String message) {
        writer.println("[" + level + "] " + message);
    }

    /**
     * Cierra el archivo de log.
     */
    public void close() {
        writer.close();
    }
}
