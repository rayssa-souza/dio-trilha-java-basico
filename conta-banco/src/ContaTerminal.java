import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
    
       double saldo = 100 * Math.random();
       //Decidi implementar a classe Math para variar o saldo.

       System.out.println("Olá! Qual é o seu nome?");
       String nomeCliente = sc.next();
       
       System.out.println("Olá! Seja bem-vindo"+" "+ nomeCliente + "!" + " " + "Para prosseguirmos solicito que digite os dados a seguir:");

       System.out.println("Por favor, digite seu número:");
       int numero = sc.nextInt();

       System.out.println("Por favor, digite o número da sua agência:");
       String agencia = sc.next();
       
       sc.close();
    
       String retornoDoSistema = String.format("Olá, %s! Obrigado, por criar uma conta em nosso banco, o número da sua conta é %d, agência %s e seu saldo %.2f já está disponível para saque.", nomeCliente, numero, agencia, saldo);
       //Pesquisando encontrei o método format alternativo ao concat. Implementei po razões de aprendizado.

       System.out.println( retornoDoSistema);
       

   }
}
