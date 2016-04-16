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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ValidaDatosIngreso
{

    private static final String sEstructuraValidaEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    final JPanel jPanel = new JPanel();
    public static int iCadenaInvalida = 0;
    public static boolean bUsuarioValido = false,
            bContraseniaValida = false, bCajaContraseniaVacia = true,
            bLimpiarCaja = true, bCorreoValido = false;
    public static String sCadenaSinEspacios;

    public String validaCadenaAlfanumerica(String sCadena, String sTipoValidacion, String sOtraValidacion)
    {
        sCadenaSinEspacios = sCadena.trim();
        int iNoAlfanumerico = 0, iAlfanumericoMinuscula = 0,
                iAlfanumericoMayuscula = 0, iAlfanumericoNumero = 0;
        char[] cCadenaArreglo = sCadenaSinEspacios.toCharArray();
        bUsuarioValido = true;

        if (sCadenaSinEspacios.length() <= 0)
        {
            JOptionPane.showMessageDialog(jPanel, "Falta " + sOtraValidacion + ", intentelo de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else
        {
            System.out.println(bUsuarioValido);
            if (sCadenaSinEspacios.length() >= 5 && sCadenaSinEspacios.length() <= 100)
            {
                for (int i = 0; i < sCadenaSinEspacios.length(); i++)
                {

                    if (cCadenaArreglo[i] >= 65 && cCadenaArreglo[i] <= 90)
                    {
                        iAlfanumericoMinuscula = 1;
                    } else
                    {
                        if (cCadenaArreglo[i] >= 97 && cCadenaArreglo[i] <= 122)
                        {
                            iAlfanumericoMayuscula = 1;
                        } else
                        {
                            if (cCadenaArreglo[i] >= 48 && cCadenaArreglo[i] <= 59)
                            {
                                iAlfanumericoNumero = 1;
                            } else
                            {
                                System.out.println(cCadenaArreglo[i]);
                                iNoAlfanumerico = 1;
                            }
                        }
                    }

                }
                if (iNoAlfanumerico == 1)
                {
                    iCadenaInvalida = 1;
                } else
                {
                    if (iAlfanumericoMayuscula == 1 && iAlfanumericoNumero == 1)
                    {
                        iCadenaInvalida = 0;
                        bUsuarioValido = true;
                        System.out.println(sTipoValidacion + " correct@");
                    } else
                    {
                        if (iAlfanumericoMinuscula == 1 && iAlfanumericoNumero == 1)
                        {
                            iCadenaInvalida = 0;
                            bUsuarioValido = true;
                            System.out.println(sTipoValidacion + " correct@");
                        } else
                        {
                            bUsuarioValido = false;
                            iCadenaInvalida = 1;
                        }
                    }

                }
                System.out.println(sTipoValidacion);
                if (sTipoValidacion.equals("ciudad"))
                {
                    if (iAlfanumericoMayuscula == 1)
                    {
                        iCadenaInvalida = 0;
                        bUsuarioValido = true;
                    } else
                    {
                        if (iAlfanumericoMinuscula == 1)
                        {
                            iCadenaInvalida = 0;
                            bUsuarioValido = true;
                        } else
                        {
                            if (iAlfanumericoMinuscula == 1 && iAlfanumericoNumero == 1)
                            {
                                iCadenaInvalida = 0;
                                bUsuarioValido = true;
                            } else
                            {
                                if (iAlfanumericoMayuscula == 1 && iAlfanumericoNumero == 1)
                                {
                                    iCadenaInvalida = 0;
                                    bUsuarioValido = true;
                                } else
                                {
                                    bUsuarioValido = false;
                                    iCadenaInvalida = 1;
                                }
                            }
                        }
                    }
                }

                if (iCadenaInvalida == 1)
                {
                    JOptionPane.showMessageDialog(jPanel, "Nombre de " + sTipoValidacion + " invalido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    bUsuarioValido = false;
                }
            } else
            {
                bUsuarioValido = false;
                JOptionPane.showMessageDialog(jPanel, "Nombre de " + sTipoValidacion + " invalido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
        iCadenaInvalida = 0;
        return sCadenaSinEspacios;
    }

    public String validaContrasenia(String cCadena)
    {
        if (cCadena.length() >= 4 && cCadena.length() <= 100)
        {
            bContraseniaValida = true;
            bCajaContraseniaVacia = false;
        } else
        {
            if (cCadena.length() <= 0)
            {
                JOptionPane.showMessageDialog(jPanel, "Falta contraseña, intentelo de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                bCajaContraseniaVacia = true;
                iCadenaInvalida = 1;
                bUsuarioValido = false;
            } else
            {
                JOptionPane.showMessageDialog(jPanel, "Contraseña invalida.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                bUsuarioValido = false;
            }
        }
        return cCadena;
    }

    public boolean validaCorreo(String sCadena)
    {
        sCadenaSinEspacios = sCadena.trim();

        if (sCadenaSinEspacios.length() <= 0)
        {
            JOptionPane.showMessageDialog(jPanel, "Falta correo, intentelo de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else
        {
            /**
             * Valida email con la expresión regular.
             * 
             * @return regresa true si el correo es valido, de otra forma regresa false.
             */
            // Compiles the given regular expression into a pattern.
            Pattern pattern = Pattern.compile(sEstructuraValidaEmail);
            // Match the given input against this pattern
            Matcher matcher = pattern.matcher(sCadena);
            bCorreoValido = matcher.matches();
            if (bCorreoValido!=true)
            {
                JOptionPane.showMessageDialog(jPanel, "Correo invalido, intentelo de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }

        return bCorreoValido;
    }

}
