/*
 * Techno Engineers
 * Usuarios
 * 10/04/2016 -- Autorizo: Oscar de Paz Feliciano // Lider de proyecto
 * Modificaciones: Jonathan Rojas Simon // Desarrollo. [17/04/2016]
 * Sirve para encapsular los datos de la tabla "usuarios" en la base de datos
 * Numero de metodos en el codigo: 0
 * Interfaces: 
 */
package Modelo;

/**
 * Datos encapsulados del usuario.
 * @author Techno Engineers
 */

public class UsuariosDatosEncapsulados
{
    private char cTipoUsuario;
    private String sUsuario;
    private String sContrasena;
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
    private char cEstadoCivil;
    private String sPasaporteSN;
    private String sVigenciaPasaporte;
    private int iNoCartillaMilitar;
    private double dEstatura;
    private String sTalla;
    private String sResponsable;
    private String sTipoSanguineo;
    private String sAlergias;
    private String sEnfermedades;
    private String sNombreMedicoCabecera;
    private int iTelMedicoDeCabecera;
    private String sMedicacionDiarrea;
    private String sMedicacionDolorDeCabeza;
    private String sMedicacionDolorDeEstomago;
    private String sMedicacionDolorMuscular;
    private String sMedicacionGripa;
    private String sMedicacionOtro;
    private String sFormaDeEnterarse;
    private String sBaila;
    private String sBaile;
    private String sAnteriorBallet;
    private String sTiempoQueBailo;
    private String sHorarioDisponible;
    private String sRespuestaSecreta;
    private String sComentario;
    
    /**
     * Se crea un constructor con valores por defecto de usuario y contraseña.
     */
    public UsuariosDatosEncapsulados()
    {
        sUsuario="";
        sContrasena="";
    }
    
    /**
     * Recibe valor de usuario y contraseña.
     * @param sUsuario recibe usuario.
     * @param sContrasena recibe contraseña.
     */
    public UsuariosDatosEncapsulados(String sUsuario, String sContrasena){
        this.sUsuario=sUsuario;
        this.sContrasena=sContrasena;
    }
    /*
      Los siguientes con los constructores son del usuario.
    */
    public String getNombreUsuario() 
    {
        return sUsuario;
    }

    public void setUsuario(String sUsuario) 
    {
        this.sUsuario = sUsuario;
    }

    public String getContrasena() {
        return sContrasena;
    }

    public void setContrasena(String sContrasena) 
    {
        this.sContrasena = sContrasena;
    }

    public char getcTipoUsuario()
    {
        return cTipoUsuario;
    }

    public void setcTipoUsuario(char cTipoUsuario)
    {
        this.cTipoUsuario = cTipoUsuario;
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

    public char getcEstadoCivil()
    {
        return cEstadoCivil;
    }

    public void setcEstadoCivil(char cEstadoCivil)
    {
        this.cEstadoCivil = cEstadoCivil;
    }

    public String getsPasaporteSN()
    {
        return sPasaporteSN;
    }

    public void setsPasaporteSN(String sPasaporteSN)
    {
        this.sPasaporteSN = sPasaporteSN;
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

    public double getdEstatura()
    {
        return dEstatura;
    }

    public void setdEstatura(double dEstatura)
    {
        this.dEstatura = dEstatura;
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

    public String getsBaila()
    {
        return sBaila;
    }

    public void setsBaila(String sBaila)
    {
        this.sBaila = sBaila;
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

    public UsuariosDatosEncapsulados(String sUsuario)
    {
        this.sUsuario = sUsuario;
    }

    public String getsUsuario()
    {
        return sUsuario;
    }

    public void setsUsuario(String sUsuario)
    {
        this.sUsuario = sUsuario;
    }

    public String getsRespuestaSecreta()
    {
        return sRespuestaSecreta;
    }

    public void setsRespuestaSecreta(String sRespuestaSecreta)
    {
        this.sRespuestaSecreta = sRespuestaSecreta;
    }

    public String getsMedicacionDiarrea()
    {
        return sMedicacionDiarrea;
    }

    public void setsMedicacionDiarrea(String sMedicacionDiarrea)
    {
        this.sMedicacionDiarrea = sMedicacionDiarrea;
    }
    
    
}
