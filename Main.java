package TPE2;

import java.io.File;
import java.util.Iterator;

import TP3Grafos.Arco;
import TP3Grafos.GrafoNoDirigido;

public class Main {

        public static void main(String[] args) {
            

            GrafoNoDirigido<Integer> grafito = new GrafoNoDirigido<>();
            File file = new File("C:\\Users\\FranK\\Desktop\\TUDAI\\dataset1.txt");
            String path = file.getPath();

            CSVReader reader = new CSVReader(path);
            reader.read(grafito);

            Iterator<Arco<Integer>> it = grafito.obtenerArcos();
            while(it.hasNext()){
                Arco<Integer> nuevo = it.next();
                System.out.println(nuevo);
            }
            
            BackTracking back = new BackTracking(grafito);
            back.getBestSolution();
        }
    
    }

