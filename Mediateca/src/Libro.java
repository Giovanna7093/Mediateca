class Libro extends Material {
    String autor;
    int numPaginas;
    String editorial;
    String ISBN;
    int anioPublicacion;

    public Libro(String codigo, String titulo, String autor, int numPaginas, String editorial, String ISBN, int anioPublicacion, int unidadesDisponibles) {
        super(codigo, titulo, unidadesDisponibles);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.anioPublicacion = anioPublicacion;
    }

    void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Editorial: " + editorial);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Unidades disponibles: " + unidadesDisponibles);
    }
}
