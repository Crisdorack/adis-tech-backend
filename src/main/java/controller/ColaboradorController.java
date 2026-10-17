package adis_tech.controller;

import adis_tech.entity.Colaborador;
import adis_tech.repository.ColaboradorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colaboradores")
public class ColaboradorController {

    private final ColaboradorRepository colaboradorRepository;

    public ColaboradorController(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    @GetMapping
    public List<Colaborador> obtenerColaboradores() {
        return colaboradorRepository.findAll();
    }
}