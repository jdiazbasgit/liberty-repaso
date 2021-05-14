package curso.liberty.concierto.teatros;

import curso.liberty.concierto.instrumentos.Instrumento;
import curso.liberty.concierto.instrumentos.InstrumentoInterface;
import curso.liberty.concierto.instrumentos.cuerda.Guitarra;
import curso.liberty.concierto.instrumentos.percusion.Tambor;
import curso.liberty.concierto.instrumentos.viernto.Trompeta;
import curso.liberty.concierto.musicos.HombreOrquesta;

import java.util.*;

public class ConciertoHombreOrquesta {

    public static void main(String[] args) {

        Instrumento tambor= new Instrumento("apom, pom,, pom");
        Instrumento guitarra= new Instrumento("apom, pom,, pom");
        Instrumento trompeta= new Instrumento("ctuuu, tuuu, tuuu");

        Set<Instrumento> insrtumentos= new HashSet<>();
        insrtumentos.add(guitarra);
        insrtumentos.add(tambor);
        insrtumentos.add(trompeta);
        insrtumentos.add(guitarra);
        insrtumentos.add(guitarra);
        insrtumentos.add(tambor);
        insrtumentos.add(trompeta);
        insrtumentos.add(guitarra);
        insrtumentos.add(tambor);
        insrtumentos.add(trompeta);

        HombreOrquesta hombreOrquesta= new HombreOrquesta(insrtumentos);
        hombreOrquesta.tocar();

    }
}
