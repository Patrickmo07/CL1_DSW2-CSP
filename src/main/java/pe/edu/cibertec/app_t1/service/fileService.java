package pe.edu.cibertec.app_t1.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Service
public class fileService {

    private final Random random = new Random();

    @Async
    public void crearArchivoConDemora10() throws IOException, InterruptedException {
        demorar(10); // Demora de 10 segundos
        crearArchivo("archivo3.txt");
    }

    @Async
    public void crearArchivoConDemora5() throws IOException, InterruptedException {
        demorar(5); // Demora de 5 segundos
        crearArchivo("archivo1.txt");
    }

    @Async
    public void crearArchivoConDemora7() throws IOException, InterruptedException {
        demorar(7); // Demora de 7 segundos
        crearArchivo("archivo2.txt");
    }

    private void demorar(int segundos) throws InterruptedException {
        TimeUnit.SECONDS.sleep(segundos);
    }

    private void crearArchivo(String nombreArchivo) throws IOException {
        File archivo = new File(nombreArchivo);
        try (FileWriter escritor = new FileWriter(archivo)) {
            // Generar información aleatoria
            String contenido = "Contenido aleatorio: " + random.nextInt(100);
            escritor.write(contenido);
        }
    }
}
