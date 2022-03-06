import java.util.Arrays;
import java.util.List;


public class PrimeiroDesafio {
    public static void main(String args[]) {

        List<Integer> listaNumero = Arrays.asList(9, 2, 1, 4, 6);
        Integer media = listaNumero.stream().reduce((current, next) -> current + next).orElse(0) / listaNumero.size();
        System.out.println(media);
    }
}
