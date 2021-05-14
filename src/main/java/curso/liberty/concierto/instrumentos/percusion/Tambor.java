package curso.liberty.concierto.instrumentos.percusion;

import curso.liberty.concierto.instrumentos.InstrumentoInterface;

public class Tambor implements InstrumentoInterface {

    private String sonido;

    public Tambor(String sonido) {
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




}
