import CalculadoraPOO.Calculadora;
import CalculadoraPOO.Historico;

import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Historico historico = new Historico();
    String opcao;

    System.out.println("=== CALCULADORA JAVA ===");

    while (true) {
        System.out.println("\nEscolha uma operação:");
        System.out.println("[1] Soma (+)");
        System.out.println("[2] Subtração (-)");
        System.out.println("[3] Multiplicação (*)");
        System.out.println("[4] Divisão (/)");
        System.out.println("[5] Potência (^)");
        System.out.println("[6] Raiz quadrada (√)");
        System.out.println("[7] Porcentagem (%)");
        System.out.println("[8] Ver histórico");
        System.out.println("[0] Sair");
        System.out.print("Opção: ");
        opcao = scanner.nextLine();

        if (opcao.equals("0")) {
            System.out.println("Encerrando a calculadora. Até mais!");
            break;
        }

        if (opcao.equals("8")) {
            historico.exibir();
            continue;
        }

        double num1 = 0, num2 = 0;
        boolean precisaDoisNumeros = !opcao.equals("6");

        try {
            System.out.print("Digite o primeiro número: ");
            num1 = Double.parseDouble(scanner.nextLine());

            if (precisaDoisNumeros && !opcao.equals("7")) {
                System.out.print("Digite o segundo número: ");
                num2 = Double.parseDouble(scanner.nextLine());
            }

            double resultado = 0;
            String operacaoTexto = "";

            switch (opcao) {
                case "1":
                    resultado = Calculadora.somar(num1, num2);
                    operacaoTexto = num1 + " + " + num2 + " = " + resultado;
                    break;
                case "2":
                    resultado = Calculadora.subtrair(num1, num2);
                    operacaoTexto = num1 + " - " + num2 + " = " + resultado;
                    break;
                case "3":
                    resultado = Calculadora.multiplicar(num1, num2);
                    operacaoTexto = num1 + " * " + num2 + " = " + resultado;
                    break;
                case "4":
                    resultado = Calculadora.dividir(num1, num2);
                    operacaoTexto = num1 + " / " + num2 + " = " + resultado;
                    break;
                case "5":
                    resultado = Calculadora.potencia(num1, num2);
                    operacaoTexto = num1 + " ^ " + num2 + " = " + resultado;
                    break;
                case "6":
                    resultado = Calculadora.raizQuadrada(num1);
                    operacaoTexto = "√" + num1 + " = " + resultado;
                    break;
                case "7":
                    System.out.print("Digite o valor total: ");
                    num2 = Double.parseDouble(scanner.nextLine());
                    resultado = Calculadora.porcentagem(num1, num2);
                    operacaoTexto = num1 + "% de " + num2 + " = " + resultado;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
            historico.adicionar(operacaoTexto);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada inválida. Digite números válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    scanner.close();
}


