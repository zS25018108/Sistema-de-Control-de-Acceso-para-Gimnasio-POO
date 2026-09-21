import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CONTROL DE ACCESO AL GIMNASIO ===\n");

        // Polimorfismo: Guardamos objetos de distintas clases hijas en una lista de tipo Padre (Membresia)
        ArrayList<Membresia> torniquete = new ArrayList<>();

        torniquete.add(new MembresiaBasica("M001", "Samantha Roman", 2));
        torniquete.add(new MembresiaPremium("M002", "Kevin Sanchez", 1));
        torniquete.add(new MembresiaBasica("M003", "Gema Perez", 1));

        // Muestra de datos generales
        System.out.println("--- REGISTRO DE MIEMBROS ---");
        for (Membresia m : torniquete) {
            m.mostrarDatos();
        }
        System.out.println();

        // SIMULACIÓN DE ACCESOS CONSECUTIVOS (Demostración de Polimorfismo)
        System.out.println("--- SIMULACIÓN DE ENTRADA EN TORNIQUETE ---");

        // Simulamos 3 intentos de acceso para evaluar cómo responde cada tipo de membresía
        for (int i = 1; i <= 3; i++) {
            System.out.println("\n>>> Ronda de Intentos #" + i + ":");
            for (Membresia m : torniquete) {
                // Polimorfismo en acción: ejecuta la lógica propia de cada clase según el tipo real del objeto
                m.verificarAcceso();
            }
        }

        // Prueba del método exclusivo de la membresía Premium
        System.out.println("\n--- PRUEBA DE INGRESO CON INVITADO (MEMBRESÍA PREMIUM) ---");
        MembresiaPremium clienteVip = new MembresiaPremium("M004", "Daniela Floresa", 1);
        
        clienteVip.verificarAcceso();          // Entra el titular
        clienteVip.ingresarConInvitado();     // Consume el pase de invitado (1 -> 0)
        clienteVip.ingresarConInvitado();     // Intento adicional sin pases disponibles
    }
}