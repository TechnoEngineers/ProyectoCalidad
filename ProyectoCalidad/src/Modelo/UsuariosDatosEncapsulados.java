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

public class UsuariosDatosEncapsulados
{
    String sNombreUsuario;
    String sContrasena;

    public UsuariosDatosEncapsulados()
    {
        sNombreUsuario="";
        sContrasena="";
    }
    public UsuariosDatosEncapsulados(String sNombreUsuario, String sContrasena){
        this.sNombreUsuario=sNombreUsuario;
        this.sContrasena=sContrasena;
    }
    //Esto es para encapsular los atributos de Usuarios para usarlos como objetos en el sistema
    public String getNombreUsuario() 
    {
        return sNombreUsuario;
    }

    public void setNombreUsuario(String sNombreUsuario) 
    {
        this.sNombreUsuario = sNombreUsuario;
    }

    public String getContrasena() {
        return sContrasena;
    }

    public void setContrasena(String sContrasena) 
    {
        this.sContrasena = sContrasena;
    }
    
    
    
}
