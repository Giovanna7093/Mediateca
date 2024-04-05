
public class Pruebas {

   
    public void pruebaLibro() {
        Libro libro = new Libro("LIB00001", "La sombra del viento", "Carlos Ruiz Zafón", 500, "Planeta", "9788408043640", 2001, 5);
        
        assertEquals("LIB00001", libro.codigo);
        assertEquals("La sombra del viento", libro.titulo);
        assertEquals("Carlos Ruiz Zafón", libro.autor);
        assertEquals(500, libro.numPaginas);
        assertEquals("Planeta", libro.editorial);
        assertEquals("9788408043640", libro.ISBN);
        assertEquals(2001, libro.anioPublicacion);
        assertEquals(5, libro.unidadesDisponibles);
    }

   
    public void pruebaRevista() {
        Revista revista = new Revista("REV00001", "National Geographic", "National Geographic Society", "Mensual", "01/2024", 10);
        
        assertEquals("REV00001", revista.codigo);
        assertEquals("National Geographic", revista.titulo);
        assertEquals("National Geographic Society", revista.editorial);
        assertEquals("Mensual", revista.periodicidad);
        assertEquals("01/2024", revista.fechaPublicacion);
        assertEquals(10, revista.unidadesDisponibles);
    }

    
    public void pruebaDVD() {
        DVD dvd = new DVD("DVD00001", "El Padrino", "Francis Ford Coppola", "175 minutos", "Drama", 3);
        
        assertEquals("DVD00001", dvd.codigo);
        assertEquals("El Padrino", dvd.titulo);
        assertEquals("Francis Ford Coppola", dvd.director);
        assertEquals("175 minutos", dvd.duracion);
        assertEquals("Drama", dvd.genero);
        assertEquals(3, dvd.unidadesDisponibles);
    }

   
    public void pruebaCDAudio() {
        CDAudio cd = new CDAudio("CDA00001", "Thriller", "Michael Jackson", "Pop", "42 minutos", 9, 7);
        
        assertEquals("CDA00001", cd.codigo);
        assertEquals("Thriller", cd.titulo);
        assertEquals("Michael Jackson", cd.artista);
        assertEquals("Pop", cd.genero);
        assertEquals("42 minutos", cd.duracion);
        assertEquals(9, cd.numCanciones);
        assertEquals(7, cd.unidadesDisponibles);
    }

    private void assertEquals(String cdA00001, String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(int i, int numCanciones) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
