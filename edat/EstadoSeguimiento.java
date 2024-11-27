
public class EstadoSeguimiento {
    private int estadoId;
    private String nombreEstado;

    public EstadoSeguimiento(int estadoId, String nombreEstado) {
        this.estadoId = estadoId;
        this.nombreEstado = nombreEstado;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
}