package com.unab.Clase02;
//Clase

public class Libros {

    //Atributos
    private int Id;
    private String NombreLibros;
    private int NumeroPaginas;
    private String Autor;

    //Constructor      
    public Libros(int Id, String NombreLibros, int NumeroPaginas, String Autor) {

        this.Id = Id;
        this.NombreLibros = NombreLibros;
        this.NumeroPaginas = NumeroPaginas;
        this.Autor = Autor;

    }

    //get se utiliza para recuperar información
    public int getId() {
        return Id;
    }

    //set se utiliza para modificar información
    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreLibros() {
        return NombreLibros;
    }

    public void setNombreLibros(String NombreLibros) {
        this.NombreLibros = NombreLibros;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Libros{" + "Id=" + Id + ", NombreLibros=" + NombreLibros + ", NumeroPaginas=" + NumeroPaginas + ", Autor=" + Autor + '}';
    }

}
