/*
 * Techno Engineers
 * Login
 * 17/04/2016 -- Autorizo: Jonathan Rojas Simón // scrum master
 * Modificaciones: 
 * Conexión a la base de datos
 * Numero de métodos en el código: 0
 * Interfaces: 
 */
package Ayuda;

import java.sql.Connection;
import java.sql.SQLException;

public class DatosConexion
{
    public static Connection conectaDB()
    { 
        Modelo.Conexion x = new Modelo.Conexion();
        try
        {
            return x.Conecta("localhost", "trajin", "root", "101125");
        } catch (SQLException ex)
        {
            return null;
        }   
    }
}
