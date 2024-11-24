package Domain.Model.Ejercicio2;

public class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
    }
    
}
