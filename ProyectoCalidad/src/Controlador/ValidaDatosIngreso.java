/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author angelcareaga
 */
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ValidaDatosIngreso
{

    final JPanel jPanel = new JPanel();

    public static int usu = 0,
    iUsuarioValido = 0, 
    iCajaContraseniaVacia = 1, 
    iUsuc = 0, 
    iNoLimpiarCaja = 0, 
    iCajaUsuarioVacia = 0;
    public static String sUsuarioSinEspacios = "";
    public int validaCadenaAlfanumerica(String cad, String sTipoValidacion)
    {
        String cad1 = QuitaEspaciosBlancos(cad);
        cad1 = sUsuarioSinEspacios;
        int num = 0, num1 = 0, num2 = 0;
        char letras[] =
        {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        char numeros[] =
        {
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'
        };
        boolean bUsuarioCorrecto=true;
        char[] cadt = cad1.toCharArray();
        if (cad.length() <= 0)
        {
            JOptionPane.showMessageDialog(jPanel, "Falta usuario, intentelo de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            iNoLimpiarCaja = 1;
            iCajaUsuarioVacia = 1;
        } else
        {
            if (cad.length() >= 6 && cad.length() <= 100)
            {
                iCajaUsuarioVacia = 0;
                num = 0;
                for (int i = 0; i < cadt.length; i++)
                {

                    for (int j = 0; j < numeros.length; j++)
                    {
                        String temp = Character.toString(cadt[i]);
                        String temp2 = Character.toString(numeros[j]);

                        if (temp.equals(temp2))
                        {
                            num = num + 1;
                            num1 = 1;
                        }

                    }
                }

                for (int i = 0; i < cadt.length; i++)
                {

                    for (int j = 0; j < letras.length; j++)
                    {
                        String temp = Character.toString(cadt[i]);
                        String temp2 = Character.toString(letras[j]);
                        if (temp.equals(temp2))
                        {
                            num = num + 1;
                            num2 = 1;
                        }

                    }
                }
                bUsuarioCorrecto=true;
                for (int i = 0; i < cad1.length(); i++)
                {
                    if(cadt[i]>=65 && cadt[i]<=90)
                    {
                        bUsuarioCorrecto=true;
                    }else
                    {
                       if(cadt[i]>=97 && cadt[i]<=122)
                        {
                            bUsuarioCorrecto=true;
                        }else
                        {
                            if(cadt[i]>=48 && cadt[i]<=59)
                            {
                                bUsuarioCorrecto=true;
                            }else
                            {
                                bUsuarioCorrecto=false;
                                
                            }
                        } 
                    }
                    
                }

                iUsuarioValido = 0;

                if (num != cad.length() && cad1.toString() != sUsuarioSinEspacios)
                {
                    JOptionPane.showMessageDialog(jPanel, "Nombre de "+sTipoValidacion+" invalido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    iUsuarioValido = 1;
                } else
                {
                    if (sTipoValidacion.equals("usuario"))
                    {
                        if (num1 != num2)
                    {
                        JOptionPane.showMessageDialog(jPanel, "Nombre de "+sTipoValidacion+" invalido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                        iUsuarioValido = 1;
                    } else
                    {
                        iUsuarioValido = 0;
                    }
                    }
                }
            } else
            {
                JOptionPane.showMessageDialog(jPanel, "Nombre de "+sTipoValidacion+" invalido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                iUsuarioValido = 1;
            }
            if (bUsuarioCorrecto==false )
            {
                JOptionPane.showMessageDialog(jPanel, "Nombre de "+sTipoValidacion+" invalido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                iUsuarioValido = 1;
            }
        }
        return usu;
    }

    public int validaContrasenia(String cad)
    {
        iNoLimpiarCaja = 0;
        iCajaContraseniaVacia = 1;
        if (cad.length() >= 4 && cad.length() <= 100)
        {
            iCajaContraseniaVacia = 0;
            iUsuc = 1;
        } else
        {
            iCajaContraseniaVacia = 0;
            if (cad.length() <= 0)
            {
                JOptionPane.showMessageDialog(jPanel, "Falta contraseña, intentelo de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                iNoLimpiarCaja = 1;
                iCajaContraseniaVacia = 1;
            } else
            {
                JOptionPane.showMessageDialog(jPanel, "Contraseña invalida.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                iCajaContraseniaVacia = 1;
            }
            iUsuarioValido = 1;
            iUsuc = 0;
            iCajaContraseniaVacia = 1;
        }
        return iUsuc;
    }

    public static String QuitaEspaciosBlancos(String cad)
    {

        String sCadenaSinBlancos = cad.trim();
        sUsuarioSinEspacios = sCadenaSinBlancos;
        return sUsuarioSinEspacios;
    }
    
    public static String ValidaCorreo(String cad)
    {
        
        
        return cad;
    }
}
