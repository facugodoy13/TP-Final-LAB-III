package facundo.gt;

import java.util.HashMap;
import java.util.Scanner;

public class Administrador extends Usuario {
    //Paciente pacient
    //Profesional profesional
    Scanner scan = new Scanner(System.in);

    public Administrador(String nombreCompleto, TipoUsuario tipoUsuario, int DNI, int contraseña
            , String telefono, String edad) {
        super(nombreCompleto, tipoUsuario, DNI, contraseña, telefono, edad);
    }

    /*public void ingresoPaciente(HashMap<String, Paciente> pacientes, HashMap<String, Profesional> profesionales) {///lista
        String dni;
        Paciente pacientex = new Paciente(scan.nextLine(), TipoUsuario.PACIENTE, dni = scan.nextLine(), dni, ///?
                scan.nextLine(), scan.nextLine(), asignarProfesional(profesionales), scan.nextLine());

        pacientes.put(dni, pacientex);


    }*/

    public void ingresoProfesional(HashMap profesionales) {///lista
        int dni;
        Profesional profesionalx = new Profesional(scan.nextLine(), TipoUsuario.PROFESIONAL, dni = scan.nextInt(),
                dni, scan.nextLine(), scan.nextLine());

        profesionales.put(dni, profesionalx);
    }

    public void registroAdministrador(HashMap administradores) {///lista
        int dni;
        Administrador administradorx = new Administrador(scan.nextLine(), TipoUsuario.ADMINISTRADOR,
                dni = scan.nextInt(), dni, scan.nextLine(), scan.nextLine());

        administradores.put(dni, administradorx);
    }

    public Profesional asignarProfesional(HashMap<String, Profesional> profesionales){
        for (Profesional profesionalx : profesionales.values()){
            return profesionalx;
        }
        return profesionales.get("ksamd");
    }

    public void darDeBaja() {

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
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", DNI='" + DNI + '\'' +
                ", edad='" + edad + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
    /*    *fechas
-IngresoPaciente
-IngresoProfesional
-AdministracionEnfermedades
-AdministracionPlanesDeControl
-DarDeBaja
-CambiarEstadoPaciente
*/

}
