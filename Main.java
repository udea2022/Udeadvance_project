public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Ricardo","ricardo@udea.com","UdeA","administrativo");
        System.out.println(empleado.getCorreo());

        Empresa empresa = new Empresa("UDEA","calle 2","3245678907","90876261");
        System.out.println(empresa.getNIT());

        MovimientoDinero movimientoDinero = new MovimientoDinero(1000,"calle 2","Ricardo");
        System.out.println(empresa.getNIT());

    }
}