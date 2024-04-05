class CDAudio extends Material {
    String artista;
    String genero;
    String duracion;
    int numCanciones;

    public CDAudio(String codigo, String titulo, String artista, String genero, String duracion, int numCanciones, int unidadesDisponibles) {
        super(codigo, titulo, unidadesDisponibles);
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.numCanciones = numCanciones;
    }

    void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion);
        System.out.println("Número de canciones: " + numCanciones);
        System.out.println("Unidades disponibles: " + unidadesDisponibles);
    }
}
