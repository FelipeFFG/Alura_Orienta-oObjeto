public class CriaConta {

    public static void main(String[] args) {
        //primeira conta
       Conta primeiraConta = new Conta();  //instanciação de uma conta
       primeiraConta.saldo =200;   // atribuição de saldo a instacia primeiraConta
       System.out.println(primeiraConta.saldo);
        // somando 100 ao valor ja existente
       primeiraConta.saldo +=100;
       System.out.println(primeiraConta.saldo);

       System.out.println(primeiraConta.titular); // como nao foi aderido um valor para titular, ele adere o valor default sendo null  a nao ser que tenha sido aderido o valor dentro da classe
        System.out.println(primeiraConta.numero);  //como nao foi aderido um alor ao numero, ele adere o valor default sendo 0 a nao ser que tenha sido aderido o valor dentro da classe.

       //segunda conta;
       Conta segundaConta = new Conta();
       segundaConta.saldo = 50;
        System.out.println("primeira conta tem " + primeiraConta.saldo + " reais");
       System.out.println("segunda conta tem " + segundaConta.saldo + " reais");

    }
}
