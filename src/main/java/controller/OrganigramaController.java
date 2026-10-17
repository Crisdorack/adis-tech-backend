package adis_tech.controller;

import adis_tech.dto.OrganigramaDTO;
import adis_tech.entity.Conexion;
import adis_tech.entity.Nodo;
import adis_tech.entity.Posicion;
import adis_tech.repository.ConexionRepository;
import adis_tech.repository.NodoRepository;
import adis_tech.repository.PosicionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organigrama")
public class OrganigramaController {

    private final NodoRepository nodoRepository;
    private final PosicionRepository posicionRepository;
    private final ConexionRepository conexionRepository;

    public OrganigramaController(
            NodoRepository nodoRepository,
            PosicionRepository posicionRepository,
            ConexionRepository conexionRepository) {

        this.nodoRepository = nodoRepository;
        this.posicionRepository = posicionRepository;
        this.conexionRepository = conexionRepository;
    }

    @GetMapping
    public OrganigramaDTO obtenerOrganigrama() {

        List<Nodo> nodos = nodoRepository.findAll();
        List<Posicion> posiciones = posicionRepository.findAll();
        List<Conexion> conexiones = conexionRepository.findAll();

        List<OrganigramaDTO.NodoDTO> nodosDTO = nodos.stream()
                .map(n -> new OrganigramaDTO.NodoDTO(
                        n.getId(),
                        n.getTipo(),
                        n.getArea() != null ? n.getArea().getId() : null,
                        n.getPuesto() != null ? n.getPuesto().getId() : null,
                        n.getColaborador() != null ? n.getColaborador().getId() : null,
                        n.getVersion().getId()
                ))
                .toList();

        List<OrganigramaDTO.PosicionDTO> posicionesDTO = posiciones.stream()
                .map(p -> new OrganigramaDTO.PosicionDTO(
                        p.getId(),
                        p.getNodo().getId(),
                        p.getX(),
                        p.getY(),
                        p.getVersion().getId()
                ))
                .toList();

        List<OrganigramaDTO.ConexionDTO> conexionesDTO = conexiones.stream()
                .map(c -> new OrganigramaDTO.ConexionDTO(
                        c.getId(),
                        c.getNodoOrigen().getId(),
                        c.getNodoDestino().getId(),
                        c.getTipo(),
                        c.getVersion().getId()
                ))
                .toList();

        return new OrganigramaDTO(
                nodosDTO,
                posicionesDTO,
                conexionesDTO
        );
    }
}