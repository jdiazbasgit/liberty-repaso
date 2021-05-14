package curso.liberty.concierto.musicos;

import curso.liberty.concierto.instrumentos.Instrumento;
import curso.liberty.concierto.instrumentos.InstrumentoInterface;

import java.util.List;
import java.util.Set;

public class HombreOrquesta  extends Musico implements Comparable<HombreOrquesta>{

    private String nombre;

    public HombreOrquesta(Set<Instrumento> instrumentos) {
        setInstrumentos(instrumentos);
    }

    @Override
    public void tocar() {

        for (InstrumentoInterface instrumento:getInstrumentos()) {
            System.out.println("-------------------> "+instrumento.sonar());
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int compareTo(HombreOrquesta otro) {
        return this.getInstrumentos().size()-otro.getInstrumentos().size();
    }
}
