import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

abstract class Material {
    protected String codigo;
    protected String titulo;
    protected int unidadesDisponibles;

    public Material(String codigo, String titulo, int unidadesDisponibles) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    abstract void mostrarInformacion();

    // Método para guardar el material en la base de datos
    public void guardarMaterial(Connection conn) throws SQLException {
        String sql = "INSERT INTO materiales (codigo, titulo, unidades_disponibles) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, codigo);
            stmt.setString(2, titulo);
            stmt.setInt(3, unidadesDisponibles);
            stmt.executeUpdate();
            System.out.println("Material guardado correctamente en la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al guardar el material en la base de datos: " + e.getMessage());
            throw e;
        }
    }
}
