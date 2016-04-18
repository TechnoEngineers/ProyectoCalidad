/*
 * Techno Engineers
 * UsuariosDAO
 * 10/04/2016 -- Autorizo: Oscar de Paz Feliciano // Lider de proyecto
 * Modificaciones: Miguel Ángel Careaga Gómez // Desarrollo. [17/04/2016]
 * Sirve para manejar los datos de la tabla "usuarios" de la base de datos como objetos en el sistema
 * Numero de metodos en el codigo: 0
 * Interfaces: 
 */
package Modelo;
import Vista.mensajes.Mensajes;
import java.sql.*;
import javax.swing.JFrame;
/**
 *
 * @author Techno Engineers
 */

public class RegistroUsuarioModelo {
    
    Conexion conexion;
    
    public RegistroUsuarioModelo() 
    {
        conexion = new Conexion();
    
    }
    /**
     * Crear métodos para la transacción de los datos conparando con la base de datos
     * @return regresa un valor nulo.
     */
    public static Connection conectaDB()
    { 
        Conexion x = new Conexion();
        try
        {
            return x.Conecta("localhost", "trajin", "root", "123456");
        } catch (SQLException ex)
        {
            return null;
        }   
    }
    
    /**
     * Se desconecta de la base de datos.
     * @param con recibe el parametro para saber si esta conectada a la base de datos.
     */
    public static void desconectaDB(Connection con)
    {
        Conexion x= new Conexion();
        x.desconectar(con); //Se le asigna el valor para desconectar de la base de datos.
    }
    
    /**
     * Metodo el cual envía el valor para desconectar de la base de datos.
     * @param conect 
     */
    public void desconectar(Connection conect)
    {
        conect = null;
    }
    
    
  public boolean registrarUsuarios(RegistroUsuarioDatosEncapsulados objRegistroDatosEncapsulados)
    {
        JFrame objFrame=new JFrame();
        Mensajes objMensajes=new Mensajes();
        try 
        {
            Connection con = UsuariosModelo.conectaDB();
            PreparedStatement rset = con.prepareStatement("INSERT INTO usuarios (nombre, apellidopaterno, apellidomaterno, sexo, " + 
                                  "calle, numero, colonia, ciudad, estado, cp, telcelular, telcasa, teloficina, correo, fechanac, " + 
                                  "lugarnacimiento, estadocivil, pasaporte, vigenciapasaporte, nocartillamilitar, talla, tiposanguineo, " + 
                                  "alergias, enfermedades, nombremedicocabecera, telmedicocabecera, medicaciondiarrea, medicaciondolorcabeza, " + 
                                  "medicaciondolorestomago, medicaciondolormuscular, medicaciongripa, medicacionotro, formadeenterarse, " + 
                                  "baila, baile, lugardondebailaba, tiempoquebailo, comentario) VALUES (?, ?, ?, ?, " +
                                  "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
           
            
            rset.setString(1, objRegistroDatosEncapsulados.getsNombre());
            rset.setString(2, objRegistroDatosEncapsulados.getsApellidoPaterno());
            rset.setString(3, objRegistroDatosEncapsulados.getsApellidoMaterno());
            rset.setString(4, String.valueOf(objRegistroDatosEncapsulados.getcSexo()));
            rset.setString(5, objRegistroDatosEncapsulados.getsCalle());
            rset.setString(6, Integer.toString(objRegistroDatosEncapsulados.getiNumero()));
            rset.setString(7, objRegistroDatosEncapsulados.getsColonia());
            rset.setString(8, objRegistroDatosEncapsulados.getsCiudad());
            rset.setString(9, objRegistroDatosEncapsulados.getsEstado());
            rset.setString(10, Integer.toString(objRegistroDatosEncapsulados.getiCp()));
            rset.setString(11, Integer.toString(objRegistroDatosEncapsulados.getiTelCelular()));
            rset.setString(12, Integer.toString(objRegistroDatosEncapsulados.getiTelCasa()));
            rset.setString(13, Integer.toString(objRegistroDatosEncapsulados.getiTelOficina()));
            rset.setString(14, objRegistroDatosEncapsulados.getsEmail());
            rset.setString(15, objRegistroDatosEncapsulados.getsFechaNacimiento());
            rset.setString(16, objRegistroDatosEncapsulados.getsLugarNacimiento());
            rset.setString(17, objRegistroDatosEncapsulados.getsEstadoCivil());
            rset.setString(18, objRegistroDatosEncapsulados.getsPasaporteSN());
            rset.setString(19, objRegistroDatosEncapsulados.getsVigenciaPasaporte());
            rset.setString(20, Integer.toString(objRegistroDatosEncapsulados.getiNoCartillaMilitar()));
            rset.setString(21, objRegistroDatosEncapsulados.getsTalla());
            rset.setString(22, objRegistroDatosEncapsulados.getsTipoSanguineo());
            rset.setString(23, objRegistroDatosEncapsulados.getsAlergias());
            rset.setString(24, objRegistroDatosEncapsulados.getsEnfermedades());
            rset.setString(25, objRegistroDatosEncapsulados.getsNombreMedicoCabecera());
            rset.setString(26, Integer.toString(objRegistroDatosEncapsulados.getiTelMedicoDeCabecera()));
            rset.setString(27, objRegistroDatosEncapsulados.getsMedicacionDiarrea());
            rset.setString(28, objRegistroDatosEncapsulados.getsMedicacionDolorDeCabeza());
            rset.setString(29, objRegistroDatosEncapsulados.getsMedicacionDolorDeEstomago());
            rset.setString(30, objRegistroDatosEncapsulados.getsMedicacionDolorMuscular());
            rset.setString(31, objRegistroDatosEncapsulados.getsMedicacionGripa());
            rset.setString(32, objRegistroDatosEncapsulados.getsMedicacionOtro());
            rset.setString(33, objRegistroDatosEncapsulados.getsFormaDeEnterarse());
            rset.setString(34, String.valueOf(objRegistroDatosEncapsulados.getcBaila()));
            rset.setString(35, objRegistroDatosEncapsulados.getsBaile());
            rset.setString(36, objRegistroDatosEncapsulados.getsAnteriorBallet());
            rset.setString(37, objRegistroDatosEncapsulados.getsTiempoQueBailo());
            rset.setString(38, objRegistroDatosEncapsulados.getsComentario());
            
            int n = rset.executeUpdate();
            
            if (n != 0)
            {
                return true;
            } else
            {
                return false;
            }
        } catch (SQLException ex) {
            objMensajes.falla(objFrame,"Error en la conexión "+ex.getMessage());
            return false;
        }
    }
}
