import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;
/**
 * 
 * @author julio
 * Clase que lee los archivos de texto
 *
 */

public class Lector {
	/**
	 * 
	 * @param rutadiccionario
	 * @return words
	 */
	
    public static ArrayList<String> leerDiccionario(String rutadiccionario) {
        String path = rutadiccionario;
        ArrayList<String> words = new ArrayList<>();

        try (Stream<String> fileStream = Files.lines(Paths.get(path))) {
            fileStream.forEach(item -> {
                words.add(item.toUpperCase());
            });


        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }

    /**
     * 
     * @param rutatexto
     * @return words
     */
    public static String leerTexto(String rutatexto) {
        String path = rutatexto;
        String words =  "";
        ArrayList<String> text = new ArrayList<>();

        try (Stream<String> fileStream = Files.lines(Paths.get(path))) {
            fileStream.forEach(item -> {
                text.add(item.toUpperCase());
            });


        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < text.size(); i++) {
            words += text.get(i) + " ";
        }
        return words;
    }

}
