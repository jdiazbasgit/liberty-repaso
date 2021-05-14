package curso.liberty.concierto.instrumentos.viernto;

import curso.liberty.concierto.instrumentos.InstrumentoInterface;

public class Trompeta implements InstrumentoInterface {


    private String sonido;

    public Trompeta(String sonido) {
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
