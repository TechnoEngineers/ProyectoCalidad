/*
 * Techno Engineers
 * Manipular
 * 12/04/2016 -- Autorizo: Marvin Atzael Hernández Benítez // Lider de proyecto
 * Modificaciones: 
 * Sirve para validar los componentes de las interfaces
 * Numero de métodos en el codigo: 0
 * VerificarUsuario: 
 */
package Controlador;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Manipular
{
    public static void limpiaCajas(JTextField ... cajas)
    {
        for (int i = 0; i < cajas.length; i++)
        {
            cajas[i].setText("");
        }
    }
    public static void deshabilitaObj(boolean b, Object ... obj)
    {
        for (int i = 0; i < obj.length; i++)
        {
            if(obj[i] instanceof JTextField)
            {
                JTextField cajas= (JTextField) obj[i];
                cajas.setEnabled(b);
            }else
            {
                if(obj[i] instanceof JButton)
                {
                    JButton btn= (JButton) obj[i];
                    btn.setEnabled(b);
                }
            }
        }
    }
    
    public static void seleccionaCaja(JTextField jt)
    {
        jt.setSelectionStart(0);
        jt.setSelectionEnd(jt.getText().length());
        jt.requestFocus();
    }
    public static void cambioObj(Object obj)
    {
        if(obj != null)
        {
            if(obj instanceof JTextField)
            {
                JTextField jt = (JTextField) obj;
                Manipular.deshabilitaObj(true, jt);
                Manipular.seleccionaCaja(jt);
            }else
            {
                if(obj instanceof JButton)
                {
                    JButton jb= (JButton)obj;
                    Manipular.deshabilitaObj(true,jb );
                    jb.requestFocus();
                }
            }
                
        }
        
    }
}
