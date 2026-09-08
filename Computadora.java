public class Computadora {
    private String marca;
    private String procesador;
    private int ram; 
    private int almacenamiento; 

    
    public Computadora(String marca, String procesador, int ram, int almacenamiento) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    
    public boolean verificarRam(int x) {
        return this.ram == x;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca + " | Procesador: " + procesador + " | RAM: " + ram + "GB | Almacenamiento: " + almacenamiento + "GB");
    }
}
