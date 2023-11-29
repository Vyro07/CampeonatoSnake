/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Jordan
 */
public class List 
{
    //Declaración de variables
    private NodeList inicio;
    private NodeList fin;

    //Constructor de la lista
    public List() {
        this.inicio = null;
        this.fin = null;
    }

    //Método que valida si la lista está vacía
    public boolean estaVacia() {
        return inicio == null;
    }

    //Método que agrega un participante al inicio de la lista
    public void agregarAlInicio(Player valor) {
        NodeList nuevoNodo = new NodeList(valor);

        if (estaVacia()) {
            // Si la lista está vacía, el nuevo nodo es tanto el inicio como el fin
            inicio = fin = nuevoNodo;
        } else {
            // Si la lista no está vacía, ajusta los enlaces para el nuevo nodo
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo;
            inicio = nuevoNodo; // El nuevo nodo ahora es el inicio de la lista
        }
    }

    //Método que agrega un participante al final de la lista
    public void agregarAlFinal(Player valor) {
        NodeList nuevoNodo = new NodeList(valor);

        if (estaVacia()) {
            // Si la lista está vacía, el nuevo nodo es tanto el inicio como el fin
            inicio = fin = nuevoNodo;
        } else {
            // Si la lista no está vacía, ajusta los enlaces para el nuevo nodo
            nuevoNodo.anterior = fin;
            fin.siguiente = nuevoNodo;
            fin = nuevoNodo; // El nuevo nodo ahora es el fin de la lista
        }
    }
    
    //Método no usado por el momento
    public void mostrarListaFinalInicio() {
        if(!estaVacia())
         {
              //Se crea un nodo auxiliar inicializado en fin
            String concatena = "<->";
            NodeList aux = fin;
            
            while(aux != null)
            {
                //Se concatenan los valores y pasa al nodo anterior
                concatena = concatena + "{"+ aux.valor + "}<->";
                aux = aux.anterior;
            }
            JOptionPane.showMessageDialog(null, concatena, "Mostrando Datos de fin a inicio de "
                    + "la lista", JOptionPane.INFORMATION_MESSAGE);
         } 
 
    }
     
    //Método no usado por el momento
    public void mostrarListaInicioFinal(){
          if(!estaVacia())
         {
             //Se crea un nodo auxiliar inicializado en inicio
            String concatena = "<->";
            NodeList aux = inicio;
            
            while(aux != null)
            {
                //Se concatenan los valores y pasa al siguiente nodo
                concatena = concatena + "{"+ aux.valor + "}<->";
                aux = aux.siguiente;
            }
            JOptionPane.showMessageDialog(null, concatena, "Mostrando Datos de inicio al final de "
                    + "la lista", JOptionPane.INFORMATION_MESSAGE);
         } 
      }
      
    //Método no usado por el momento
    public Object eliminarElementoDelInicio()
     {
        
         Object elemento = inicio.valor;
         
         if(inicio == fin)
         {
             //Si la lista solo tiene un valor, mediante esta línea se elimina el dato dentro de ella
            inicio = fin = null;
         }
         else
         {
             //El nodo de inicio apunta al nodo siguiente, mientras que el nodo anterior apuntará a nulo
            inicio = inicio.siguiente;
            inicio.anterior = null;
         }
         return elemento;
     }
    //Método no usado por el momento
    public Object eliminarElementoDelFinal()
     {
        
         Object elemento = fin.valor;
         
         if(inicio == fin)
         {
             //Si la lista solo tiene un valor, mediante esta línea se elimina el dato dentro de ella
            inicio = fin = null;
         }
         else
         {
             //El nodo de fin apunta al nodo anterior, mientras que el nodo siguiente apuntará a nulo
            fin = fin.anterior;
            fin.siguiente = null;
         }
         return elemento;
     }
      
    //Métood que retorna el tamaño de la lista
    public int getTama()
     {
        int i=0;
        NodeList aux = inicio;
        
        //Mientras el nodo auxiliar no sea nulo, se itera sobre la variable i, avanzando en la lista
        while(aux != null)
            {
                aux = aux.siguiente;
                i++;
            }
        return i;
     }
     
    //Método que transfiere los datos de la lista a un array
    public Player[] toArray(){
         
         NodeList aux = inicio;
         //Se declara el array con el mismo tamaño de la lista
         Player array [] = new Player[getTama()];
         
         for(int i=0; i<array.length;i++)
         {
             //Se asigna al arreglo el valor del nodo auxiliar. Luego, avanza al siguiente nodo
            array[i] = aux.valor;
            aux = aux.siguiente;
         }
         return array;
     }
     
    //Método que valida que no se ingresen registros con los mismos apellidos
    public boolean validarApellidosRepetidos(String apellidos, Player players[]){
        //Bandera auxiliar
        boolean flag = false;
        
        //Ciclo for each que itera sobre el array
        for (Player player : players) {
            //Si los apellidos recibidos se encuentran en la lista, se asigna a flag un valor true
            if (apellidos.equals(player.getLastname())) {
                flag = true; 
            }
    }
      
       return flag;
      }
      
    //Método que valida que no se ingresen registros con el mismo email
    public boolean validarEmailRepetido(String email, Player players[]){
       
        boolean flag = false;
        
        for (Player player : players) {
            //Si el emmail recibido se encuentra en la lista, se asigna a flag un valor true
            if (email.equals(player.getEmail())) {
                flag = true; 
            }
        }
      
        return flag;
    }
      
    //Método que valida que no se ingresen registros con el mismo nickname
    public boolean validarNickRepetido(String nickname, Player players[]){
       
        boolean flag = false;
        
        for (Player player : players) {
            //Si el nickname recibido se encuentran en la lista, se asigna a flag un valor true
            if (nickname.equals(player.getNickname())) {
                flag = true; 
            }
        }
      
        return flag;
      }
     
     
}
