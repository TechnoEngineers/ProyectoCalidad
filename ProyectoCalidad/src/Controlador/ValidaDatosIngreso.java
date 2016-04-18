/*
 * Techno Engineers
 * ValidaDatosIngreso
 * 17/04/2016 -- Autorizo: Miguel Ángel Careaga Gómez // Desarrollo.
 * Modificaciones: Se actualizo el algoritmo de busqueda alfanumerico.
 * Sirve para verificar cajas de texto de diferetes interfaces; login, RecuperarContraseña, VerificarUsuario,RecuperarContraseña.
 * Numero de metodos en el codigo: 3
 * Interfaces: 0
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

/**
 * Este metodo es utilizado para la validación de algunas cajas de texto contenidas en clases como Login, RecuperarContrasena, VerificarUsuario,
 * VerificarPreguntas.
 * @author angelcareaga
 */
public class ValidaDatosIngreso
{
    /**
     * Declaración de variables a ocupar en diferentes clases:
     * sEstructuraValidaEmail; Almacena expresión regular para validar el correo.
     * iCadenaInvalida; Almacena la validación en caso de que la cadena recibida sea invalida.
     * bUsuarioValido; Almacena la validación en caso de que el usuario sea valido.
     * bContraseniaValida; Almacena la validación en caso de que la contraseña sea valida.
     * bCajaContraseniaVacia; Almacena la validación en caso de que la caja contraseña este vacia.
     * bLimpiarCaja; Almacena la validación en caso de que se quiera limpiar las cajas de texto.
     * bCorreoValido; Almacena la validación en caso de que el correo sea valido.
     * sCadenaSinEspacios; Se usa la variable para guardar la cadena sin espacios.
     */
    private static final String sEstructuraValidaEmail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    final JPanel jPanel = new JPanel();
    public static int iCadenaInvalida = 0;
    public static boolean bUsuarioValido = false,
            bContraseniaValida = false, bCajaContraseniaVacia = true,
            bLimpiarCaja = true, bCorreoValido = false;
    public static String sCadenaSinEspacios;

