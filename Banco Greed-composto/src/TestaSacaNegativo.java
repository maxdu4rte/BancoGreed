public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saca(111);

       conta.deposita(1000);
        System.out.println(conta.getSaldo());
    }
}
