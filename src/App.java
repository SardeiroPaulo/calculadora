import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Valor a Receber para Professores");
        System.out.print("Nome do professor: ");
        String nome = scanner.nextLine();

        System.out.print("Regime de pagamento (CLT, Horista ou PJ): ");
        String regime = scanner.nextLine();

        double valorReceber = 0.0;

        if (regime.equalsIgnoreCase("CLT")) {
            System.out.print("Salário mensal do professor: ");
            double salarioMensal = scanner.nextDouble();
            valorReceber = salarioMensal;
        } else if (regime.equalsIgnoreCase("Horista")) {
            System.out.print("Número de horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();

            System.out.print("Valor da hora de trabalho: ");
            double valorHora = scanner.nextDouble();

            valorReceber = horasTrabalhadas * valorHora;
        } else if (regime.equalsIgnoreCase("PJ")) {
            System.out.print("Valor do contrato do professor: ");
            double valorContrato = scanner.nextDouble();
            valorReceber = valorContrato;
        } else {
            System.out.println("Regime de pagamento inválido!");
            System.exit(0);
        }

        System.out.println("Nome do professor: " + nome);
        System.out.println("Valor a receber: R$" + valorReceber);
    }
}
    
