package com.unab.Clase02;

public class ClaseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hola");
//            System.out.println(libro.toString());      
//        System.out.println(objetolibro2.getNumeroPaginas());


        Libros objetolibro1 = new Libros(1, "PROGRAMACIÓN JAVA", 100, "Deitel");
        Libros objetolibro2 = new Libros(2, "PROGRAMACIÓN PHP", 600, "Deitel");

        objetolibro1.setNumeroPaginas(200);


        if (objetolibro1.getNumeroPaginas() < objetolibro2.getNumeroPaginas()) {
            System.out.println("El libro 2 tiene mayor número de páginas que el libro 1, el libro 2 tiene un número de páginas de " +objetolibro2.getNumeroPaginas());
            System.out.println("La información del libro 2 es "+objetolibro2.toString());

        } else {
            System.out.println("El libro 1 tiene mayor número de páginas que el libro 2, el libro 1 tiene un número de páginas de "+objetolibro1.getNumeroPaginas());
            System.out.println("La información del libro 1 es "+objetolibro1.toString());
        }
    }

}
