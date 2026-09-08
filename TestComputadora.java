public class TestComputadora {
    public static void main(String[] args) {
        
        Computadora compu1 = new Computadora("HP", "Intel Core i5", 8, 512);
        Computadora compu2 = new Computadora("Asus", "AMD Ryzen 7", 16, 1024);

        compu1.mostrarDatos();
        compu2.mostrarDatos();
        System.out.println("-----------------------------------");

        
        int ramBuscada = 8;
        if (compu1.verificarRam(ramBuscada)) {
            System.out.println("La compu 1 SÍ tiene " + ramBuscada + "GB de RAM.");
        } else {
            System.out.println("La compu 1 NO tiene " + ramBuscada + "GB de RAM.");
        }

        System.out.println("-----------------------------------");

        
        System.out.println("Computadora con mayor almacenamiento:");
        if (compu1.getAlmacenamiento() > compu2.getAlmacenamiento()) {
            compu1.mostrarDatos();
        } else {
            compu2.mostrarDatos();
        }
    }
}
