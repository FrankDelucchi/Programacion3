package TPE2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import TP3Grafos.*;

public class BackTracking {
    
    private Grafo<?> grafo;
	private HashMap <Arco<?>, String> estados;
    private List<List<Arco<?>>> mejorSolucion;

    public BackTracking(Grafo<?> grafo){
        this.grafo = grafo;
        this.estados = new HashMap<>();
        this.mejorSolucion = new ArrayList<List<Arco<?>>>();
    }

    public List<List<Arco<?>>> getBestSolution(){
        
        ArrayList<Integer> solucionParcial = new ArrayList<>();
        Iterator<Integer> it = this.grafo.obtenerVertices();

        while(it.hasNext()){
            Integer vertice = it.next();
            solucionParcial.add(vertice);
            Back(solucionParcial);
            solucionParcial.remove(vertice);
        }
        return this.mejorSolucion;
    }

    private void Back(ArrayList<Integer> solucionParcial){

    }
}
