package bol13;

public class Bol13 {

    public static void main(String[] args) {
        seleccionFutbol sele = new seleccionFutbol();
        Xogador xog = new Xogador();
        Adestrador ades = new Adestrador();
        seleccionFutbol xog2 = new Xogador();

        sele.concentrarse();
        xog.concentrarse();
        ades.concentrarse();
        xog2.concentrarse();
        //A saída é sempre a mesma.

        sele.viaxar();
        xog.viaxar();
        ades.viaxar();
        xog2.viaxar();
        //A saída é a mesma menos no caso do obxeto sele.

        System.out.println(xog.getNome());
        //sele.darMasaxes(); - Non se pode invocar un método dunha subclase cun obxeto do tipo da superclase.
    }
}
