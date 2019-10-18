/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazada;

/**
 *
 * @author arturo
 */
public class Lista {
    private Nodo inicio;
    private Nodo fin;
    public Lista(){
        inicio=fin=null;
    }
    public void agregarFin(int info){
        Nodo nuevo = new  Nodo(info,null);
        if(inicio==null){
            inicio=fin=nuevo;
        }
        else{
            fin.getSiguiente(nuevo);
            fin=nuevo;
        }
    }
   public void  imprimir(){
       Nodo aux=inicio;
       while(aux!=null){
           System.out.println(aux.getDato());
           aux=aux.getSiguiente();
       }
   }
   public void eliminar(int valor){
       Nodo anterior=inicio;
       Nodo aux= inicio.getSiguiente();
       Nodo temp;
       while(aux!=null){
           if(aux.getDato()>valor){
               temp=aux.getSiguiente();
               anterior.setSiguiente(au);
           }
       }
   }
}
