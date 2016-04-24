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
//Cambio gio

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 * Realiza la manipulación de las cajas de texto.
 *
 * @author Anonimus
 */
public class Manipular
{

    /**
     * Realiza la limpieza de las cajas de texto.
     *
     * @param cajas recibe las cajas a limpiar.
     */
    public static void limpiaCajas(JTextField... cajas)
    {
        for (int i = 0; i < cajas.length; i++) //Recibe las cajas de texto y las limpia hasta que ya no quede ninguna llena.
        {
            cajas[i].setText(null); //Les asigna el valor null, para valor nulo.
        }
    }

    public static void habObjetos(boolean b, Object... arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            limpia(arr[i]);
            deshabilitaObj(b, arr[i]);
        }
    }

    public static void limpia(Object obj)
    {
        if (obj instanceof JTextField)
        {
            JTextField jt = (JTextField) obj;

            jt.setText("");
        }
    }

    /**
     * Desabilita los objetos.
     *
     * @param b recibe un valor falso o verdadero.
     * @param obj recibe el objeto.
     */
    public static void deshabilitaObj(boolean b, Object... obj)
    {
        for (int i = 0; i < obj.length; i++)
        {
            if (obj[i] instanceof JTextField)
            {
                JTextField cajas = (JTextField) obj[i];
                cajas.setEnabled(b);
            } else
            {
                if (obj[i] instanceof JButton)
                {
                    JButton btn = (JButton) obj[i];
                    btn.setEnabled(b);
                } else
                {
                    if (obj[i] instanceof JComboBox)
                    {
                        JComboBox cb = (JComboBox) obj[i];
                        cb.setEnabled(b);
                    }
                }
            }
        }
    }

    /**
     * Recibe el valor de la caja y la longitud.
     *
     * @param jt recibe lo que hay en la caja de texto.
     */
    public static void seleccionaCaja(JTextField jt)
    {
        jt.setSelectionStart(0);
        jt.setSelectionEnd(jt.getText().length());
        jt.requestFocus();
    }

    /**
     * Cambia el objeto, selecciona la caja y la desabilita.
     *
     * @param obj recibe el objeto.
     */
    public static void cambioObj(Object obj)
    {
        if (obj != null)
        {
            if (obj instanceof JTextField)
            {
                JTextField jt = (JTextField) obj;
                Manipular.deshabilitaObj(true, jt);
                Manipular.seleccionaCaja(jt);
            } else
            {
                if (obj instanceof JButton)
                {
                    JButton jb = (JButton) obj;
                    Manipular.deshabilitaObj(true, jb);
                    jb.requestFocus();
                } else
                {
                    if (obj instanceof JComboBox)
                    {
                        JComboBox jcb = (JComboBox) obj;
                        Manipular.deshabilitaObj(true, jcb);
                        jcb.requestFocus();
                    }
                }
            }

        }

    }

    public static boolean verificaVacia(JTextField jf)
    {
        if (jf.getText().equals(""))
        {
            return true;
        } else
        {
            return false;
        }
    }

}
