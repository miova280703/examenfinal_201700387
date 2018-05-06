package examenfinal_201700387;

import java.util.Scanner;

/**
 *
 * @author IOVA
 */
public class ExamenFinal_201700387 {

    public static void main(String[] args) {
        ListaCircularD_201700387 l = new ListaCircularD_201700387();
        Scanner teclado = new Scanner(System.in);
        l.IngresarNodo(36);
        l.IngresarNodo(57);
        l.IngresarNodo(2);
        l.IngresarNodo(0);
        l.IngresarNodo(12);
        l.IngresarNodo(62);
        l.IngresarNodo(25);
        l.Desplegar();
        l.Tamaño();
        l.Buscar(0);
        l.Modificar(0);
    }
    
}
