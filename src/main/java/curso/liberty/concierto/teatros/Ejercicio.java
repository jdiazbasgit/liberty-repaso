package curso.liberty.concierto.teatros;

import curso.liberty.concierto.instrumentos.Instrumento;
import curso.liberty.concierto.musicos.HombreOrquesta;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio {

    public static void main(String[] args) {

        Set<Instrumento> uno= new TreeSet<>();
        uno.add(new Instrumento("aaaa"));
        HombreOrquesta h1= new HombreOrquesta(uno);
        h1.setNombre("uno");

        Set<Instrumento> dos= new TreeSet<>();
        dos.add(new Instrumento("aaaa"));
        dos.add(new Instrumento("bbbb"));
        HombreOrquesta h2= new HombreOrquesta(dos);
        h2.setNombre("dos");

        Set<Instrumento> tres= new TreeSet<>();
        tres.add(new Instrumento("aaaa"));
        tres.add(new Instrumento("bbbb"));
        tres.add(new Instrumento("cccc"));
        HombreOrquesta h3= new HombreOrquesta(tres);
        h3.setNombre("tres");

        Set<Instrumento> cuatro= new TreeSet<>();
        cuatro.add(new Instrumento("aaaa"));
        cuatro.add(new Instrumento("bbbb"));
        cuatro.add(new Instrumento("cccc"));
        cuatro.add(new Instrumento("dddd"));
        HombreOrquesta h4= new HombreOrquesta(cuatro);
        h4.setNombre("cuatro");

        Set<Instrumento> cinco= new TreeSet<>();
        cinco.add(new Instrumento("aaaa"));
        cinco.add(new Instrumento("bbbb"));
        cinco.add(new Instrumento("cccc"));
        cinco.add(new Instrumento("dddd"));
        cinco.add(new Instrumento("eeee"));
        HombreOrquesta h5= new HombreOrquesta(cinco);
        h5.setNombre("cinco");

        Set<HombreOrquesta> lista= new TreeSet<>();
        lista.add(h1);
        lista.add(h2);
        lista.add(h3);
        lista.add(h4);
        lista.add(h5);
        for (HombreOrquesta musico:lista) {
            System.out.println(musico.getNombre());
            musico.tocar();
        }


    }
}
