/**
 * La clase Calculadora realiza operaciones básicas de suma y resta.
 * Puede ser utilizada para realizar cálculos simples.
 */
public class Calculadora {

    /**
     * Este método realiza la suma de dos números enteros.
     *
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return Resultado de la suma.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Este método realiza la resta de dos números enteros.
     *
     * @param a Número del cual se resta.
     * @param b Número que se resta.
     * @return Resultado de la resta.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Método principal utilizado para probar la clase Calculadora.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        // Crear una instancia de la Calculadora
        Calculadora miCalculadora = new Calculadora();

        // Realizar algunas operaciones y mostrar los resultados
        int resultadoSuma = miCalculadora.sumar(5, 3);
        int resultadoResta = miCalculadora.restar(8, 4);

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
    }
}
