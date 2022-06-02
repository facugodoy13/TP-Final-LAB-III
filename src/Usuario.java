public class Usuario {
//*ID
    protected String nombreCompleto;
    protected TipoUsuario tipoUsuario;
    protected String DNI;
    protected String edad;
    protected String contraseña;
    protected String telefono;

    public Usuario(String nombreCompleto, TipoUsuario tipoUsuario, String DNI, String contraseña,
                   String telefono, String edad) {
        this.nombreCompleto = nombreCompleto;
        this.tipoUsuario = tipoUsuario;
        this.DNI = DNI;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.edad = edad;
    }
}
