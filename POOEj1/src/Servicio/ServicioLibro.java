/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class ServicioLibro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        
        System.out.println("Ingrese el ISBN");
        int isbn = leer.nextInt();
        System.out.println("Ingrese el titulo");
        String titulo = leer.next();
        System.out.println("Ingrese el autor");
        String autor = leer.next();
        System.out.println("Ingrese el numero de paginas");
        int paginas = leer.nextInt();
        
        return new Libro(isbn, titulo, autor, paginas);
    }
    
    
}
