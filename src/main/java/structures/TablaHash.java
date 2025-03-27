package structures;

public class TablaHash {
    private Node[] tabla;
    private int size;

    //Inicializacion de la hash table

    public TablaHash (int size){
        this.size = size;
        tabla = new Node[size];
    }

    //Calcula la posicion de la hash table

    private int funcionHash(int key){
        return Math.abs(key)%size;
    }

    //Inserta un nuevo nodo en la hash table

    public void agregar(int key, int value){
        int index = funcionHash(key);
        Node newNode = new Node(key, value);

        if(tabla[index] == null){
            tabla[index] = newNode;
        }else{
            Node aux = tabla[index];
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
        }
    }

    //Calcula el indice hash en la clave

    public boolean contieneKey(int key){
        int index = funcionHash(key);
        Node temp = tabla[index];

        while(temp != null){
            if(temp.getKey() == key){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    //Obtiene el valor asociado a una key en la hash table

    public int obtener(int key){
        int index = funcionHash(key);
        Node temp = tabla[index];

        while(temp!= null){
            if(temp.getKey() == key){
                return temp.getValue();
            }
            temp = temp.getNext();
        }
        return -1;
    }
}
