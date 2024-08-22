import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia, nome_cliente;
        double saldo;

        //Todo: Conhecer e iMPORTAT A CLASSE SCANNER 

        //Exibir as mensagens para o nossso usuário
        System.out.println(" Digite o número da conta : ");
        numero = scan.nextInt();

        System.out.println(" Digite o número da agencia : ");
        agencia = scan.next();

        System.out.println(" Digite o nome do titular da conta : ");
        nome_cliente = scan.next();

        System.out.println(" Digite o saldo da conta : ");
        saldo = scan.nextDouble();

        System.out.println(" Olá "+nome_cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque ");
        //Obter pela scanner os valores digitados no terminal 

        //Exibir a mensagem conta criada 
    }
}
