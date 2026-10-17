package adis_tech.controller;

import adis_tech.entity.Area;
import adis_tech.repository.AreaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/areas")
public class AreaController {

    private final AreaRepository areaRepository;

    public AreaController(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    @GetMapping
    public List<Area> obtenerAreas() {
        return areaRepository.findAll();
    }
}