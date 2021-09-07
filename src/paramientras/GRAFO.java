/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paramientras;

/**
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
public class GRAFO {
    
    ArrayList []lista;
    
    GRAFO(int n)
    {
        lista = new ArrayList[n];
        
        for(int i = 0; i < n; ++i ){
            lista[i] = new ArrayList();
        }
    }
    
    public void agregarArista(int i, int j){
        lista[i].add(j);
        lista[j].add(i);
    }
    
    public void borrarArista(int i, int j){
        lista[i].remove(j);
        lista[j].remove(i);
    }
    
    public void mostrar_lista(){
        int i,j;
        
        System.out.println();
        for(i = 1; i < lista.length; ++i ){
            System.out.println();
            System.out.printf("Nodo %d:", i);
            Iterator it = lista[i].iterator();
            
            while( it.hasNext() ){
                System.out.printf(" %d", (int)it.next());
            }
        }
    }
    
    
    
}
