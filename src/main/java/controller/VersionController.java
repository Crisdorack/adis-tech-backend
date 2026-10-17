package adis_tech.controller;

import adis_tech.entity.Version;
import adis_tech.repository.VersionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/versiones")
public class VersionController {

    private final VersionRepository versionRepository;

    public VersionController(VersionRepository versionRepository) {
        this.versionRepository = versionRepository;
    }

    @GetMapping
    public List<Version> obtenerVersiones() {
        return versionRepository.findAll();
    }
}