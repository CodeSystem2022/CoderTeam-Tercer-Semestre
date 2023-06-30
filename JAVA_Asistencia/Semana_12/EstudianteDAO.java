package UTN.datos;

import UTN.dominio.Estudiante;
import static UTN.conexion.Conexion.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    // metodo listar
    public List<Estudiante> listarEstudiante() {
        List<Estudiante> estudiantes = new ArrayList<>();
// creamos algunos objestos que son necesarios para la comunicacion con la base de datos
// envia o prepara la sentencia de sql que vamos a ejecutar a la base de datos
        PreparedStatement ps;
// nos permite almacenar el resultado obtenido de la base de datos
        ResultSet rs;
        // creamos un objeto de tipo conexion
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes.estudiantes2022 ORDER BY idestudiantes2022";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                // falata agregarlo a la lista
                estudiantes.add(estudiante);
            }
        }
        catch (Exception e) {
            System.out.println("Ocurrio un error al seleccionar datos: " + e.getMessage());
        } // fin catch
        finally {
            try {
                con.close();
            }
            catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar la conexion: " + e.getMessage());
            } // fin catch
        } // fin finally
        return estudiantes;
    } // fin List

    // metodo por id -> fin by id
    public boolean buscarEstudPorId(Estudiante estudiante) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes.estudiantes2022 WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true; // se encontro un registro
            } //fin if
        }
        catch (Exception e) {
            System.out.println("Ocurrio un error al buscar estudiante: " + e.getMessage());
        } // fin catch
        finally {
            try {
                con.close();
            }
            catch (Exception e) {
                System.out.println("Ocurrio un error al cerrar conexion: " + e.getMessage());
            } // fin catch
        } // fin finally
        return false;
    } // fin buscarEstudPorId

    // metodo agregar un nuevo estudiante
    public boolean agregarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes.estudiantes2022(nombre, apellido, telefono, email) " +
                "VALUES (?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;
        }
        catch (Exception e) {
            System.out.println("Ocurrio un error al agregar estudiante: " + e.getMessage());
        } // fin catch
        finally {
            try {
                con.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    } // fin metodo agregarEstudiante

    // Metodo para modificar estudiante
    public boolean modificarEstudiante(Estudiante estudiante) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes.estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=? " +
                "WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5,estudiante.getIdEstudiante());
            ps.execute();
            return true;
        }
        catch (Exception e) {
            System.out.println("Error al modificar estudiante: " + e.getMessage());
        } // fin catch
        finally {
            try {
                con.close();
            }
            catch (Exception e) {
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            } // fin catch
        } // fin finally
        return false;
    } // fin metodo modificarEstudiante

    // Metodo eliminar estudiante

    //public boolean eliminarEstudiante(Estudiante estudiante) {
    //    PreparedStatement ps;
    //    ResultSet rs;
    //    Connection con = getConnection();
    //    String sql = "DELETE FROM estudiantes.estudiantes2022 WHERE idestudiantes2022";
    //    try {
    //        ps = con.prepareStatement(sql);
    //        ps.setString(1, estudiante.getNombre());
    //        ps.setString(2, estudiante.getApellido());
    //        ps.setString(3, estudiante.getTelefono());
    //        ps.setString(4, estudiante.getEmail());
    //        ps.setInt(5,estudiante.getIdEstudiante());
    //        ps.execute();
    //        return true;
    //    }
    //    catch (Exception e) {
    //        System.out.println("Error al modificar estudiante: " + e.getMessage());
    //    } // fin catch
    //    finally {
    //        try {
    //            con.close();
    //        }
    //        catch (Exception e) {
    //            System.out.println("Error al cerrar conexion: " + e.getMessage());
    //        } // fin catch
    //    } // fin finally
    //    return false;
    //} // fin metodo eliminarEstudiante

    public static void main(String[] args) {
        var estudianteDao = new EstudianteDAO();

        // Agregar estudiante
        //var nuevoestudiante = new Estudiante("Carlos", "Jepes", "263598741", "cajep@mail.com");
        //var agregado = estudianteDao.agregarEstudiante(nuevoestudiante);
        //if (agregado) {
        //    System.out.println("Estudiante agregado: " + nuevoestudiante);
        //}
        //else {
        //    System.out.println("No se agrego estudiante: " + nuevoestudiante);
        //}

        // Listar los estudiantes
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiante();
        estudiantes.forEach(System.out::println); // funcion lambda para imprimir



        // Modificar estudiante
        var estudiantemodificado =  new Estudiante(6, "Marcelo", "Padilla", "25874136", "marcpad@mail.com");
        var modificado = estudianteDao.modificarEstudiante(estudiantemodificado);
        if (modificado) {
            System.out.println("Estudiante modificado: " + estudiantemodificado);
        }
        else {
            System.out.println("No se modifico el estudiante: " + estudiantemodificado);
        }

        // Buscar por id
        //var estudiante1 = new Estudiante(1);
        //System.out.println("Estudiantes antes de la busqueda: " + estudiante1);
        //var encontrado = estudianteDao.buscarEstudPorId(estudiante1);
        //if (encontrado) {
        //    System.out.println("Estudiante encontrado: " + estudiante1);
        //}
        //else {
        //    System.out.println("No se encontro estudiante: " + estudiante1.getIdEstudiante());
        //} // fin else

    } // fin main
} // fin clase EstudianteDAO
