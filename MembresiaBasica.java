public class MembresiaBasica extends Membresia {
    // Atributo propio y privado
    private int visitasRestantes;

    // Constructor que utiliza super() para invocar al constructor padre
    public MembresiaBasica(String idMiembro, String nombreUsuario, int visitasRestantes) {
        super(idMiembro, nombreUsuario);
        this.visitasRestantes = visitasRestantes;
    }

    // Implementación del método abstracto (Polimorfismo / Sobrescritura)
    @Override
    public boolean verificarAcceso() {
        if (visitasRestantes > 0) {
            visitasRestantes--;
            System.out.println("[Acceso Concedido - Básica] Bienvenido " + nombreUsuario 
                               + ". Visitas restantes: " + visitasRestantes);
            return true;
        } else {
            System.out.println("[Acceso Denegado - Básica] " + nombreUsuario 
                               + ", no te quedan visitas restantes este mes.");
            return false;
        }
    }

    // Getter y Setter
    public int getVisitasRestantes() {
        return visitasRestantes;
    }

    public void setVisitasRestantes(int visitasRestantes) {
        this.visitasRestantes = visitasRestantes;
    }
}