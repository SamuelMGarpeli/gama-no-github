
import java.util.Scanner;
public class Programa_conta {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Conta novaconta = new Conta();

        int opcao;
        do{
            System.out.println("O que deseja fazer?:  ");
            System.out.println("1 - abrir uma conta ");
            System.out.println("2 - consultar o saldo ");
            System.out.println("3 - fazer um saque ");
            System.out.println("4 - fazer um deposito ");
            System.out.println("5 - fazer uma transferancia ");
            System.out.println("6 - sair ");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                        System.out.println(" Voce escolheu abrir uma conta!!!");
                        novaconta.getcriarConta();
                    
                    break;
                
                case 2:
                        System.out.println(" Qual a sua conta?: "); 
                        novaconta.setconta(leitor.nextDouble());
                        novaconta.getconsultar();
                    break;
                    
                case 3:
                        System.out.println(" Qual a sua conta?: "); 
                        novaconta.setconta(leitor.nextDouble());
                        System.out.println(" Qual valor quer sacar?: ");
                        novaconta.setsacar(leitor.nextDouble());
                        novaconta.getconsultar();
                    break;
                
                case 4:
                        System.out.println(" Qual a sua conta?: "); 
                        novaconta.setconta(leitor.nextDouble());
                        System.out.println(" Qual valor quer depositar?: ");
                        novaconta.setdepositar(leitor.nextDouble());
                        novaconta.getconsultar();
                    break;

                case 5:
                        System.out.println(" Qual a sua conta?: "); 
                        novaconta.setconta(leitor.nextDouble());
                        System.out.println(" Qual valor quer depositar?: ");
                        novaconta.settransferir(leitor.nextDouble());
                        novaconta.getconsultar();
                    break;
                
                case 6:
                        novaconta.getagradecer();
                    break;
                
                default:
                    break;
            }

        }while (opcao != 6);

    }
}