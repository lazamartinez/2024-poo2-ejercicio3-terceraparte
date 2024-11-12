package ejercicio3;

/**
 * Clase principal para demostrar el uso del patrón Singleton en el sistema de logging.
 */
public class LoggerDemo {
    public static void main(String[] args) {
        // Simular múltiples procesos escribiendo en el log
        Runnable task1 = () -> {
            Logger logger = Logger.getInstance();
            logger.info("Tarea 1: Inicio del proceso.");
            logger.warning("Tarea 1: Advertencia de uso elevado de recursos.");
            logger.error("Tarea 1: Error en el cálculo de datos.");
        };

        Runnable task2 = () -> {
            Logger logger = Logger.getInstance();
            logger.info("Tarea 2: Cargando datos.");
            logger.warning("Tarea 2: Datos incompletos detectados.");
            logger.error("Tarea 2: Error al acceder a la base de datos.");
        };

        // Ejecutar tareas en hilos separados
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Logger.getInstance().close();
    }
}

