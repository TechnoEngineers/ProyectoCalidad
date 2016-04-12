/*
 * Techno Engineers
 * UsuariosDAO
 * 10/04/2016 -- Autorizo: Oscar de Paz Feliciano // Lider de proyecto
 * Modificaciones: 
 * Sirve para manejar los datos de la tabla "usuarios" de la base de datos como objetos en el sistema
 * Numero de metodos en el codigo: 0
 * Interfaces: 
 */
package Modelo;
import SQL.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Techno Engineers
 */

public class UsuariosModelo {
    Conexion conexion;
    
    public UsuariosModelo() 
    {
        conexion = new Conexion();
    
    }
    //Crear métodos para la transacción de los datos conparando con la base de datos
    public static Connection conectaDB()
    { 
        Conexion x = new Conexion();
        try
        {
            return x.Conecta("localhost:3306", "sld", "root", "101125", 2);
        } catch (SQLException ex)
        {
            return null;
        }   
    }
    
    public static void desconectaDB(Connection con)
    {
        Conexion x= new Conexion();
        x.desconectar(con);
    }
    
    public void desconectar(Connection conect)
    {
        conect = null;
    }

    public static int consultarUsuarios(String usuario, String password)
    {
        try 
        {
            Connection con = UsuariosModelo.conectaDB();
            Statement stmt = con.createStatement();
            ResultSet rset = stmt.executeQuery("select nombre,apellidopaterno from usuarios where nombre='"+usuario+"' and contrasenia='"+password+"'");
            ArrayList<UsuariosDatosEncapsulados> listaArreglos = new ArrayList<UsuariosDatosEncapsulados>();
           
            while (rset.next()) 
            {
                UsuariosDatosEncapsulados objPersona = new UsuariosDatosEncapsulados();
                objPersona.setNombreUsuario(rset.getString("nombre"));
                objPersona.setContrasena(rset.getString("ap"));
                listaArreglos.add(objPersona);
            }

            if (listaArreglos.size() > 0) 
            {
                return 0;
            }
            
            stmt.close();
            UsuariosModelo.desconectaDB(con);

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }
  
}
