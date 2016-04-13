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
            return x.Conecta("localhost", "trajin", "root", "101125");
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

     public static int consultarUsuarios(UsuariosDatosEncapsulados objUsuarios)       
    {
        try 
        {
            Connection con = UsuariosModelo.conectaDB();
            Statement stmt = con.createStatement();
            ResultSet rset;
            
            if(objUsuarios.getContrasena().length()==0)
            {
               rset = stmt.executeQuery("SELECT nombre FROM usuarios WHERE nombre='"+objUsuarios.getNombreUsuario()+"'");
            }else
            {
               rset = stmt.executeQuery("SELECT nombre FROM usuarios WHERE nombre='"+objUsuarios.getNombreUsuario()+"' AND contrasenia='"+objUsuarios.getContrasena()+"'");
            }
           
            
            ArrayList<UsuariosDatosEncapsulados> listaArreglos = new ArrayList<UsuariosDatosEncapsulados>();
           
            while (rset.next()) 
            {
                objUsuarios.setNombreUsuario(rset.getString("nombre"));
                listaArreglos.add(objUsuarios);
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
     
    public static int verificarPreguntas(UsuariosDatosEncapsulados objUsuarios)
    {
        
        try 
        {
            Connection con = UsuariosModelo.conectaDB();
            Statement stmt = con.createStatement();
            ResultSet rset = stmt.executeQuery("SELECT fechanacimiento,lugarnacimiento,email FROM usuarios WHERE fechanacimiento='"+objUsuarios.getsFechaNacimiento()+"' AND lugarnacimiento='"+objUsuarios.getsLugarNacimiento()+"' AND email='"+objUsuarios.getsEmail()+"'");
            ArrayList<UsuariosDatosEncapsulados> listaArreglos = new ArrayList<UsuariosDatosEncapsulados>();
           
            while (rset.next()) 
            {
                objUsuarios.setsFechaNacimiento(rset.getString("fechanacimiento"));
                objUsuarios.setsLugarNacimiento(rset.getString("lugarnacimiento"));
                objUsuarios.setsEmail(rset.getString("email"));
                listaArreglos.add(objUsuarios);
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
