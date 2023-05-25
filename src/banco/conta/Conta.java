package banco.conta;

import banco.cliente.Cliente;

/**
 *
 * @author LENOVO
 */
public class Conta {
    protected String numero;
    protected Double saldo;
    protected Cliente cliente;
    protected String tipo;
    
    public static int ultimoNumero = 0;
    public static double saldoTotal = 0;
    public static int qtdeContasAbertas = 0;

    public Conta(Double saldo, Cliente cliente, String tipo) {    
        this.saldo = saldo;
        this.cliente = cliente;
        this.tipo = tipo; 
        
        Conta.qtdeContasAbertas +=1;
        Conta.saldoTotal += saldo;
        Conta.ultimoNumero += 1;
        this.numero = String.valueOf(ultimoNumero);
        
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public void depositar (double valor){
        this.saldo += valor;
    }
    
    public boolean sacar (double saque){
        if (this.saldo < saque){
            return false;
        } 
        this.saldo -= saque;
        return true;
    }
    
    public String informacoes(){
        String info = "INFORMAÇÕES DA CONTA \n";
        info += "Tipo: " + this.tipo + "\n";
        info += "Número: " + this.numero + "\n";
        info += "Número: " + this.cliente.getNome() + "\n";
        info += "Saldo: " + this.saldo + "\n";
        info += "\n----------------------------------------\n";
        info += "Saldo Total: " + saldoTotal + "\n";
        info += "Total de contas abertas: " + qtdeContasAbertas + "\n";
        info += "\n----------------------------------------\n";
        return info;
    }
    
}
