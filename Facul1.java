package facul;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facul1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomeArquivo = null;
        String nome = "C:\\Users\\Usuario\\Desktop\\NumerosOrdenarArquivo.txt";
        nomeArquivo = nome;

        System.out.printf("\nConteúdo do arquivo texto:\n");
        try {

            List<String> listPalavras = new ArrayList<>();

            FileReader arq = new FileReader(nome);
            BufferedReader scArq = new BufferedReader(arq);

            String linha = scArq.readLine();

            while (linha != null) {
                System.out.printf("%s\n", linha);

                String[] palavrasDaLinha = linha.split(" ");

                for (String palavra : palavrasDaLinha) {

                    if (palavra.trim().length() > 1 && !"".equals(palavra.trim())) {
                        listPalavras.add(palavra);
                    }

                }
                linha = scArq.readLine();
            }

            arq.close();

            System.out.println("\n\n");
            System.out.printf("Total de palavras no arquivo: %s\n", listPalavras.size());

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        System.out.println();
    }
}
