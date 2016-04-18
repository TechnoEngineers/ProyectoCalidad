/*
 * Techno Engineers
 * Login
 * 17/04/2016 -- Autorizo: Jonathan Rojas Simón // scrum master
 * Modificaciones: 
 * Genera los datos encapsulados de la clase Vestuarios
 * Numero de métodos en el código: 0
 * Interfaces: 
 */
package Modelo;

public class VestuariosDatosEncapsulados
{

    private int iIdVestuario;
    private char cTipo;
    private String sDescripcion;
    private String scolor;
    private char cSexo;

    public int getiIdVestuario()
    {
        return iIdVestuario;
    }

    public void setiIdVestuario(int iIdVestuario)
    {
        this.iIdVestuario = iIdVestuario;
    }

    public char getcTipo()
    {
        return cTipo;
    }

    public void setcTipo(char cTipo)
    {
        this.cTipo = cTipo;
    }

    public String getsDescripcion()
    {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion)
    {
        this.sDescripcion = sDescripcion;
    }

    public String getScolor()
    {
        return scolor;
    }

    public void setScolor(String scolor)
    {
        this.scolor = scolor;
    }

    public char getcSexo()
    {
        return cSexo;
    }

    public void setcSexo(char cSexo)
    {
        this.cSexo = cSexo;
    }

}
