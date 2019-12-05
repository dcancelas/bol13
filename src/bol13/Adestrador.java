package bol13;

public class Adestrador extends seleccionFutbol {

    private String idFederacion;

    public Adestrador() {

    }
    public Adestrador(int id, String nome, String apelido, int edade, String idFederacion) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void viaxar() {
        System.out.println("Viaxan os xogadores");
    }
    public void darMasaxes() {
        System.out.println("Adestrador da masaxes");
    }

    @Override
    public String toString() {
        return "Adestrador: " +
                "idFederacion='" + idFederacion + " ";
    }
}
