package bol13;

public class Xogador extends seleccionFutbol{

    private int dorsal;
    private String demarcacion;

    public Xogador() {

    }
    public Xogador(int id, String nome, String apelido, int edade, int dorsal, String demarcacion) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void viaxar() {
        System.out.println("Viaxan os xogadores");
    }
    public void xogarPartido() {
        System.out.println("Os xogadores xogan o partido");
    }
    public void entrenar() {
        System.out.println("Entrenan os xogadores");
    }

    @Override
    public String toString() {
        return "Xogador: " +
                "dorsal=" + dorsal +
                ", demarcacion='" + demarcacion + " ";
    }
}
