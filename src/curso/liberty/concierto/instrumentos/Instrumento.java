package curso.liberty.concierto.instrumentos;

import java.util.Objects;

public class Instrumento implements InstrumentoInterface,Comparable<Instrumento>{
    private String sonido;

    public Instrumento(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public String sonar() {
        return getSonido();
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public int compareTo(Instrumento otro) {
        return getSonido().compareTo(otro.getSonido());
    }

    @Override
    public boolean equals(Object o) {
       Instrumento otro= (Instrumento) o;
       return getSonido().equals(otro.getSonido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(sonido);
    }
}
