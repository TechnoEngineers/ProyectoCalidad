/*
 * Techno Engineers
 * Login
 * 23/04/2016 -- Autorizo: Oscar De Paz Feliciano
 * Consulta: 
 * Modelo que realiza las operaciones a la tabla cuadros de la base de datos trajin
 * Numero de métodos en el código: 1
 * Clase: 
 */
package Modelo;

import Ayuda.DatosConexion;
import Vista.mensajes.Mensajes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mgool
 */
public class CuadrosModelo
{
    public DefaultTableModel buscarCuadros(String sBuscar)
    {
        String saCampos[]=
        {
            "Id","Nombre del cuadro","Tiempo de cambio","Opciones"
        };
        
        JFrame jf = new JFrame();
        String saRegistros[] = new String[4];
        DefaultTableModel objDefaultTableModel = new DefaultTableModel(null, saCampos);
       
        try
        {
            Connection cConnection = DatosConexion.conectaDB();
            Statement st = cConnection.createStatement();
            ResultSet rs = st.executeQuery("SELECT idcuadro,nombre, tiempocambio FROM cuadros WHERE nombre LIKE '%" +sBuscar+ "%' ORDER BY nombre ;");
            while (rs.next())
            {

                saRegistros[0] = rs.getString("idcuadro");
                saRegistros[1] = rs.getString("nombre");
                saRegistros[2] = rs.getString("tiempocambio");
                saRegistros[3] = "Editar";

                objDefaultTableModel .addRow(saRegistros);

            }
            return objDefaultTableModel;
        } catch (Exception e)
        {
            Mensajes.falla(jf, e.getMessage());;
            return objDefaultTableModel;
        }
    }
    
}
