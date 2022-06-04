package facundo.gt;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        /*HashMap<String, Paciente> pacientes = new HashMap<>();
        HashMap<String, Profesional> profesionales = new HashMap<>();
        HashMap<String, Administrador> administradores = new HashMap<>();
        ArrayList<String> enfermedades = new ArrayList<>();
        //ArrayList<PlanDeControl> planesControl = new ArrayList<>();*/
        Sistema s = new Sistema();
        s.menu();
    }
}
