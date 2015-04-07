/**
 *
 * @author Tibau
 */

import java.io.IOException;
import static java.lang.System.in;
import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main (String [] args) throws IOException{
    
        ServerSocket servidor = new ServerSocket(26091); //Criando o server na porta 26091
        System.out.println("*** Servidor Socket básico feito por Thiago Tibau *** \n *** O xerosão das 9vinhas ***");
        System.out.println("A porta está aberta!");
        System.out.println("Aguardando nova conexão...");
        Socket cliente = servidor.accept(); //Aceitando conexões na porta
        System.out.println("Uma nova conexão foi feita com o cliente: "
                +cliente.getInetAddress().getHostAddress()); //Identificando a conexão do cliente
        
        Scanner scan = new Scanner(cliente.getInputStream());//Lendo o que o cliente manda
        
            while(scan.hasNextLine()){
            System.out.println("Client: "+scan.nextLine()); //Exibindo na tela o que foi mandado pelo cliente
            }
            
        in.close();
        cliente.close(); //Fechando conexão
        servidor.close();
    }
}
