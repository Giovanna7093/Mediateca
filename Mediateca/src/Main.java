import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/mediateca";
    private static final String USER = "usuario";
    private static final String PASSWORD = "contraseña";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión establecida con la base de datos");

            // Crear instancias de materiales y guardarlos en la base de datos
            Libro libro = new Libro("LIB00001", "La sombra del viento", "Carlos Ruiz Zafón", 500, "Planeta", "9788408043640", 2001, 5);
            libro.guardarMaterial(conn);

            Revista revista = new Revista("REV00001", "National Geographic", "National Geographic Society", "Mensual", "01/2024", 10);
            revista.guardarMaterial(conn);

            DVD dvd = new DVD("DVD00001", "El Padrino", "Francis Ford Coppola", "175 minutos", "Drama", 3);
            dvd.guardarMaterial(conn);

            CDAudio cd = new CDAudio("CDA00001", "Thriller", "Michael Jackson", "Pop", "42 minutos", 9, 7);
            cd.guardarMaterial(conn);

            // Consultar los materiales disponibles
            System.out.println("Materiales disponibles:");
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
