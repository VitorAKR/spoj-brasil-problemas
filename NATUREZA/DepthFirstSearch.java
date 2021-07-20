
package NATUREZA;

import java.awt.Color;

/**
 *
 * @author Vitor Reiter
 */
public class DepthFirstSearch {
    private int tamanho;
    private Vertice ini;
    private int tempo;

    public DepthFirstSearch(Vertice iniVert) {
        //tamanho da cadeia e tempo inicializam em 0 e apartir de um vertice
        this.tamanho = 0;
        this.ini = iniVert;
        tempo = 0;
    }
    
    //algoritmo DFS
    public void DFS(Grafo g){
        //setar cor em vertice origem 
        for (Vertice u : g.getVertices()) {
            u.setCor(Color.WHITE); //branco
        }
        for (Vertice u : g.getVertices()) {
            if(u.getCor() == Color.WHITE){
                //se cor for igual e valor de vertice igual ao incial, visita o vertice
                if(ini.getValor().equals(u.getValor())){
                    DFS_Visit(u);
                }
            }
        }
    }

    private void DFS_Visit(Vertice u) {
        u.setCor(Color.GRAY); //cinza
        tempo++; // adiciona tempo
        tamanho++; //aumenta tamanho da cadeia
        //se encontrar um próximo vertice adjacente e for branco, então visita
        for (int i = 0; i < u.getaSaida().size(); i++) {
            Vertice v = u.getaSaida().get(i).getvFim();
            if (v.getCor() == Color.WHITE) {
                DFS_Visit(v);
            }
        }
    }
    
    //alterar comportamento padrão pra trazer tamanho
    @Override
    public String toString() {
        return "tamanho da cadeia = " + tamanho;
    }
    
}
