class DVD extends Material {
    String director;
    String duracion;
    String genero;

    public DVD(String codigo, String titulo, String director, String duracion, String genero, int unidadesDisponibles) {
        super(codigo, titulo, unidadesDisponibles);
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
    }

    void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion);
        System.out.println("Género: " + genero);
        System.out.println("Unidades disponibles: " + unidadesDisponibles);
    }
}
