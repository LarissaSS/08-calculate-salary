import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor da hora: ");
    double valorHora = sc.nextDouble();

    System.out.print("Digite o numero de horas trabalhadas no mes: ");
    double horaMes = sc.nextDouble();
    
    double salario = (valorHora * horaMes); 
    System.out.println("Total do sálario: " + salario);
  }
}