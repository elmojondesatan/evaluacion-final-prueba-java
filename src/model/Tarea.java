package model;

public class Tarea {
    private String titulo;
    private String descripcion;
    private String fechaLimite;
    private String estado;

    public Tarea(String titulo, String descripcion, String fechaLimite, String estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.estado = estado;
    }

    public Tarea(String titulo, String descripcion, String fechaLimite) {
        this(titulo, descripcion, fechaLimite, "pendiente");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaLimite='" + fechaLimite + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}


