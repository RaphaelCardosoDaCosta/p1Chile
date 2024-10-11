public class Livro {

    private String titulo;
    private int edicao;
    private int nPag;

    private Autor autor;
    private Editora editora;
    private Genero genero;
    private Exemplar exemplar;

    private String isbn;
//    é um padrão numérico criado com o objetivo de fornecer uma espécie de "RG"
//    para publicações monográficas, como livros, artigos e apostilas.

//    ex: 978-3-16-148410-0

    public Livro(String titulo, int edicao, int nPag, String isbn) {
        this.titulo = titulo;
        this.edicao = edicao;
        this.nPag = nPag;
        this.isbn = isbn;
    }

    public Livro(Exemplar exemplar, Genero genero, Editora editora, Autor autor) {
        this.exemplar = exemplar;
        this.genero = genero;
        this.editora = editora;
        this.autor = autor;
    }

    public Livro() {

    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getnPag() {
        return nPag;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", edicao=" + edicao +
                ", nPag=" + nPag +
                ", autor=" + autor +
                ", editora=" + editora +
                ", genero=" + genero +
                ", exemplar=" + exemplar +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
