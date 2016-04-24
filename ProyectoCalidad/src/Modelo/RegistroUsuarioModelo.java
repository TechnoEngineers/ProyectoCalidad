/*
 * Techno Engineers
 * Registro Usuarios Modelo
 * 18/04/2016 -- Autorizo: Luis Nava Ramirez // Rogelio Bernal Escobar
 * Modificaciones: Jonathan Rojas Simon
 * Sirve para manejar los datos de la tabla "usuarios" de la base de datos como objetos en el sistema
 * Numero de metodos en el codigo: 5
 * Interfaces: 1
 */
package Modelo;

import Ayuda.DatosConexion;
import Vista.mensajes.Mensajes;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Techno Engineers
 */

public class RegistroUsuarioModelo
{

    Conexion conexion;

    public RegistroUsuarioModelo()
    {
        conexion = new Conexion();

    }

    /**
     * Crear métodos para la transacción de los datos conparando con la base de
     * datos
     *
     * @return regresa un valor nulo.
     */
    public static Connection conectaDB()
    {
        Conexion x = new Conexion();
        try
        {
            return x.Conecta("localhost", "trajin", "root", "12345");
        } catch (Exception ex)
        {
            return null;
        }
    }

    /**
     * Se desconecta de la base de datos.
     *
     * @param con recibe el parametro para saber si esta conectada a la base de
     * datos.
     */
    public static void desconectaDB(Connection con)
    {
        Conexion x = new Conexion();
        x.desconectar(con); //Se le asigna el valor para desconectar de la base de datos.
    }

    /**
     * Metodo el cual envía el valor para desconectar de la base de datos.
     *
     * @param conect
     */
    public void desconectar(Connection conect)
    {
        conect = null;
    }

