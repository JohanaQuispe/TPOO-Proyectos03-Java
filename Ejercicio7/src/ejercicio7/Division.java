package ejercico7;
public class Division {

    public String dividir(int numerador, int divisor) {

        try {

            int resultado = numerador / divisor;
            return "Resultado: " + resultado;

        } catch (ArithmeticException ex) {

            return "Error: No se puede dividir entre cero";
        }
    }
}