public class Exemplar {
    private String numTombo;

//    O tombamento ou registro consiste em dar um número a cada obra
//    por ordem de chegada à biblioteca.
//    Deve-se lembrar que o número é exclusivo daquele livro e não poderá ser usado
//    para outro, mesmo quando tiver sido retirado definitivamente da coleção, danificado ou extraviado.


    public Exemplar(String numTombo) {
        this.numTombo = numTombo;
    }

    public String getNumTombo() {
        return numTombo;
    }

    public void setNumTombo(String numTombo) {
        this.numTombo = numTombo;
    }
}
