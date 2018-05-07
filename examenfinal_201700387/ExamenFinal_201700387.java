package examenfinal_201700387;

import java.util.Scanner;

/*
 *
 * @author IOVA
 */
public class ExamenFinal_201700387 {

    public static void main(String[] args) {
        ListaCircularD_201700387 l = new ListaCircularD_201700387();
        Scanner teclado = new Scanner(System.in);
        l.Ingresar(1);
        l.Ingresar(2);
        l.Ingresar(3);
        l.Ingresar(4);
        l.Ingresar(5);
        l.Ingresar(6);
        l.Ingresar(7);
        System.out.println("LISTA CIRCULAR CON DOBLE ENLACE ACTUAL:");
        
        l.Desplegar();
        
        l.Tamaño();
        
        l.Buscar(5);
        
        l.Eliminar(4);
        
        l.Modificar(7);        
    }
    
}
