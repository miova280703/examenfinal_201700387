package examenfinal_201700387;
import java.util.Scanner;
/**
 *
 * @author IOVA
 */
public class ListaCircularD_201700387 {
    Nodo_201700387 inicio;
    Nodo_201700387 ultimo;
    int tamaño;
     Scanner teclado = new Scanner(System.in);
    
    public ListaCircularD_201700387(){
        inicio=null;
        ultimo=null;    
        tamaño=0;
    }
    
    public void Buscar (int x){//Recorre la lista circular desde el ultimo hacia el primero
        Nodo_201700387 actual = new Nodo_201700387();
        actual=ultimo;
        boolean encontrado = false;
        do{//Compara el dato que se desea buscar en los datos que la lista ya posee
            if(actual.dato==x){
                encontrado=true;
            }
            actual=actual.anterior;
        }while(actual!=ultimo && encontrado != false);//Se ejecuta el ciclo mientras el dato sea distinto al ultimo y mientras no se haya encontrado el dato.
        if(encontrado=true){//Si ya se encontró el dato se imprime este mensaje
            System.out.println("NODO ENCONTRADO");
        }else{
            System.out.println("NODO NO ENCONTRADO");//Si el dato no se encuentra se imprime este mensaje
        }
    }
    
    public void IngresarNodo(int x){//Metodo para crear nodos
        Nodo_201700387 nuevo = new Nodo_201700387();
        nuevo.dato=x;//El valor que se va a ingresar será el primero en la lista vacía.
        if(inicio==null){//Si la lista está vacia se realiza lo siguiente
            inicio=nuevo;//El inicio de la lista será el dato ingresado
            inicio.siguiente=inicio;//Como es circular, el enlace siguiente apunta al primero
            nuevo.anterior=ultimo;//El dato que se ingresó apunta al ultimo dato
            ultimo = nuevo;//El ultimo dato es el que se ingreso
            //Como es una lista circular doblemente enlazada y solo tiene un elemento tanto el primero como el ultimo son iguales.
        }else{//Si la lista ya no está vacía
            ultimo.siguiente=nuevo;//El ultimo elemento apunta al que se está ingresando
            nuevo.siguiente=inicio;//El dato que se ingresó es el inicio de la lista
            nuevo.anterior=ultimo;//El dato que se ingresó por ser el primero apunta al ultimo
            ultimo=nuevo;//El nuevo dato que se ingresó pasa a hacer el ultimo d el lista para continuar con la estructura de circulo
            inicio.anterior=ultimo;
        }
        tamaño++;//Muestra el tamaño que tendrá la lista, cada vez que se cree un nodo este aumentara uno
    }
    public void Modificar(int x){
        Nodo_201700387 actual = new Nodo_201700387();
        actual=inicio;//Posicion incial de la lista
        do{
            if(actual.dato==x){
                System.out.println("INGRESE UN NUEVO NUMERO PARA EL NODO: ");
                actual.dato= teclado.nextInt();
            }
            actual=actual.siguiente;//Recorre la lista del principio al final
        }while(actual!=inicio);//Realiza el metodo mientras que la posicion actual sea distinta al inicio. 
    }
    
    public void Tamaño(){//Muestra el tamaño de la lista
            System.out.println(""+tamaño);//Imprime el tamaño que la lista posse
    }
    
    public void Desplegar(){//Muestra todos los valores que la lista poseé
        Nodo_201700387 actual = new Nodo_201700387();
        actual=inicio;//Posicion incial de la lista
        do{
            System.out.println(""+actual.dato);//Imprime los datos
            actual=actual.siguiente;//Recorre la lista del principio al final
        }while(actual!=inicio);//Realiza el metodo mientras que la posicion actual sea distinta al inicio. 
    }
}
