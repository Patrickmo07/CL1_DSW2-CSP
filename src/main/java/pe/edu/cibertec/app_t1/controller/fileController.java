package pe.edu.cibertec.app_t1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_t1.service.asyncFileService;
import pe.edu.cibertec.app_t1.service.fileService;

import java.io.IOException;

@RestController
public class fileController {

    @Autowired
    private asyncFileService archivosAsincronosService;
    private fileService archivoService;


    @GetMapping("/crear-todos-los-archivos")
    public String crearTodosLosArchivos() throws IOException, InterruptedException {
        archivosAsincronosService.crearTodosLosArchivosAsincronos();
        return "Creación de todos los archivos iniciada!";
    }

    @GetMapping("/crear-archivo1")
    public String crearArchivo1() {
        try {
            archivoService.crearArchivoConDemora5();
            return "Archivo 1 creado!";
        } catch (IOException | InterruptedException e) {
            return "Error al crear el archivo 1: " + e.getMessage();
        }
    }

    @GetMapping("/crear-archivo2")
    public String crearArchivo2() {
        try {
            archivoService.crearArchivoConDemora7();
            return "Archivo 2 creado!";
        } catch (IOException | InterruptedException e) {
            return "Error al crear el archivo 2: " + e.getMessage();
        }
    }

    @GetMapping("/crear-archivo3")
    public String crearArchivo3() {
        try {
            archivoService.crearArchivoConDemora10();
            return "Archivo 3 creado!";
        } catch (IOException | InterruptedException e) {
            return "Error al crear el archivo 3: " + e.getMessage();
        }
    }
}
