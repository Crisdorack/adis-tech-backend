package adis_tech.controller;

import adis_tech.entity.Nodo;
import adis_tech.repository.NodoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nodos")
public class NodoController {

    private final NodoRepository nodoRepository;

    public NodoController(NodoRepository nodoRepository) {
        this.nodoRepository = nodoRepository;
    }

    @GetMapping
    public List<Nodo> obtenerNodos() {
        return nodoRepository.findAll();
    }
}