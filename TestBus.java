public class TestBus {
    public static void main(String[] args) {
        
        Bus miBus = new Bus(30); 

        miBus.mostrarDatos();
        miBus.mostrarAsientosDisponibles();
        System.out.println("-----------------------------------");

        
        miBus.subirPasajeros(18);
        miBus.mostrarAsientosDisponibles();
        System.out.println("-----------------------------------");

        
        miBus.cobrarPasajeros();
        System.out.println("-----------------------------------");

        
        miBus.subirPasajeros(20); 
    }
}
