/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEnlazada;

import java.util.Scanner;

/**
 *
 * @author arturo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Lista coleccion=new Lista();
  int opcion;
 
 
  coleccion.agregarFin(25);
  coleccion.agregarFin(13);
  coleccion.agregarFin(2);
  coleccion.agregarFin(67);
  coleccion.agregarFin(23);
 
  do
  {
   opcion=menu();
   switch(opcion)
   {
   case 1:
   
    System.out.println("Lista Ingresada:");
    coleccion.imprimir();
    break;
 
   case 2:
    int exp=leerEntero("Ingrese el numero base para eliminar datos");
    coleccion.eliminar(exp);
    break;
   
 
   default:
    System.out.println("FIN");
    break;
   }
  }while(opcion!=3);

 }
public static int leerEntero(String texto)
 {
  Scanner leer=new Scanner(System.in);
  System.out.println(texto);
  int dato=leer.nextInt();
  return dato;
 }

 public static int menu()
 {
  System.out.println("Menu");
  System.out.println("1.- Imprimir lista");
  System.out.println("2.- Eliminar nodos que superen un valor dado");
  System.out.println("3.- Salir");
 

  int seleccion=leerEntero("Seleccione una opción: ");
  return seleccion;
 }
}


    
    

