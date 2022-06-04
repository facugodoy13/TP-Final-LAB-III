package facundo.gt;

import javax.swing.*;
import java.awt.desktop.ScreenSleepEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sistema {
    HashMap<Integer, Paciente> pacientes = new HashMap<>();
    HashMap<String, Profesional> profesionales = new HashMap<>();
    HashMap<String, Administrador> administradores = new HashMap<>();
    ArrayList<String> enfermedades = new ArrayList<>();
    ArrayList<Usuario> usuariosDelSistema = new ArrayList<>();


    public void menu() {
        Scanner sc = new Scanner(System.in);
        Usuario o = null;
        char rta = 'n';
        Paciente pa = new Paciente("facu",TipoUsuario.PACIENTE,41307695,1234,"2236839973","25");
        Administrador ad = new Administrador("carlos",TipoUsuario.ADMINISTRADOR,41307696,1234,"2236839973","25");
        Profesional pr = new Profesional("pepe",TipoUsuario.PROFESIONAL,41307697,1234,"2236839973","25");
        usuariosDelSistema.add(pa);
        usuariosDelSistema.add(ad);
        usuariosDelSistema.add(pr);

       do {
                System.out.println("usuario: ");
                int usuario = sc.nextInt();
                System.out.println("contraseña: ");
                int contraseña = sc.nextInt();

                for (Usuario u : usuariosDelSistema) {
                    if (u.getDNI() == usuario && u.getContraseña() == contraseña) {
                        if(u instanceof Paciente) {
                            o = (Paciente) u;
                        }
                        else if(u instanceof Administrador){
                            o = (Administrador) u;
                        }
                        else{
                            o = (Profesional) u;
                        }
                    }
                }

           try {
                switch (o.tipoUsuario) {
                    case ADMINISTRADOR: {
                        System.out.println("administrador");
                        /**IngresoPaciente
                         *IngresoProfesional
                         *registroadmin
                         *AdministracionEnfermedades?
                         *AdministracionPlanesDeControl
                         *DarDeBaja
                         *CambiarEstadoPaciente**/

                    }
                    break;

                    case PACIENTE: {
                        System.out.println("paciente");
                        /***VerAccionesDeHoy
                         *CompletarAccionesDeHoy
                         *ModificarAccionesDeHoy**/

                    }
                    break;

                    case PROFESIONAL: {
                        System.out.println("profesional");
                        /***VerNuevosPacientes
                         *CrearPlanDeControl
                         *Asignar plan
                         *ModificarPlanExistente
                         *ControlPacientes
                         *FinalizaroExtender
                         *VerDatosPaciente(atributos, historial, etc)
                         *LlamadoAyudaSistema**/

                    }
                    break;
                }
           }catch(NullPointerException npe){
                System.out.println("contraseña o usuario incorrectos desea volver a intentarlo?");
                rta = sc.next().charAt(0);
            }

            }while (rta == 's');


    }
}

