public class Bus {
    private int capacidadTotal;
    private int pasajerosActuales;
    private double pasajeCosto;

    
    public Bus(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.pasajerosActuales = 0;
        this.pasajeCosto = 1.50; 
    }

    
    public void subirPasajeros(int x) {
        if ((pasajerosActuales + x) <= capacidadTotal) {
            pasajerosActuales += x;
            System.out.println("Subieron " + x + " pasajeros con éxito.");
        } else {
            int cuposLibres = capacidadTotal - pasajerosActuales;
            System.out.println("Error: No hay suficientes asientos. Solo entraban " + cuposLibres + " pasajeros.");
        }
    }

    
    public void cobrarPasajeros() {
        double totalRecaudado = pasajerosActuales * pasajeCosto;
        System.out.println("Cobrando a " + pasajerosActuales + " pasajeros. Total recaudado: Bs. " + totalRecaudado);
    }

    
    public void mostrarAsientosDisponibles() {
        int disponibles = capacidadTotal - pasajerosActuales;
        System.out.println("Asientos disponibles: " + disponibles + " de " + capacidadTotal);
    }

    public void mostrarDatos() {
        System.out.println("Capacidad Total: " + capacidadTotal + " | Pasajeros a bordo: " + pasajerosActuales);
    }
}
