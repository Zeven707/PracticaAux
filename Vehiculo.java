public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;
    private String color;
    
    public Vehiculo(String marca, String modelo, int anio, int kilometraje, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.color = color;
    }

    
    public void mostrarKilometraje() {
        int metros = kilometraje * 1000;
        System.out.println("Kilometraje: " + kilometraje + " km (" + metros + " metros)");
    }

    
    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println("El nuevo color del auto es: " + this.color);
    }

    public void mostrarDatos() {
        System.out.println("Auto: " + marca + " " + modelo + " (" + anio + ") - Color: " + color);
    }
}
