import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Livro livro = new Livro("clean code", 233, 900, "978-3-16-148410-0");

    Autor autor = new Autor("linus");
    Exemplar exemplar = new Exemplar("4");
    Editora editora = new Editora("SO editora", "sp");

    Livro livro2 = new Livro(exemplar, Genero.AVENTURA, editora, autor);

    System.out.println(livro.toString());
    System.out.println("");
    System.out.println(livro2.toString());

    }
}