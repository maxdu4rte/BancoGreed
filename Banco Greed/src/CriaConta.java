import java.util.SortedMap;

public class CriaConta {

    public static void main(String[] args) {
        Conta promeiraConta = new Conta();
        promeiraConta.saldo = 200;
        System.out.println(promeiraConta.saldo);

        promeiraConta.saldo += 100;
        System.out.println(promeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        System.out.println( "Primeira conta tem:"+ promeiraConta.saldo);
        System.out.println("Segunda conta tem:" + segundaConta.saldo);
    }
}
