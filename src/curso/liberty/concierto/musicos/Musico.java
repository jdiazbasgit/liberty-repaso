package curso.liberty.concierto.musicos;

import curso.liberty.concierto.instrumentos.Instrumento;
import curso.liberty.concierto.instrumentos.InstrumentoInterface;

import java.util.List;
import java.util.Set;

public abstract class Musico implements MusicoInterface{

    private Instrumento instrumento;

    private Set<Instrumento> instrumentos;



    @Override
    public abstract void tocar() ;

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public Set<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(Set<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
}
