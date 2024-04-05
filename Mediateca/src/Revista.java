class Revista extends Material {
    String editorial;
    String periodicidad;
    String fechaPublicacion;

    public Revista(String codigo, String titulo, String editorial, String periodicidad, String fechaPublicacion, int unidadesDisponibles) {
        super(codigo, titulo, unidadesDisponibles);
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.fechaPublicacion = fechaPublicacion;
    }

    void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Editorial: " + editorial);
        System.out.println("Periodicidad: " + periodicidad);
        System.out.println("Fecha de publicación: " + fechaPublicacion);
        System.out.println("Unidades disponibles: " + unidadesDisponibles);
    }
}
