public class Linkedlist {
    //nodo -> pointer
    class Node {
        int value;
        Node next = null;
        Node(int value){
            this.value = value;
        }
    }
    //head
    protected Node head = null;
    //tail
    protected Node tail = null;

    //[5]->[7]->[10]
    // agregar elementos en la parte delantera.
    public void agregarHead(int valor) {
        Node nuevonodo = new Node(valor);
        nuevonodo.next = head;
        head = nuevonodo;
        if(nuevonodo.next == null){
            tail = nuevonodo;
        }
    }

    //Agregar elementos al final
    //head                   //tail
    // [10] -> [7] -> [5] -> null
    // [10] -> [7] -> [5] -> [20]
    public void agregarTail(int valor){
        Node nuevoNodo = new Node(valor);
        if(tail == null){
            head = nuevoNodo;
            tail = nuevoNodo;
        }
        tail.next = nuevoNodo;
        tail = nuevoNodo;
    }

    //Agregar elementos en cualquier posicion
    public void agregarAny(int valor, int posicion){

        if(posicion == 0){
            agregarHead(valor);
        } else {
            Node nuevoNodo = new Node(valor);
            Nodo nodoActual = head;
            for (int i = 0; i < posicion -1 ; i++) {
                nodoActual = nodoActual.next;

            }
        }


    }
}