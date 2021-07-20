/* Aluno: Vitor Reiter
 * Implemente o problema "POPULAR" existente 
 * no SPOJ (https://br.spoj.com/problems/POPULAR/)
 * Código Submetido ao SPOJ e aceito em https://br.spoj.com/status/POPULAR/ 
 * (user: vakreiter, time: 0.55, mem: 128M)
 * MODO DE USO:
 * Insira pela Console a Entrada mencionada no site SPOJ, lembrando que entrada só irá parar quando receber 0.
 * Você poderá inserir em partes (inteiro n e matriz em seguida) ou colar toda a entrada na Console e ver a saída.
 * Entrada: 
3
1 0 1
0 1 1
1 0 1
5
1 1 1 0 0
1 1 0 1 1
1 0 1 0 1
0 1 0 1 0
0 1 1 1 1
3
1 0 0
0 1 0
0 0 1
0
 */
package POPULAR;

import java.util.Scanner;

/**
 *
 * @author Vitor Reiter
 */
public class Popularidade {

    public static void main(String[] args) {
        int maisVotado, n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a qtde de alunos:");
        //A entrada termina quando n = 0
        do{
            n = entrada.nextInt();
            // primeira linha de um caso de teste contém apenas um inteiro,
            //onde n (1 <= n <= 100)
            if(1 <= n && n <= 100){
                //criar Matriz nxn
                int [][] votos = new int [n][n];
                
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        votos[i][j] = entrada.nextInt();
                    }
                }

                //Decidir o mais popular
                maisVotado = 0;
                for (int i = 0; i < n; i++) {
                    int total = 0;
                    for (int j = 0; j < n; j++) {
                        total += votos[j][i];
                        if(total > maisVotado){
                            maisVotado = total;
                        }
                    }
                }
                System.out.println(maisVotado);
                //imprimeMatriz(votos);
            }else{
                //System.out.println("Quantidade de cédulas não permitida para o processamento");
                //System.out.println(0); //precisei comentar esta linha pra submissão no SPOJ aceitar 
            }
        }while(n!=0);

    }
    
      public static void  imprimeMatriz (int matriz [][] ){
          // método que imprime na console a matriz, só como auxilio (não é necessário)
          String saida = "Matriz de saida: \n";
        for (int l = 0; l < matriz.length; l++)  {     
         for (int c = 0; c < matriz[0].length; c++)     {   
             saida += matriz[l][c] ; //imprime caracter a caracter   
         }     
         saida +="\n"; //pula de linha   
        }

          System.out.println (saida);
        }
}
