/*
 * Techno Engineers
 * Usuarios
 * 10/04/2016 -- Autorizo: Oscar de Paz Feliciano // Lider de proyecto
 * Modificaciones: 
 * Sirve para encapsular los datos de la tabla "usuarios" en la base de datos
 * Numero de metodos en el codigo: 0
 * Interfaces: 
 */
package Modelo;

/**
 *
 * @author Techno Engineers
 */

public class Usuarios
{
    String nombreUsuario;
    String contraseña;

    public Usuarios()
    {
        nombreUsuario="";
        contraseña="";
    }
    //Esto es para encapsular los atributos de Usuarios para usarlos como objetos en el sistema
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
}
