/*
 * Techno Engineers
 * Login
 * 17/04/2016 -- Autorizo: Jonathan Rojas Simón // scrum master
 * Modificaciones: 
 * Modelo que realiza las operaciones a la tabla vestuarios de la base de datos trajin
 * Numero de métodos en el código: 0
 * Interfaces: 
 */
package Modelo;

import java.sql.Connection;
import java.sql.Statement;
import Ayuda.DatosConexion;
import Vista.mensajes.Mensajes;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VestuariosModelo
{

    public boolean registrarVestuarios(VestuariosDatosEncapsulados objVestuariosDatosEncapsulados)
    {

        DatosConexion objConexion = new DatosConexion();
        JFrame objFrame=new JFrame();
        Mensajes objMensajes=new Mensajes();
        try
        {
            Connection cConnection = DatosConexion.conectaDB();
            PreparedStatement rset = cConnection.prepareStatement("INSERT INTO vestuarios (tipo, descripcion, color, sexo) VALUES (?, ?, ?, ?); ");

            rset.setString(1, String.valueOf(objVestuariosDatosEncapsulados.getcTipo()));
            rset.setString(2, objVestuariosDatosEncapsulados.getsDescripcion());
            rset.setString(3, objVestuariosDatosEncapsulados.getScolor());
            rset.setString(4, String.valueOf(objVestuariosDatosEncapsulados.getcSexo()));
            int n = rset.executeUpdate();
            
            if (n != 0)
            {
                return true;
            } else
            {
                return false;
            }

        } catch (Exception e)
        {
            objMensajes.falla(objFrame,"Error en la conexión "+e.getMessage());
            return false;
        }
    }
    
    public DefaultTableModel mostrarVestuarios(String sBuscar)
    {
        String campos[] =
        {
            "Id", "Tipo", "Descripcion", "Color", "Sexo", "Opciones"
        };

        JFrame jf = new JFrame();
        String registros[] = new String[6];
        DefaultTableModel objDtm = new DefaultTableModel(null, campos);

        try
        {

            Connection cConnection = DatosConexion.conectaDB();
            Statement st = cConnection.createStatement();
            ResultSet rs = st.executeQuery("select idvestuario,tipo,descripcion,color,sexo from vestuarios where descripcion like '%" + sBuscar + "%' order by descripcion");
            while (rs.next())
            {

                registros[0] = rs.getString("idvestuario");
                registros[1] = rs.getString("tipo");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("color");
                registros[4] = rs.getString("sexo");
                registros[5] = "Editar";

                objDtm.addRow(registros);

            }
            return objDtm;
        } catch (SQLException | HeadlessException e)
        {
            Mensajes.falla(jf);
            return objDtm;
        }

    }
    
}
