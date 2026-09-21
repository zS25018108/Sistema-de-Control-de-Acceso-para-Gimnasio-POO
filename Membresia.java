public abstract class Membresia {
    // Atributos protegidos 
    protected String idMiembro;
    protected String nombreUsuario;

    // Constructor que inicializa los atributos compartidos
    public Membresia(String idMiembro, String nombreUsuario) {
        this.idMiembro = idMiembro;
        this.nombreUsuario = nombreUsuario;
    }

    // Método abstracto que cada tipo de membresía debe implementar obligatoriamente
    public abstract boolean verificarAcceso();

    // Método concreto común a todas las membresías
    public void mostrarDatos() {
        System.out.println("ID: " + idMiembro + " | Usuario: " + nombreUsuario);
    }

    // Getters y Setters (Encapsulamiento)
    public String getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(String idMiembro) {
        this.idMiembro = idMiembro;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}