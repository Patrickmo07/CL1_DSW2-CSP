package pe.edu.cibertec.app_t1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class asyncFileService {

    @Autowired
    private fileService archivoService;

    public void crearTodosLosArchivosAsincronos() throws IOException, InterruptedException {
        archivoService.crearArchivoConDemora5();
        archivoService.crearArchivoConDemora7();
        archivoService.crearArchivoConDemora10();
    }
}
