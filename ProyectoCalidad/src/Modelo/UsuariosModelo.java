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
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuariosModelo {
    Conexion conexion;
    
    public UsuariosModelo() 
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
            return x.Conecta("localhost", "TRAJIN", "root", "123456");
        } catch (Exception ex)
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
    
    /**
     * Hace la consulta del usuario de la interfaz de login, verifica el nombre y contraseña. Además de que conecta con la base de datos.
     * @param objUsuarios datos de usuarios encapsulados.
     * @return regresa un valor si encuentra la coincidencia o no.
     */
     public static int consultarUsuarios(UsuariosDatosEncapsulados objUsuarios)       
    {
        try 
        {
            Connection con = UsuariosModelo.conectaDB();
            Statement stmt = con.createStatement();
            ResultSet rset;
            /**
             * En el siguiente if se hace la busqueda a traves de un objUsuarios que tiene los datos encapsulados.
             */
            if(objUsuarios.getContrasena().length()==0)
            {
               rset = stmt.executeQuery("SELECT username FROM usuarios WHERE username='"+objUsuarios.getNombreUsuario()+"'");
            }else
            {
               rset = stmt.executeQuery("SELECT username,contrasenia FROM usuarios WHERE username='"+objUsuarios.getNombreUsuario()+"' AND contrasenia='"+objUsuarios.getContrasena()+"'");
            }
           
            
            ArrayList<UsuariosDatosEncapsulados> listaArreglos = new ArrayList<UsuariosDatosEncapsulados>(); // Se crea una lista de arreglos de usuarios.
           
            while (rset.next()) 
            {
                objUsuarios.setUsuario(rset.getString("username")); 
                listaArreglos.add(objUsuarios);
            }
            if (listaArreglos.size() > 0) 
            {
                return 0;
            }
            stmt.close();
            UsuariosModelo.desconectaDB(con); //Despues de haber hecho la busqueda se desconecta de la base de datos.
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }
     
     /**
      * Realiza la verificación de las preguntas de seguridad para recuperar la contraseña.
      * @param objUsuarios datos de usuarios encapsulados.
      * @return regresa un valor si encuentra la coincidencia o no.
      */
    public static int verificarPreguntas(UsuariosDatosEncapsulados objUsuarios)
    {
        
        try 
        {
            Connection con = UsuariosModelo.conectaDB(); //Se hace la conexión con la base de datos.
            Statement stmt = con.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT respuestasecreta FROM usuarios WHERE  respuestasecreta= '"+objUsuarios.getsRespuestaSecreta()+"'"); //Se obtienen los vaores para validad respecto a las preguntas de seguridad.
            ArrayList<UsuariosDatosEncapsulados> listaArreglos = new ArrayList<UsuariosDatosEncapsulados>(); //Crea un arreglo de los datos obtenidos.
           
            while (rset.next())  //Se va a buscar coincidencias dentro del while.
            {
                objUsuarios.setsRespuestaSecreta(rset.getString("respuestasecreta"));
                listaArreglos.add(objUsuarios);
            }
            if (listaArreglos.size() > 0) 
            {
                return 0;
            }
            stmt.close(); //Se cierra la conexión con los datos encapsulados.
            UsuariosModelo.desconectaDB(con); //Se cierra la conexión con la base de datos.
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 1;
    }/**
     * Realiza la recuperación de la contraseña a travez de la obtención de usuario, asignandole una nueva contraseña ingresada por el usuario.
     * @param objUsuarios datos de usuarios encapsulados.
      * @return regresa un valor si se hace el cambio de contraseña.
     */
     public static int recuperarContrasenia(UsuariosDatosEncapsulados objUsuarios)
    {
        Connection con = UsuariosModelo.conectaDB(); //Conecta a la base de datos.
        String sSQL = "UPDATE usuarios SET contrasenia=? WHERE nombre=?"; //Actualiza la contraseña en la base de datos.
        try {
            PreparedStatement pst=con.prepareStatement(sSQL); 
            pst.setString(1,objUsuarios.getContrasena()); //Obtiene contraseña.
            pst.setString(2,objUsuarios.getNombreUsuario()); //Obtiene usuario.
            int n=pst.executeUpdate();
            if (n!=0) {
                JOptionPane.showMessageDialog(null, "Modificacion exitosa "); //Si hace el cambio manda mensaje de exito.
                return 0;
            }else{
                return 1;
            }
            
         } catch (SQLException | NullPointerException | HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro...\nCodigo error:\n"+e); //Si no realiza el cambio manda mensaje de error.
            return 1;
            
        }
    }
}
