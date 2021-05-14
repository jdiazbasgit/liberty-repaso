package curso.liberty.concierto.musicos;

import curso.liberty.concierto.instrumentos.Instrumento;
import curso.liberty.concierto.instrumentos.InstrumentoInterface;

import java.util.List;
import java.util.Set;

public class HombreOrquesta  extends Musico{


    public HombreOrquesta(Set<Instrumento> instrumentos) {
        setInstrumentos(instrumentos);
    }

    @Override
    public void tocar() {

        for (InstrumentoInterface instrumento:getInstrumentos()) {
            System.out.println(instrumento.sonar()+" - "+instrumento.hashCode());
        }

    }
}
