
package NATUREZA;

import java.util.ArrayList;

/**
 *
 * @author Vitor Reiter
 */
public class Grafo {
    ArrayList<Vertice> vertices;
    ArrayList<Aresta> arestas;

    public Grafo() {
        this.vertices = new ArrayList<Vertice>();
        this.arestas = new ArrayList<Aresta>();
    }

    public Vertice getVertice(String valor) {
        Vertice vert = null;
        for (int i = 0; i < vertices.size(); i++) {
            //checar se valor é igual ao valor do elemento do array
            if(vertices.get(i).getValor().equals(valor)){
                vert = vertices.get(i);
                break;
            }            
        }
        
        return vert;
    }
    
    public void addVertice(String valor){
        Vertice novoVert = new Vertice(valor);
        vertices.add(novoVert);
    }
    
    public void addAresta(String vInicio, String vFim){
        //receber vertices pra construir nova aresta com eles
        Vertice ini = this.getVertice(vInicio);
        Vertice fim = this.getVertice(vFim);
        Aresta novaAresta = new Aresta(ini, fim);
        ini.addArestaSaida(novaAresta);
        fim.addArestaEntrada(novaAresta);
        arestas.add(novaAresta);
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }
    
    
    
}
