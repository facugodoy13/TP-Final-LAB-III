package facundo.gt;

import java.util.*;

public class Profesional extends Usuario {
    /* *fechas
   -VerNuevosPacientes
   -CrearPlanDeControl
   -Asignar plan
   -ModificarPlanExistente
   -ControlPacientes
   -FinalizaroExtender
   -VerDatosPaciente(atributos, historial, etc)*/
    private UUID matricula;
    Scanner scan = new Scanner(System.in);
    ArrayList<Paciente> pacientesAAtender = new ArrayList<>();

    public Profesional(String nombreCompleto, TipoUsuario tipoUsuario, int DNI,
                       int contraseña, String telefono, String edad) {
        super(nombreCompleto, tipoUsuario, DNI, contraseña, telefono, edad);
        matricula = UUID.randomUUID();
    }

    public void verNuevosPacientes(HashMap<String, Paciente> pacientes) {
        int nuevos = 0;
        for (Paciente pacientex : pacientes.values()) {
            if (!pacientex.isAtendido() && matricula.equals(pacientex.getMatriculaMedico())) {
                pacientesAAtender.add(pacientex);
                nuevos++;
            }
        }
        System.out.println("tienes " + nuevos + " nuevos pacientes.\ndeseas asignarles planes ahora? s/n");
        try {
            char opcion = scan.next().charAt(0);
            if (opcion == 'S' || opcion == 's')
                asignarPlan();
        } catch (InputMismatchException e) {
            System.out.println("debiste ingresar un caracter");
        }
    }

    public void asignarPlan() {
        if(!pacientesAAtender.isEmpty()){
            for (Paciente x: pacientesAAtender){

            }
        }else
            System.out.println("No tienes pacientes nuevos!");

    }

    public UUID getMatricula() {
        return matricula;
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
        return "Profesional{" +
                "matricula=" + matricula +
                ", scan=" + scan +
                ", pacientesAAtender=" + pacientesAAtender +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", DNI='" + DNI + '\'' +
                ", edad='" + edad + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}