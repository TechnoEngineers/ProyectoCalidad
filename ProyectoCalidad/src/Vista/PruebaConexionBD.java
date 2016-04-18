/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.*;
import Modelo.Conexion;

/**
 * La clase principal que hace la conexión.
 * @author Luiz
 */
public class PruebaConexionBD {

    /**En la clase principal se hace la conexión con la base de datos.
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        Conexion con = new Conexion();
        con.Conecta("localhost", "trajin", "root", "123456"); //mandamos traer el metodo para verificar conexion
 
    }
    
}
