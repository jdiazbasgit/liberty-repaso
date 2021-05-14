package curso.liberty.concierto.teatros;

import curso.liberty.concierto.instrumentos.Instrumento;
import curso.liberty.concierto.instrumentos.percusion.Tambor;
import curso.liberty.concierto.musicos.Solista;

public class ConciertoSolista {

    public static void main(String[] args) {

        Instrumento  tambor= new Instrumento ("pom, pom, pom, pom, pommmmm");
        Solista solista= new Solista(tambor);
        solista.tocar();


    }
}
