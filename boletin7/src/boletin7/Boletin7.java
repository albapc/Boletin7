package boletin7;

import java.util.Scanner;

public class Boletin7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int exemplares, exPrestados;

        //constructor por defecto
        Libro obxLibro1 = new Libro();

        //constructor con parámetros
        Libro obxLibro2 = new Libro("Fuenteovejuna", "Lope de Vega", 1, 0);
        
        System.out.println("Introduce o título do libro:");
        titulo = sc.nextLine();
        System.out.println("Introduce o autor do libro:");
        autor = sc.nextLine();
        System.out.println("Introduce o número de exemplares:");
        exemplares = sc.nextInt();
        System.out.println("Introduce o número de exemplares prestados:");
        exPrestados = sc.nextInt();
        
        obxLibro1.setTitulo(titulo);
        obxLibro1.setAutor(autor);
        obxLibro1.setExemplares(exemplares);
        obxLibro1.setExPrestados(exPrestados);

        //móstranse os datos do obxecto con parámetros
        System.out.println("**********DATOS LIBRO 2**********");
        System.out.println("Título: " + obxLibro2.getTitulo());
        System.out.println("Autor: " + obxLibro2.getAutor());
        System.out.println("Número de exemplares: "
                + obxLibro2.getExemplares());
        System.out.println("Número de exemplates prestados: "
                + obxLibro2.getExPrestados());
        
        if (obxLibro2.facerPrestamo()) {
            System.out.println("Fíxose o préstamo do libro "
                    + obxLibro2.getTitulo());
        } else {
            System.out.println("Non quedan exemplares dispoñibles do libro "
                    + obxLibro2.getTitulo());
        }
        
        if (obxLibro1.facerPrestamo()) {
            System.out.println("Fíxose o préstamo do libro "
                    + obxLibro1.getTitulo());
        } else {
            System.out.println("Non quedan exemplares dispoñibles do libro "
                    + obxLibro1.getTitulo());
        }

//        if (obxLibro1.facerPrestamo()) {
//            System.out.println("Fíxose o préstamo do libro "
//                    + obxLibro1.getTitulo());
//        } else {
//            System.out.println("Non quedan exemplares dispoñibles do libro "
//                    + obxLibro1.getTitulo());
//        }
        //datos finais dos dous libros
        System.out.println("**********DATOS FINAIS LIBRO 1**********");
        System.out.println("Título: " + obxLibro1.getTitulo());
        System.out.println("Autor: " + obxLibro1.getAutor());
        System.out.println("Número de exemplares: "
                + obxLibro1.getExemplares());
        System.out.println("Número de exemplates prestados: "
                + obxLibro1.getExPrestados());
        
        System.out.println("**********DATOS FINAIS LIBRO 2**********");
        System.out.println("Título: " + obxLibro2.getTitulo());
        System.out.println("Autor: " + obxLibro2.getAutor());
        System.out.println("Número de exemplares: "
                + obxLibro2.getExemplares());
        System.out.println("Número de exemplates prestados: "
                + obxLibro2.getExPrestados());
    }
    
}
