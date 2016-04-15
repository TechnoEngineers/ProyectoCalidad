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
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
            return x.Conecta("localhost", "trajin", "root", "123456");
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
            ResultSet rset = stmt.executeQuery("SELECT ciudad,email FROM usuarios WHERE  ciudad='"+objUsuarios.getsCiudad()+"' AND email='"+objUsuarios.getsEmail()+"'");
            ArrayList<UsuariosDatosEncapsulados> listaArreglos = new ArrayList<UsuariosDatosEncapsulados>();
           
            while (rset.next()) 
            {
                objUsuarios.setsLugarNacimiento(rset.getString("ciudad"));
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
     public static int recuperarContrasenia(UsuariosDatosEncapsulados objUsuarios)
    {
        Connection con = UsuariosModelo.conectaDB();
        String sSQL = "UPDATE usuarios SET contrasenia=? WHERE nombre=?";
        try {
            PreparedStatement pst=con.prepareStatement(sSQL);
            pst.setString(1,objUsuarios.getContrasena());
            pst.setString(2,objUsuarios.getNombreUsuario());
            int n=pst.executeUpdate();
            if (n!=0) {
                JOptionPane.showMessageDialog(null, "Modificacion exitosa ");
                return 0;
            }else{
                return 1;
            }
            
         } catch (SQLException | NullPointerException | HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro...\nCodigo error:\n"+e);
            return 1;
            
        }
    }
}
