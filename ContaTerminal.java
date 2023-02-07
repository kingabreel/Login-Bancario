import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception{
        //Código para simular um sistema de login em um banco
        //Variáveis e scanner
        int numeroAgencia, numeroUsuario, Saldo;
        String nomeUsuario;

        Scanner scanner = new Scanner(System.in);

        //Mensagens da tela de inicio

        System.out.println("Bem vindo ao Sistema Bancário!");

        System.out.println("Por favor, digite seu número da conta\nExemplo(1234)");
        numeroUsuario = scanner.nextInt();
    

        //Condiçao para prosseguir ao numero da agencia

        if (numeroUsuario == 1021){

            System.out.println("Por favor, digite o número da Agência\nExemplo(123)");
            numeroAgencia = scanner.nextInt();

            //Se o numero da agencia for correto, exibirá a mensagem de boas vindas ao usuario
            if (numeroAgencia == 678){
                nomeUsuario = "Mario Andrade";
                Saldo = 2300;
    
                System.out.println("Olá " + nomeUsuario + ", seja bem vindo novamente ao nosso banco, sua agência é " + numeroAgencia +
                ", conta " + numeroUsuario + ", seu saldo é R$" + Saldo + ",00 já está disponível para o saque.");
            } else{
                System.out.println("Agência invalida para esse usuário");
            }
        
        } else {
            System.out.println("Usuário invalido, tente novamente");
        }
    
    }
}