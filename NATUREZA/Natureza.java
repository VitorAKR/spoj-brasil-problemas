/*
 * Aluno: Vitor Reiter
 * Implemente o problema "NATUREZA" existente 
 * no SPOJ (https://br.spoj.com/problems/NATUREZA/)
 * MODO DE USO
 * Colocar o arquivo chamado "entrada.in" no diretório "C:\temp\" para ser interpretado.
 * Conteúdo dentro do arquivo utilizado:
5 2
caterpillar
bird
horse
elefant
herb
herb caterpillar
caterpillar bird
 */
package NATUREZA;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Vitor Reiter
 */
public class Natureza {

    
    public static void main(String[] args) throws IOException {
        //tentar ler o arquivo "entrada.in"
        Path caminho = Paths.get("C:\\temp\\entrada.in");
        try(BufferedReader br = Files.newBufferedReader(caminho)){
            //iniciar variavel de criaturas (c) e relações (r)
            //lista de criaturas e cadeia (predado e predador)
            int c, r;
            Grafo grafo = new Grafo();
            String [] partes;
            String primeiraPresa = null;
            String linha = br.readLine();
            partes = linha.split(" ");
            c = Integer.parseInt(partes[0]);
            r = Integer.parseInt(partes[1]);
            //System.out.println("criaturas:"+ c + " | relações:" + r);
            while (linha != null) {
                //A entrada é terminada por um conjunto onde C = R = 0. 
                //Este conjunto não deve ser processado
                if(c == 0 && r == 0){
                    System.out.println("Criaturas e relações não podem ser 0.");
                    break;
                }
                
                //Processar criaturas como sendo os vertices
                for (int i = 0; i < c; i++) {
                    linha = br.readLine();
                    grafo.addVertice(linha);
                    //System.out.println(linha);
                }
                
                //Processar relações de presa (separado[0]) e predador (separado[1])
                for (int i = 0; i < r; i++) {
                    linha = br.readLine();
                    String[] separado = linha.split(" ");
                    
                    grafo.addAresta(separado[0], separado[1]);
                    //System.out.println(separado[0] +" eh morto por "+ separado[1]);
                    //pegar primeira presa pra usar como origem
                    if(primeiraPresa == null){
                        primeiraPresa = separado[0];
                        //System.out.println(primeiraPresa);
                    }
                }                    
                linha = br.readLine();
            }
            //começar a busca pela primeira presa capturada na relação (herb)
            DepthFirstSearch buscaDFS = new DepthFirstSearch(grafo.getVertice(primeiraPresa));
            //aplicar algoritmo DFS pra retornar a maior cadeia na saída
            buscaDFS.DFS(grafo);
            //imprimir tamanho
            System.out.println(buscaDFS.toString()); 
            
        }catch(FileNotFoundException e){
            System.out.println("Arquivo de entrada não encontrado!");
        }
    }

}
