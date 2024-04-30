public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    private static int total ;

    public  Conta (int agencia, int numero) {
        if (agencia <= 0 || numero <= 0) {
           System.out.println("Os valores precisam ser maiores que Zero (0)");
        } else {
            total ++;
            System.out.println("Criando uma conta, total de contas:" +  total);
            this.agencia = agencia;
            this.numero = numero;
        }

    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere (double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
    public double getSaldo () {
        return this.saldo;
    }

    public int getNumero () {
        return this.numero;
    }
    public void setNumero (int novoNumero) {
        if (novoNumero <= 0) {
            System.out.println("O numero precisa ser maior que 0");
            return;
        } else { this.numero = novoNumero;
           }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("O numero ag precisa ser maior que 0");
            return;
        } else { this.agencia = agencia;}
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }
}
