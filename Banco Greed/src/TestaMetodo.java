public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDopaulo = new Conta();
        contaDopaulo.saldo= 100;
        contaDopaulo.deposita(50);
        System.out.println(contaDopaulo.saldo);

      boolean conseguiuRetirar =  contaDopaulo.saca(2.3);
        System.out.println(contaDopaulo.saldo);
        System.out.println(conseguiuRetirar);


        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(2000);

        boolean sucessotransferencia = contaDaMarcela.transfere(34.45, contaDopaulo);
        if (sucessotransferencia){
            System.out.println("transferência deu certo kkkkkkk");
        }
        System.out.println(contaDaMarcela.saldo);

        System.out.println(contaDopaulo.saldo);

    }
}
