package listaDeContactos;
public class Contacto {
    //atributos
    private String nombres;
    private String apellidos;
    private String direccion;
    private String correo;
    private String telefono;
    private String celular;

    //constructores
    public Contacto(String nombres, String apellidos, String direccion, String correo, String telefono, String celular) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.celular = celular;
    }

    //getters
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    //setters
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return nombres + " , " + apellidos + " , " + direccion
                + " , " + correo + " , " + telefono + " , " + celular;
    }

}
