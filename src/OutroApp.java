public class OutroApp {

    public static void main(String[] args) {

        Calculadora calculadoraDoRob = new Calculadora();

        int resultadoSoma3 = calculadoraDoRob.somar(30,5);
        int resultadoSoma4 = calculadoraDoRob.somar(30,15);

        System.out.println(resultadoSoma3);
        System.out.println(resultadoSoma4);

    }



}
