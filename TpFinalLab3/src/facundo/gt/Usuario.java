package facundo.gt;


import java.util.Objects;

public class Usuario {
    //*ID
    protected String nombreCompleto;
    protected TipoUsuario tipoUsuario;
    protected int DNI;
    protected String edad;
    protected int contraseña;
    protected String telefono;

    public Usuario(String nombreCompleto, TipoUsuario tipoUsuario, int DNI, int contraseña,
                   String telefono, String edad) {
        this.nombreCompleto = nombreCompleto;
        this.tipoUsuario = tipoUsuario;
        this.DNI = DNI;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public int getContraseña() {
        return contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return DNI == usuario.DNI && contraseña == usuario.contraseña;
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI, contraseña);
    }
}