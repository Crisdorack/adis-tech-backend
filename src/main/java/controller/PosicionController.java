package adis_tech.controller;

import adis_tech.entity.Posicion;
import adis_tech.repository.PosicionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posiciones")
public class PosicionController {

    private final PosicionRepository posicionRepository;

    public PosicionController(PosicionRepository posicionRepository) {
        this.posicionRepository = posicionRepository;
    }

    @GetMapping
    public List<Posicion> obtenerPosiciones() {
        return posicionRepository.findAll();
    }
}