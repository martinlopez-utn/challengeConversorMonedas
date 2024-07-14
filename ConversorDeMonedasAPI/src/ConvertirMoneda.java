import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;
        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);

        System.out.println("Tasa de conversión de hoy \n1 "+monedaBase+ " = " +monedas.conversion_rate() + " " + monedaTarget);

        System.out.println("Ingrese la cantidad a convertir de " +monedaBase);

        cantidad = parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();

        System.out.println(cantidad + " " + monedaBase + " = " + String.format("%.2f",cantidadConvertida)  + " " + monedas.target_code());
    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura) {

        System.out.println("Ingrese el código de la moneda a convertir: \n(El cual puede obtener de https://es.iban.com/currency-codes)");
        String monedaBase = lectura.nextLine().toUpperCase();

        System.out.println("Ingrese la moneda destino:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();

        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }


}
