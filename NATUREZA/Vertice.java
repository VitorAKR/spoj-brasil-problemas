
package NATUREZA;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Vitor Reiter
 */
public class Vertice{
    private String valor;
    private Color cor;
    private ArrayList<Aresta> aEntrada;
    private ArrayList<Aresta> aSaida;

    public Vertice(String valor) {
        //iniciar com valor e novas arestas
        this.valor = valor;
        this.aEntrada = new ArrayList<Aresta>();
        this.aSaida = new ArrayList<Aresta>();
    }
    
    public void addArestaEntrada(Aresta aresta){
        this.aEntrada.add(aresta);
    }

    public void addArestaSaida(Aresta aresta){
        this.aSaida.add(aresta);
     }
    
    //getter setter
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public ArrayList<Aresta> getaEntrada() {
        return aEntrada;
    }

    public void setaEntrada(ArrayList<Aresta> aEntrada) {
        this.aEntrada = aEntrada;
    }

    public ArrayList<Aresta> getaSaida() {
        return aSaida;
    }

    public void setaSaida(ArrayList<Aresta> aSaida) {
        this.aSaida = aSaida;
    }
    
}
