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
    private String sNombreUsuario;
    private String sContrasena;
    private int iTipoUsuario;
    private int iStatus;
    private String sFechaIngreso;
    private int iExpediente;
    private String sNombre;
    private String sApellidoPaterno;
    private String sApellidoMaterno;
    private int iEdad;
    private char cSexo;
    private String sCalle;
    private int iNumero;
    private String sColonia;
    private String sCiudad;
    private String sEstado;
    private int iCp;
    private int iTelCelular;
    private int iTelCasa;
    private int iTelOficina;
    private String sEmail;
    private String sFechaNacimiento;
    private String sLugarNacimiento;
    private String sEstadoCivil;
    private int iPasaporteSN;
    private String sVigenciaPasaporte;
    private int iNoCartillaMilitar;
    private int iEstatura;
    private String sTalla;
    private String sResponsable;
    private String sTipoSanguineo;
    private String sAlergias;
    private String sEnfermedades;
    private String sNombreMedicoCabecera;
    private int iTelMedicoDeCabecera;
    private String sMedicacionDolorDeCabeza;
    private String sMedicacionDolorDeEstomago;
    private String sMedicacionDolorMuscular;
    private String sMedicacionGripa;
    private String sMedicacionOtro;
    private String sFormaDeEnterarse;
    private char cBaila;
    private String sBaile;
    private String sAnteriorBallet;
    private String sTiempoQueBailo;
    private String sHorarioDisponible;
    private String sComentario;
    
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

    public int getiTipoUsuario()
    {
        return iTipoUsuario;
    }

    public void setiTipoUsuario(int iTipoUsuario)
    {
        this.iTipoUsuario = iTipoUsuario;
    }

    public int getiStatus()
    {
        return iStatus;
    }

    public void setiStatus(int iStatus)
    {
        this.iStatus = iStatus;
    }

    public String getsFechaIngreso()
    {
        return sFechaIngreso;
    }

    public void setsFechaIngreso(String sFechaIngreso)
    {
        this.sFechaIngreso = sFechaIngreso;
    }

    public int getiExpediente()
    {
        return iExpediente;
    }

    public void setiExpediente(int iExpediente)
    {
        this.iExpediente = iExpediente;
    }

    public String getsNombre()
    {
        return sNombre;
    }

    public void setsNombre(String sNombre)
    {
        this.sNombre = sNombre;
    }

    public String getsApellidoPaterno()
    {
        return sApellidoPaterno;
    }

    public void setsApellidoPaterno(String sApellidoPaterno)
    {
        this.sApellidoPaterno = sApellidoPaterno;
    }

    public String getsApellidoMaterno()
    {
        return sApellidoMaterno;
    }

    public void setsApellidoMaterno(String sApellidoMaterno)
    {
        this.sApellidoMaterno = sApellidoMaterno;
    }

    public int getiEdad()
    {
        return iEdad;
    }

    public void setiEdad(int iEdad)
    {
        this.iEdad = iEdad;
    }

    public char getcSexo()
    {
        return cSexo;
    }

    public void setcSexo(char cSexo)
    {
        this.cSexo = cSexo;
    }

    public String getsCalle()
    {
        return sCalle;
    }

    public void setsCalle(String sCalle)
    {
        this.sCalle = sCalle;
    }

    public int getiNumero()
    {
        return iNumero;
    }

    public void setiNumero(int iNumero)
    {
        this.iNumero = iNumero;
    }

    public String getsColonia()
    {
        return sColonia;
    }

    public void setsColonia(String sColonia)
    {
        this.sColonia = sColonia;
    }

    public String getsCiudad()
    {
        return sCiudad;
    }

    public void setsCiudad(String sCiudad)
    {
        this.sCiudad = sCiudad;
    }

    public String getsEstado()
    {
        return sEstado;
    }

    public void setsEstado(String sEstado)
    {
        this.sEstado = sEstado;
    }

    public int getiCp()
    {
        return iCp;
    }

    public void setiCp(int iCp)
    {
        this.iCp = iCp;
    }

    public int getiTelCelular()
    {
        return iTelCelular;
    }

    public void setiTelCelular(int iTelCelular)
    {
        this.iTelCelular = iTelCelular;
    }

    public int getiTelCasa()
    {
        return iTelCasa;
    }

    public void setiTelCasa(int iTelCasa)
    {
        this.iTelCasa = iTelCasa;
    }

    public int getiTelOficina()
    {
        return iTelOficina;
    }

    public void setiTelOficina(int iTelOficina)
    {
        this.iTelOficina = iTelOficina;
    }

    public String getsEmail()
    {
        return sEmail;
    }

    public void setsEmail(String sEmail)
    {
        this.sEmail = sEmail;
    }

    public String getsFechaNacimiento()
    {
        return sFechaNacimiento;
    }

    public void setsFechaNacimiento(String sFechaNacimiento)
    {
        this.sFechaNacimiento = sFechaNacimiento;
    }

    public String getsLugarNacimiento()
    {
        return sLugarNacimiento;
    }

    public void setsLugarNacimiento(String sLugarNacimiento)
    {
        this.sLugarNacimiento = sLugarNacimiento;
    }

    public String getsEstadoCivil()
    {
        return sEstadoCivil;
    }

    public void setsEstadoCivil(String sEstadoCivil)
    {
        this.sEstadoCivil = sEstadoCivil;
    }

    public int getiPasaporteSN()
    {
        return iPasaporteSN;
    }

    public void setiPasaporteSN(int iPasaporteSN)
    {
        this.iPasaporteSN = iPasaporteSN;
    }

    public String getsVigenciaPasaporte()
    {
        return sVigenciaPasaporte;
    }

    public void setsVigenciaPasaporte(String sVigenciaPasaporte)
    {
        this.sVigenciaPasaporte = sVigenciaPasaporte;
    }

    public int getiNoCartillaMilitar()
    {
        return iNoCartillaMilitar;
    }

    public void setiNoCartillaMilitar(int iNoCartillaMilitar)
    {
        this.iNoCartillaMilitar = iNoCartillaMilitar;
    }

    public int getiEstatura()
    {
        return iEstatura;
    }

    public void setiEstatura(int iEstatura)
    {
        this.iEstatura = iEstatura;
    }

    public String getsTalla()
    {
        return sTalla;
    }

    public void setsTalla(String sTalla)
    {
        this.sTalla = sTalla;
    }

    public String getsResponsable()
    {
        return sResponsable;
    }

    public void setsResponsable(String sResponsable)
    {
        this.sResponsable = sResponsable;
    }

    public String getsTipoSanguineo()
    {
        return sTipoSanguineo;
    }

    public void setsTipoSanguineo(String sTipoSanguineo)
    {
        this.sTipoSanguineo = sTipoSanguineo;
    }

    public String getsAlergias()
    {
        return sAlergias;
    }

    public void setsAlergias(String sAlergias)
    {
        this.sAlergias = sAlergias;
    }

    public String getsEnfermedades()
    {
        return sEnfermedades;
    }

    public void setsEnfermedades(String sEnfermedades)
    {
        this.sEnfermedades = sEnfermedades;
    }

    public String getsNombreMedicoCabecera()
    {
        return sNombreMedicoCabecera;
    }

    public void setsNombreMedicoCabecera(String sNombreMedicoCabecera)
    {
        this.sNombreMedicoCabecera = sNombreMedicoCabecera;
    }

    public int getiTelMedicoDeCabecera()
    {
        return iTelMedicoDeCabecera;
    }

    public void setiTelMedicoDeCabecera(int iTelMedicoDeCabecera)
    {
        this.iTelMedicoDeCabecera = iTelMedicoDeCabecera;
    }

    public String getsMedicacionDolorDeCabeza()
    {
        return sMedicacionDolorDeCabeza;
    }

    public void setsMedicacionDolorDeCabeza(String sMedicacionDolorDeCabeza)
    {
        this.sMedicacionDolorDeCabeza = sMedicacionDolorDeCabeza;
    }

    public String getsMedicacionDolorDeEstomago()
    {
        return sMedicacionDolorDeEstomago;
    }

    public void setsMedicacionDolorDeEstomago(String sMedicacionDolorDeEstomago)
    {
        this.sMedicacionDolorDeEstomago = sMedicacionDolorDeEstomago;
    }

    public String getsMedicacionDolorMuscular()
    {
        return sMedicacionDolorMuscular;
    }

    public void setsMedicacionDolorMuscular(String sMedicacionDolorMuscular)
    {
        this.sMedicacionDolorMuscular = sMedicacionDolorMuscular;
    }

    public String getsMedicacionGripa()
    {
        return sMedicacionGripa;
    }

    public void setsMedicacionGripa(String sMedicacionGripa)
    {
        this.sMedicacionGripa = sMedicacionGripa;
    }

    public String getsMedicacionOtro()
    {
        return sMedicacionOtro;
    }

    public void setsMedicacionOtro(String sMedicacionOtro)
    {
        this.sMedicacionOtro = sMedicacionOtro;
    }

    public String getsFormaDeEnterarse()
    {
        return sFormaDeEnterarse;
    }

    public void setsFormaDeEnterarse(String sFormaDeEnterarse)
    {
        this.sFormaDeEnterarse = sFormaDeEnterarse;
    }

    public char getcBaila()
    {
        return cBaila;
    }

    public void setcBaila(char cBaila)
    {
        this.cBaila = cBaila;
    }

    public String getsBaile()
    {
        return sBaile;
    }

    public void setsBaile(String sBaile)
    {
        this.sBaile = sBaile;
    }

    public String getsAnteriorBallet()
    {
        return sAnteriorBallet;
    }

    public void setsAnteriorBallet(String sAnteriorBallet)
    {
        this.sAnteriorBallet = sAnteriorBallet;
    }

    public String getsTiempoQueBailo()
    {
        return sTiempoQueBailo;
    }

    public void setsTiempoQueBailo(String sTiempoQueBailo)
    {
        this.sTiempoQueBailo = sTiempoQueBailo;
    }

    public String getsHorarioDisponible()
    {
        return sHorarioDisponible;
    }

    public void setsHorarioDisponible(String sHorarioDisponible)
    {
        this.sHorarioDisponible = sHorarioDisponible;
    }

    public String getsComentario()
    {
        return sComentario;
    }

    public void setsComentario(String sComentario)
    {
        this.sComentario = sComentario;
    }
    
}
