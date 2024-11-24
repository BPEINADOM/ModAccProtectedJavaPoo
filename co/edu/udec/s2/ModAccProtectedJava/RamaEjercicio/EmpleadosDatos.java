import Domain.Model.Ejercicio1.Empleado;
import Domain.Model.Ejercicio1.Gerente;

public class EmpleadosDatos {

    public static void main(String[] args) {

        System.out.println("*****************7502410037******************");
        System.out.println("********BILLY JEAN YER PEINADO MADERA********");
        System.out.println("*********************************************");
        
        Empleado empleado = new Empleado("Carlos Piñeda", 2500000.0);
        Gerente gerente = new Gerente("Jose Herrera", 5400000.0, "Mercancia");

        System.out.println("- Empleado:");
        empleado.mostrarInformacion();

        System.out.println("*********************************************");

        System.out.println("- Gerente:");
        gerente.mostrarInformacion();

        System.out.println("*********************************************");
    }
}
