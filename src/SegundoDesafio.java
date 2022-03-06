import java.util.Arrays;
import java.util.List;

public class SegundoDesafio {
    public static void main(String args[]) {

        List<Integer> listaNumero = Arrays.asList(1, 5, 3, 4, 2);

        Long numerosImpar = listaNumero.stream().filter(obj -> obj % 2 != 0).count();

        System.out.println(numerosImpar);
    }
}
