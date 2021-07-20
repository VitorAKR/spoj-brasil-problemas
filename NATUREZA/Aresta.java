
package NATUREZA;

/**
 *
 * @author Vitor Reiter
 */
public class Aresta {
    private Vertice vInicio;
    private Vertice vFim;

    public Aresta(Vertice vInicio, Vertice vFim) {
        this.vInicio = vInicio;
        this.vFim = vFim;
    }
    
    //getters e setters

    public Vertice getvInicio() {
        return vInicio;
    }

    public void setvInicio(Vertice vInicio) {
        this.vInicio = vInicio;
    }

    public Vertice getvFim() {
        return vFim;
    }

    public void setvFim(Vertice vFim) {
        this.vFim = vFim;
    }
    
}
