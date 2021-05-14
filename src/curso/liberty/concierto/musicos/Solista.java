package curso.liberty.concierto.musicos;

import curso.liberty.concierto.instrumentos.Instrumento;
import curso.liberty.concierto.instrumentos.InstrumentoInterface;

public class Solista extends Musico{

    public Solista(Instrumento instrumento) {
        setInstrumento(instrumento);
    }

    @Override
    public void tocar() {

       System.out.println(this.getInstrumento().sonar());

    }
}
