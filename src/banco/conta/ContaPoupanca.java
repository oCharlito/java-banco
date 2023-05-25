package banco.conta;

import banco.cliente.Cliente;

/**
 *
 * @author LENOVO
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Double saldo, Cliente cliente) {
        super(saldo, cliente, "Poupança");
    }
    
    public void Juros(double taxaJuros) {
    double juros = saldo * (taxaJuros / 100);
    saldo += juros;
}
    
}