/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package pooej1;

import Entidades.Libro;
import Servicio.ServicioLibro;

/**
 *
 * @author Mile
 */
public class POOEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioLibro sl = new ServicioLibro();
        
        Libro libro1 = sl.crearLibro();
        
        System.out.println(libro1.toString());
        
    }
    
}
