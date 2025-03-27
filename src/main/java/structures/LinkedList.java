package structures;

public class LinkedList {

    Node firstNode;

    public void agregar(int dato){
        Node newNode =  new Node(dato,0);
        if (firstNode == null){
            firstNode = newNode;
        }else{
            Node aux = firstNode;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
    }

    public int[] convertirArray(){
        int longitud = 0;
        Node aux = firstNode;
        while(aux!= null){
            aux = aux.getNext();
            longitud++;
        }
        int[] array = new int[longitud];
        aux = firstNode;

        for (int i = 0; i < array.length; i++) {
            array[i] = aux.getKey();
            aux = aux.getNext();
        }

        return array;
    }
}
