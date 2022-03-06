import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        List<List<String>> lista = montarListaFrase(texto);
        String textoEnc = encryptarFrase(lista);

        System.out.print(textoEnc);

    }

    private static List<List<String>> montarListaFrase(String texto) {
        texto = texto.replaceAll(" ", "");

        Integer tamanhoTexto = texto.length();
        Integer qtd = (int)
                Math.ceil(Math.sqrt(tamanhoTexto));
        Integer loopMax = (int)
                Math.ceil(tamanhoTexto / qtd);
        Integer posicao = 0;

        List<List<String>> lista = new ArrayList<>();
        for (int i = 1; i <= loopMax + 1; i++) {

            Integer loop = qtd * i;
            if (loop > tamanhoTexto) {
                loop = tamanhoTexto;
            }
            String textoSeparado = texto.substring(posicao, loop);
            if (!textoSeparado.isEmpty()) {
                lista.add(Arrays.asList(textoSeparado.split("")));
                posicao = posicao + qtd;
            }
        }
        return lista;
    }

    private static String encryptarFrase(List<List<String>> lista) {
        String textoEnc = "";
        Integer loopMax = lista.size();

        for (int i = 0; i < loopMax; i++) {
            String enc = "";
            for (int y = 0; y < loopMax; y++) {
                if (i < lista.get(y).size()) {
                    enc += lista.get(y).get(i);
                }
            }
            textoEnc += enc + " ";
        }
        return textoEnc;
    }
}