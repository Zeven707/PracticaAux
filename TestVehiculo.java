public class TestVehiculo {
    public static void main(String[] args) {
        
        Vehiculo auto1 = new Vehiculo("Toyota", "Corolla", 2020, 15000, "Rojo");
        Vehiculo auto2 = new Vehiculo("Suzuki", "Vitara", 2022, 8500, "Blanco");

        auto1.mostrarDatos();
        auto1.mostrarKilometraje();
        auto1.cambiarColor("Azul");

        System.out.println("-----------------------------------");

        auto2.mostrarDatos();
        auto2.mostrarKilometraje();
        auto2.cambiarColor("Negro");
    }
}
