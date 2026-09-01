import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double desconto = salarioBruto * 0.10;
        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}
