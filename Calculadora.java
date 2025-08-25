public class Calculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return a / b;
    }

    public static double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new ArithmeticException("Raiz de número negativo!");
        }
        return Math.sqrt(numero);
    }

    public static double porcentagem(double porcento, double total) {
        return (porcento / 100) * total;
    }
}

