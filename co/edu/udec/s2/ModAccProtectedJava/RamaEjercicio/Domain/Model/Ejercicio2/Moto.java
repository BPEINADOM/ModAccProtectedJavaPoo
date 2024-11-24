package Domain.Model.Ejercicio2;

public class Moto extends Vehiculo {
    protected String cilindrada;

    public Moto(String tipo, String marca, String cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada);
    }
    
}
