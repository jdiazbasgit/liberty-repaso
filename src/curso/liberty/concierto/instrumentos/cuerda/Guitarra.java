package curso.liberty.concierto.instrumentos.cuerda;

import curso.liberty.concierto.instrumentos.InstrumentoInterface;

public class Guitarra  implements InstrumentoInterface {


    private String sonido;

    public Guitarra(String sonido) {
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
