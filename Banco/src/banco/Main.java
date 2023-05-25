package banco;

import banco.cliente.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Main {

    public static void main(String[] args) {
      List <Conta> contas = new ArrayList();
      Cliente c;
      ContaCorrente cc;
      ContaPoupanca cp;
      
      
      
              
      c = new Cliente("Charles Ferreira", 'M', 32); 
      cc = new ContaCorrente(10000.00, c);
      contas.add(cc);
       
      c = new Cliente("Amanda Ferreira", 'F', 29);
      cp = new ContaPoupanca(10000.00, c);
      contas.add(cp);
       
      c = new Cliente("Ezequiel da Costa", 'M', 38); 
      cc = new ContaCorrente(10000.00, c);
      contas.add(cc);
       
      c = new Cliente("Leydi da Costa", 'F', 35);
      cp = new ContaPoupanca(10000.00, c);
      contas.add(cp);
       
      for(Conta conta : contas){
          System.out.println(conta.informacoes());
      }
       
       
       /*
       Cliente cliente2 = new Cliente("Amanda Ferreira", 'F', 29);
       ContaPoupanca contaPoupanca = new ContaPoupanca("002", 10000.00, cliente2);
       
        System.out.println(contaCorrente.getSaldo());
        contaCorrente.depositar(3000.00);
        System.out.println(contaCorrente.getSaldo());
        contaCorrente.sacar(13000.00);
        System.out.println(contaCorrente.getSaldo());
        
        System.out.println("\n---------------------------------------------------\n");
        
        System.out.println(contaPoupanca.getSaldo());
        contaPoupanca.depositar(3000.00);
        System.out.println(contaPoupanca.getSaldo());
        contaPoupanca.sacar(1000.0);
        System.out.println(contaPoupanca.getSaldo());
        contaPoupanca.Juros(2.3);
        System.out.println(contaPoupanca.getSaldo());
        */        
        
    }
    
}