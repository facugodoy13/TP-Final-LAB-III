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

    public Profesional(String nombreCompleto, TipoUsuario tipoUsuario, String DNI,
                       String contraseña, String telefono, String edad) {
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


}