    public boolean registrarUsuarios(UsuariosDatosEncapsulados objUsuariosDatosEncapsulados)
    {
        DatosConexion objConexion = new DatosConexion();
        Connection cConnection = DatosConexion.conectaDB();
        JFrame objJFrame = new JFrame();

        if (cConnection != null)
        {
            String sEntrada = "null,"
                    + "'" + objUsuariosDatosEncapsulados.getcTipoUsuario()
                    + "','" + objUsuariosDatosEncapsulados.getsUsuario()
                    + "','" + objUsuariosDatosEncapsulados.getContrasena()
                    + "'," + objUsuariosDatosEncapsulados.getiStatus()
                    + ",curdate()"
                    + ",1"
                    + ",'" + objUsuariosDatosEncapsulados.getsNombre()
                    + "','" + objUsuariosDatosEncapsulados.getsApellidoPaterno()
                    + "','" + objUsuariosDatosEncapsulados.getsApellidoMaterno()
                    + "'," + objUsuariosDatosEncapsulados.getiEdad()
                    + ",'" + objUsuariosDatosEncapsulados.getcSexo()
                    + "','" + objUsuariosDatosEncapsulados.getsCalle()
                    + "'," + objUsuariosDatosEncapsulados.getiNumero()
                    + ",'" + objUsuariosDatosEncapsulados.getsColonia()
                    + "','" + objUsuariosDatosEncapsulados.getsCiudad()
                    + "','" + objUsuariosDatosEncapsulados.getsEstado()
                    + "'," + objUsuariosDatosEncapsulados.getiCp()
                    + "," + objUsuariosDatosEncapsulados.getiTelCelular()
                    + "," + objUsuariosDatosEncapsulados.getiTelCasa()
                    + "," + objUsuariosDatosEncapsulados.getiTelOficina()
                    + ",'" + objUsuariosDatosEncapsulados.getsEmail()
                    + "','" + objUsuariosDatosEncapsulados.getsFechaNacimiento()
                    + "','" + objUsuariosDatosEncapsulados.getsLugarNacimiento()
                    + "','" + objUsuariosDatosEncapsulados.getcEstadoCivil()
                    + "','" + objUsuariosDatosEncapsulados.getsPasaporteSN()
                    + "','" + objUsuariosDatosEncapsulados.getsVigenciaPasaporte()
                    + "'," + objUsuariosDatosEncapsulados.getiNoCartillaMilitar()
                    + "," + objUsuariosDatosEncapsulados.getdEstatura()
                    + ",'" + objUsuariosDatosEncapsulados.getsResponsable()
                    + "','" + objUsuariosDatosEncapsulados.getsTipoSanguineo()
                    + "','" + objUsuariosDatosEncapsulados.getsAlergias()
                    + "','" + objUsuariosDatosEncapsulados.getsEnfermedades()
                    + "','" + objUsuariosDatosEncapsulados.getsNombreMedicoCabecera()
                    + "'," + objUsuariosDatosEncapsulados.getiTelMedicoDeCabecera()
                    + ",'" + objUsuariosDatosEncapsulados.getsMedicacionDiarrea()
                    + "','" + objUsuariosDatosEncapsulados.getsMedicacionDolorDeCabeza()
                    + "','" + objUsuariosDatosEncapsulados.getsMedicacionDolorDeEstomago()
                    + "','" + objUsuariosDatosEncapsulados.getsMedicacionDolorMuscular()
                    + "','" + objUsuariosDatosEncapsulados.getsMedicacionGripa()
                    + "','" + objUsuariosDatosEncapsulados.getsMedicacionOtro()
                    + "','" + objUsuariosDatosEncapsulados.getsFormaDeEnterarse()
                    + "','" + objUsuariosDatosEncapsulados.getsBaila()
                    + "','" + objUsuariosDatosEncapsulados.getsBaile()
                    + "','" + objUsuariosDatosEncapsulados.getsAnteriorBallet()
                    + "','" + objUsuariosDatosEncapsulados.getsTiempoQueBailo()
                    + "','" + objUsuariosDatosEncapsulados.getsRespuestaSecreta()
                    + "','" + objUsuariosDatosEncapsulados.getsComentario()
                    + "'";
            Querys q = new Querys();
            q.Insertar(cConnection, "usuarios", sEntrada);

            try
            {
                this.desconectar(cConnection);
                Mensajes.exito(objJFrame);
                return true;
            } catch (Exception ex)
            {
                Mensajes.msj(objJFrame, "Error en DB... " + ex.getMessage());
                return false;
            }
        }
        return false;
    }

    public static int consultarUsuarios(RegistroUsuarioDatosEncapsulados objConsultaDatos)
    {

        JFrame objFrame = new JFrame();
        Mensajes objMensajes = new Mensajes();

        try
        {
            Connection con = UsuariosModelo.conectaDB();
            Statement stmt = con.createStatement();
            ResultSet rset;

            rset = stmt.executeQuery("SELECT idusuario,nombre,apellidopaterno,apellidomaterno FROM usuarios WHERE nombre='" + objConsultaDatos.getsNombre() + "'");

            ArrayList<RegistroUsuarioDatosEncapsulados> listaArreglos = new ArrayList<RegistroUsuarioDatosEncapsulados>(); // Se crea una lista de arreglos de usuarios.

            while (rset.next())
            {
                objConsultaDatos.setiIdUsuario(rset.getInt("idusuario"));
                objConsultaDatos.setsNombre(rset.getString("nombre"));
                objConsultaDatos.setsApellidoPaterno(rset.getString("apellidopaterno"));
                objConsultaDatos.setsApellidoMaterno(rset.getString("apellidomaterno"));
                listaArreglos.add(objConsultaDatos);
            }

            if (listaArreglos.size() > 0)
            {
                return 0;
            }
            stmt.close();
            UsuariosModelo.desconectaDB(con); //Despues de haber hecho la busqueda se desconecta de la base de datos.
        } catch (SQLException ex)
        {
            Logger.getLogger(RegistroUsuarioModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 1;

    }
}
