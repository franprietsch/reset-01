public class App {

    public static void main(String[] args) {

        Calculadora calculadoraDaFran = new Calculadora();

        int resultadoSoma1 = calculadoraDaFran.somar(30,5);
        int resultadoSoma2 = calculadoraDaFran.somar(30,15);

        System.out.println(resultadoSoma1);
        System.out.println(resultadoSoma2);

        int resultadoSubtracao1 = calculadoraDaFran.subtrair(30,5);
        System.out.println(resultadoSubtracao1);

        int resultadoMultiplicacao1 = calculadoraDaFran.multiplicar(30,5);
        System.out.println(resultadoMultiplicacao1);

        int resultadoDivisao1 = calculadoraDaFran.dividir(30,5);
        System.out.println(resultadoDivisao1);

        Comparador comparadorDaFran = new Comparador();

        boolean menorQue = comparadorDaFran.comparar(30,5);
        System.out.println(menorQue);

        boolean menorQue2 = comparadorDaFran.comparar(5,30);
        System.out.println(menorQue2);


    }

}