    /**
     * En este metodo se valida la cadena alfanumerica de Usuario, ciudad y cualquier otro que requiera verificar si es alfanumerica.
     * @param sCadena la cadena es recibida desde su llamado para validarla.
     * @param sTipoValidacion Recibe el tipo de validación, ya sea de usuario, ciudad o cualquier otro, esto para mostrar mensajes correctos.
     * @param sOtraValidacion Recibe otro dato de validación, esto es porque se queriere un auxiliar en la clase VerificarPreguntas, esto ayuda a mostrar los mensajes correctos.
     * @return regresa la cadena recibida pero sin espacios.
     */
    public String validaCadenaAlfanumerica(String sCadena, String sTipoValidacion, String sOtraValidacion)
    {
        sCadenaSinEspacios = sCadena.trim(); //Pasa la cadena recibica a una cadena sin espacios.
        /**
         * Declaración de variables a ocupar.
         * iNoAlfanumerico; Cambiará el valor dependiendo si es alfanumerica o no.
         * iAlfanumericoMinuscula; Cambiará el valor dependiendo si a cadena contiene un caracter con letra minuscula.
         * iAlfanumericoMayuscula; Cambiará el valor dependiendo si a cadena contiene un caracter con letra mayuscula.
         * iAlfanumericoNumerico; Cambiará el valor dependiendo si a cadena contiene un caracter con un número.
         * caCadenaArreglo; con la función toCharArray() va a convertir la cadena recibida sin espaciós a un arreglo de caracteres y se van a asignar a esta variable.
         */
        int iNoAlfanumerico = 0, iAlfanumericoMinuscula = 0,
                iAlfanumericoMayuscula = 0, iAlfanumericoNumero = 0;
        char[] caCadenaArreglo = sCadenaSinEspacios.toCharArray();
        
        bUsuarioValido = true;

        if (sCadenaSinEspacios.length() <= 0) //Valida que la cadena no este vacía.
        {
            JOptionPane.showMessageDialog(jPanel, "Falta " + sOtraValidacion + ", intentelo de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else
        {
            if (sCadenaSinEspacios.length() >= 5 && sCadenaSinEspacios.length() <= 100) 
            {
                for (int i = 0; i < sCadenaSinEspacios.length(); i++)
                {
                    if (caCadenaArreglo[i] >= 65 && caCadenaArreglo[i] <= 90)//Valida que cada caracter entre en el codico ascii utilizando así caracteres entre el 65 y 90, que son caracteres de letras en mayuscula.
                    {
                        iAlfanumericoMinuscula = 1;
                    } else
                    {
                        if (caCadenaArreglo[i] >= 97 && caCadenaArreglo[i] <= 122) //Valida que cada caracter entre en el codico ascii utilizando así caracteres entre el 97 y 122, que son caracteres de letras en minuscula.
                        {
                            iAlfanumericoMayuscula = 1;
                        } else
                        {
                            if (caCadenaArreglo[i] >= 48 && caCadenaArreglo[i] <= 59)//Valida que cada caracter entre en el codico ascii utilizando así caracteres entre el 48 y 59, que son caracteres de numeros.
                            {
                                iAlfanumericoNumero = 1; //Si es correcto entonces es alfanumerico.
                            } else
                            {
                                iNoAlfanumerico = 1; //Si alguno es incorrecto entonces no es alfanumerico.
                            }
                        }
                    }
                }
                if (iNoAlfanumerico == 1)
                {
                    iCadenaInvalida = 1; //Si no es cadena alfanumerica entonces la cadena es invalida.
                } else
                {
                    if (iAlfanumericoMayuscula == 1 && iAlfanumericoNumero == 1)
                    {
                        iCadenaInvalida = 0; //Si es cadena alfanumerica y cumple con los requisitos de usuario entonces la cadena es valida.
                        bUsuarioValido = true; //El usuario es valido, asigna el valor de true.
                        System.out.println(sTipoValidacion + " correct@");
                    } else
                    {
                        if (iAlfanumericoMinuscula == 1 && iAlfanumericoNumero == 1)
                        {
                            iCadenaInvalida = 0; //Si es cadena alfanumerica y cumple con los requisitos de usuario entonces la cadena es valida.
                            bUsuarioValido = true; //El usuario es valido, asigna el valor de true.
                            System.out.println(sTipoValidacion + " correct@");
                        } else
                        {
                            bUsuarioValido = false; //El usuario es invalido, asigna el valor de false.
                            iCadenaInvalida = 1; //Si no es cadena alfanumerica y no cumple con los requisitos de usuario entonces la cadena es invalida.
                        }
                    }
                }
                if (sTipoValidacion.equals("ciudad")) //Si el parametro es de ciudad, admite letras y numeros, o solo letras pero no solo numeros.
                {
                    if (iAlfanumericoMayuscula == 1)
                    {
                        iCadenaInvalida = 0; //Si es cadena alfanumerica y cumple con los requisitos de ciudad entonces la cadena es valida.
                        bUsuarioValido = true; //La cadena es valida, asigna el valor de true.
                    } else
                    {
                        if (iAlfanumericoMinuscula == 1)
                        {
                            iCadenaInvalida = 0; //Si es cadena alfanumerica y cumple con los requisitos de ciudad entonces la cadena es valida.
                            bUsuarioValido = true; //La cadena es valida, asigna el valor de true.
                        } else
                        {
                            if (iAlfanumericoMinuscula == 1 && iAlfanumericoNumero == 1)
                            {
                                iCadenaInvalida = 0; //Si es cadena alfanumerica y cumple con los requisitos de ciudad entonces la cadena es valida.
                                bUsuarioValido = true; //La cadena es valida, asigna el valor de true.
                            } else
                            {
                                if (iAlfanumericoMayuscula == 1 && iAlfanumericoNumero == 1)
                                {
                                    iCadenaInvalida = 0; //Si es cadena alfanumerica y cumple con los requisitos de ciudad entonces la cadena es valida.
                                    bUsuarioValido = true; //La cadena es valida, asigna el valor de true.
                                } else
                                {
                                    bUsuarioValido = false; //La ciudad es invalida, asigna el valor de false.
                                    iCadenaInvalida = 1; //Si no es cadena alfanumerica y no cumple con los requisitos de ciudad entonces la cadena es invalida.
                                }
                            }
                        }
                    }
                }
                if (iCadenaInvalida == 1)//Si la cadena es invalida, manda un error.
                {
                    JOptionPane.showMessageDialog(jPanel, "Nombre de " + sTipoValidacion + " invalido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    bUsuarioValido = false;
                }
            } else
            {
                bUsuarioValido = false; //Si la cadena es invalida, manda un error.
                JOptionPane.showMessageDialog(jPanel, "Nombre de " + sTipoValidacion + " invalido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
        iCadenaInvalida = 0;
        return sCadenaSinEspacios;
    }

    /**
     * En validaContrasenia se valida la contraseña.
     * Se valido que fuera mayor de 4 y menor de 100 caracteres. Si no esta dentro de estos parametros manda error de contraseña invalida.
     * Se valido que la caja donde va la contraseña no mande a validar una cadena vacia, si es así, 
     * manda que falta la contraseña,
     * @param sCadena la cadena es recibida desde su llamado para validarla.
     * @return sCadena regresa la cadena recibida.
     */
    public String validaContrasenia(String sCadena)
    {
        bContraseniaValida=false;
        /**
         * En el siguiente if se valida que la contraseña este entre 4 y 100 caracteres. Si no es así valida que la cadena no 
         * sea menor o igual a cero caracteres, si es así, esta vacia, por lo tanto falta la contraseña.
         * Sí ninguna de las anteriores se cumple, entonces es invalida, ya que no entro en el primer if.
         */
        if (sCadena.length() >= 4 && sCadena.length() <= 100)
        {
            bContraseniaValida = true; //La contraseña es valida, por lo tanto le asigna a bContraseniaValida el valor de true.
            bCajaContraseniaVacia = false; //En base a que la contraseña es valida, entonces la caja no esta vacia, es por ello que le da un valor false a bCajaContraseniaVacia.
        } else
        {
            if (sCadena.length() <= 0)
            {
                JOptionPane.showMessageDialog(jPanel, "Falta contraseña, intentelo de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                bCajaContraseniaVacia = true; //En base a que la contraseña es invalida y la caja esta vacia, le da un valor true a bCajaContraseniaVacia.
                iCadenaInvalida = 1; //La contraseña es invalida entonces le asigna el valor de 1 a iCadenaInvalida, esto significa que es invalida.
                bUsuarioValido = false; //Ya que el usuario es invalido porque la caja esta vacia, se lo hace saber a la variable bUsuarioValido con el valor de false;
            } else
            {
                JOptionPane.showMessageDialog(jPanel, "Contraseña invalida. Minimo 4 caracteres.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                bUsuarioValido = false; //Ya que el usuario es invalido se lo hace saber a la variable bUsuarioValido con el valor de false;
            }
        }
        return sCadena;
    }

    /**
     * En esta funcion se valida el correo, esto lo hace mediante una expresión regular. También se valida que
     * la caja de correo no este vacía.
     * @param sCadena la cadena es recibida desde su llamado para validarla.
     * @return bCorreoValido regresa el valor si es valido el correo recibido o no.
     */
    public boolean validaCorreo(String sCadena)
    {
        sCadenaSinEspacios = sCadena.trim(); //Limpia la cadena de los espacios al final y al principio.
        /**
         * En el siguiente if:
         * Valida que la cadena sin espacios sea menor que cero, si eso pasa manda un mensaje de error,
         * ya que se requiere validar que haya correo y que sea valido.
         * Si no se cumple la condición entra en else.
         */
        if (sCadenaSinEspacios.length() <= 0) 
        {
            JOptionPane.showMessageDialog(jPanel, "Falta correo, intentelo de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else
        {
            Pattern pattern = Pattern.compile(sEstructuraValidaEmail); //Guarda la expresión regular en un patrón.
            Matcher matcher = pattern.matcher(sCadena); //Compara la cadena recibida con la expresion almacenada en el patron.
            bCorreoValido = matcher.matches(); //matches nos regresa un valor booleano si se cumple la expresión, lo almacena en bCorreoValido.
            if (bCorreoValido!=true) //Si el correo es falso(invalido) entonces manda un error en pantalla.
            {
                JOptionPane.showMessageDialog(jPanel, "Correo invalido, intentelo de nuevo.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        }
        return bCorreoValido; //Regresa el valor, el correo puede ser falso o verdadero.
    }

}
