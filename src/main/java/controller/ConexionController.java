package adis_tech.controller;

import adis_tech.entity.Conexion;
import adis_tech.repository.ConexionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conexiones")
public class ConexionController {

    private final ConexionRepository conexionRepository;

    public ConexionController(ConexionRepository conexionRepository) {
        this.conexionRepository = conexionRepository;
    }

    @GetMapping
    public List<Conexion> obtenerConexiones() {
        return conexionRepository.findAll();
    }
}