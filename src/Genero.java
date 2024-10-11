public enum Genero {

    DRAMA("drama"),
    TERROR("terror"),
    SUSPENSE("suspense"),
    AVENTURA("aventura"),
    ROMANCE("romance");

    String genero;

    Genero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
