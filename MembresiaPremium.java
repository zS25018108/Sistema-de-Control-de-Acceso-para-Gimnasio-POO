public class MembresiaPremium extends Membresia {
    // Atributo propio y privado
    private int pasesInvitado;

    // Constructor
    public MembresiaPremium(String idMiembro, String nombreUsuario, int pasesInvitado) {
        super(idMiembro, nombreUsuario);
        this.pasesInvitado = pasesInvitado;
    }

    // Implementación del método abstracto: el titular siempre tiene acceso ilimitado
    @Override
    public boolean verificarAcceso() {
        System.out.println("[Acceso Concedido - Premium] ¡Bienvenido al área VIP, " 
                           + nombreUsuario + "!");
        return true;
    }

    // Método propio para gestionar el ingreso de acompañantes
    public boolean ingresarConInvitado() {
        if (pasesInvitado > 0) {
            pasesInvitado--;
            System.out.println("️ [Invitado Concedido] " + nombreUsuario 
                               + " y su invitado pueden ingresar. Pases de invitado restantes: " 
                               + pasesInvitado);
            return true;
        } else {
            System.out.println("⚠ [Invitado Denegado] " + nombreUsuario 
                               + " puede ingresar solo, pero se agotaron los pases de invitado.");
            return false;
        }
    }

    // Getter y Setter
    public int getPasesInvitado() {
        return pasesInvitado;
    }

    public void setPasesInvitado(int pasesInvitado) {
        this.pasesInvitado = pasesInvitado;
    }
}