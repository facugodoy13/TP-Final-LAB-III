package facundo.gt;

import java.util.UUID;

public class Paciente extends Usuario {
    /*fechas
*Profesional
*Atendido
*PlanDeControl
*HistorialMedico
-VerAccionesDeHoy
-CompletarAccionesDeHoy(y modificar)*/
    private Profesional profesionalPropio;
    private boolean atendido = false;
    private String enfermedad;
    //private PlanDeControl planDeControl;
    /// HistorialMedico


    /*public Paciente() {
        super(nombreCompleto, tipoUsuario, DNI, contraseña, telefono, edad);
        this.profesionalPropio = profesionalPropio;
        this.enfermedad = enfermedad;
    }*/

    public UUID getMatriculaMedico(){
        return profesionalPropio.getMatricula();
    }

    public boolean isAtendido() {
        return atendido;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public Paciente(String nombreCompleto, TipoUsuario tipoUsuario, int DNI, int contraseña, String telefono, String edad) {
        super(nombreCompleto, tipoUsuario, DNI, contraseña, telefono, edad);
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String getNombreCompleto() {
        return super.getNombreCompleto();
    }

    @Override
    public void setNombreCompleto(String nombreCompleto) {
        super.setNombreCompleto(nombreCompleto);
    }

    @Override
    public TipoUsuario getTipoUsuario() {
        return super.getTipoUsuario();
    }

    @Override
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        super.setTipoUsuario(tipoUsuario);
    }

    @Override
    public int getDNI() {
        return super.getDNI();
    }

    @Override
    public void setDNI(int DNI) {
        super.setDNI(DNI);
    }

    @Override
    public String getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(String edad) {
        super.setEdad(edad);
    }

    @Override
    public int getContraseña() {
        return super.getContraseña();
    }

    @Override
    public void setContraseña(int contraseña) {
        super.setContraseña(contraseña);
    }

    @Override
    public String getTelefono() {
        return super.getTelefono();
    }

    @Override
    public void setTelefono(String telefono) {
        super.setTelefono(telefono);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "enfermedad='" + enfermedad + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", DNI='" + DNI + '\'' +
                ", edad='" + edad + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}