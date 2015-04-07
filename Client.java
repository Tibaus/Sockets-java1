
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;


/**
 *
 * @author Tibau
 */


public class Client {
    
    public static void main(String [] args) throws IOException{
    
        Socket cliente = new Socket("127.0.0.1", 26091);
        System.out.println("PIMBA! Conectado ao servidor");
        Scanner ler = new Scanner(System.in);
            PrintStream saida = new PrintStream(cliente.getOutputStream());
            while(ler.hasNextLine()){
            saida.println(ler.nextLine());
            }
            
            saida.close();
            ler.close();
            cliente.close();
        }
    
}
