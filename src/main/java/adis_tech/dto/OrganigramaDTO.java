package adis_tech.dto;

import java.util.List;

public class OrganigramaDTO {

    private List<NodoDTO> nodos;
    private List<PosicionDTO> posiciones;
    private List<ConexionDTO> conexiones;

    public OrganigramaDTO() {
    }

    public OrganigramaDTO(
            List<NodoDTO> nodos,
            List<PosicionDTO> posiciones,
            List<ConexionDTO> conexiones) {
        this.nodos = nodos;
        this.posiciones = posiciones;
        this.conexiones = conexiones;
    }

    public List<NodoDTO> getNodos() {
        return nodos;
    }

    public void setNodos(List<NodoDTO> nodos) {
        this.nodos = nodos;
    }

    public List<PosicionDTO> getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(List<PosicionDTO> posiciones) {
        this.posiciones = posiciones;
    }

    public List<ConexionDTO> getConexiones() {
        return conexiones;
    }

    public void setConexiones(List<ConexionDTO> conexiones) {
        this.conexiones = conexiones;
    }

    public static class NodoDTO {

        private Integer id;
        private String tipo;
        private Integer areaId;
        private Integer puestoId;
        private Integer colaboradorId;
        private Integer versionId;

        public NodoDTO() {
        }

        public NodoDTO(
                Integer id,
                String tipo,
                Integer areaId,
                Integer puestoId,
                Integer colaboradorId,
                Integer versionId) {
            this.id = id;
            this.tipo = tipo;
            this.areaId = areaId;
            this.puestoId = puestoId;
            this.colaboradorId = colaboradorId;
            this.versionId = versionId;
        }

        public Integer getId() {
            return id;
        }

        public String getTipo() {
            return tipo;
        }

        public Integer getAreaId() {
            return areaId;
        }

        public Integer getPuestoId() {
            return puestoId;
        }

        public Integer getColaboradorId() {
            return colaboradorId;
        }

        public Integer getVersionId() {
            return versionId;
        }
    }

    public static class PosicionDTO {

        private Integer id;
        private Integer nodoId;
        private Double x;
        private Double y;
        private Integer versionId;

        public PosicionDTO() {
        }

        public PosicionDTO(
                Integer id,
                Integer nodoId,
                Double x,
                Double y,
                Integer versionId) {
            this.id = id;
            this.nodoId = nodoId;
            this.x = x;
            this.y = y;
            this.versionId = versionId;
        }

        public Integer getId() {
            return id;
        }

        public Integer getNodoId() {
            return nodoId;
        }

        public Double getX() {
            return x;
        }

        public Double getY() {
            return y;
        }

        public Integer getVersionId() {
            return versionId;
        }
    }

    public static class ConexionDTO {

        private Integer id;
        private Integer nodoOrigenId;
        private Integer nodoDestinoId;
        private String tipo;
        private Integer versionId;

        public ConexionDTO() {
        }

        public ConexionDTO(
                Integer id,
                Integer nodoOrigenId,
                Integer nodoDestinoId,
                String tipo,
                Integer versionId) {
            this.id = id;
            this.nodoOrigenId = nodoOrigenId;
            this.nodoDestinoId = nodoDestinoId;
            this.tipo = tipo;
            this.versionId = versionId;
        }

        public Integer getId() {
            return id;
        }

        public Integer getNodoOrigenId() {
            return nodoOrigenId;
        }

        public Integer getNodoDestinoId() {
            return nodoDestinoId;
        }

        public String getTipo() {
            return tipo;
        }

        public Integer getVersionId() {
            return versionId;
        }
    }
}