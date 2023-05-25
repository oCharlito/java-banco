package banco.conta;

import banco.cliente.Cliente;

/**
 *
 * @author LENOVO
 */
public class ContaCorrente extends Conta {
    
    public ContaCorrente(Double saldo, Cliente cliente) {
        super(saldo, cliente, "Corrente");
    }

}