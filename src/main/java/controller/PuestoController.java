package adis_tech.controller;

import adis_tech.entity.Puesto;
import adis_tech.repository.PuestoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/puestos")
public class PuestoController {

    private final PuestoRepository puestoRepository;

    public PuestoController(PuestoRepository puestoRepository) {
        this.puestoRepository = puestoRepository;
    }

    @GetMapping
    public List<Puesto> obtenerPuestos() {
        return puestoRepository.findAll();
    }
}