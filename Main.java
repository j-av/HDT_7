import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 
 * @author julio
 * @version 4/16/2021
 * Clase principal para el manejo del traductor
 *
 */

public class Main {
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("Bienvenido al traductor");
    	System.out.println("Ingrese la ruta de su diccionario");
    	String rutadiccionario = teclado.next();
        ArrayList<Association> dictionary = new ArrayList<>();
        Lector lector = new Lector();
        ArrayList<String> words = lector.leerDiccionario(rutadiccionario);
        ArrayList inOrder = new ArrayList();
        String[] lista1;
        String palabra;
        String key = "";
        String value = "";

        System.out.println("Seleccione que traduccion desea hacer");
        System.out.println("1. Ingles a espanol");
        System.out.println("2. Espanol a ingles");
        System.out.println("3. Ingles a frances");
        System.out.println("4. Frances a ingles");
        System.out.println("5. Espanol a frances");
        System.out.println("6. Frances a espanol");
        int opcionseleccionada = teclado.nextInt();
        
        if(opcionseleccionada == 1) {//Traduce de ingles a español

        System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
        String rutaTexto = teclado.next();
        for (int i = 0; i < words.size(); i++) {
            palabra = words.get(i);
            palabra = palabra.replaceAll("\\(", "");
            palabra = palabra.replaceAll("\\)", "");
            lista1 = palabra.split(",");
            key = lista1[0];
            value = lista1[1];
            dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
        }
        BinaryTree arbolbinario = new BinaryTree<>();
        for (int i = 0; i < dictionary.size(); i++) {
            arbolbinario.add(dictionary.get(i));
        }

        arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

        String text = lector.leerTexto(rutaTexto);
        System.out.println("Texto a traducir: "+text);
        boolean existe = false;
        String[] splittedText = text.split(" ");
        String newText = "";

        for (int i = 0; i < splittedText.length; i++) {
            existe = false;
            for (int j = 0; j < dictionary.size(); j++) {
                if (splittedText[i].equals(dictionary.get(j).key)) {
                    newText += dictionary.get(j).value + " ";
                    existe = true;
                }
            }
            if (existe == false) {
                newText += "*" + splittedText[i] + "*" + " ";
            }
        }

        System.out.println("\n" + newText);
        System.out.println("Gracias por usar el traductor");
    }
        if(opcionseleccionada == 2) {//Traduce de español a ingles

        System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
        String rutaTexto = teclado.next();
        for (int i = 0; i < words.size(); i++) {
            palabra = words.get(i);
            palabra = palabra.replaceAll("\\(", "");
            palabra = palabra.replaceAll("\\)", "");
            lista1 = palabra.split(",");
            key = lista1[1];
            value = lista1[0];
            dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
        }
        BinaryTree arbolbinario = new BinaryTree<>();
        for (int i = 0; i < dictionary.size(); i++) {
            arbolbinario.add(dictionary.get(i));
        }

        arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

        String text = lector.leerTexto(rutaTexto);
        System.out.println("Texto a traducir: "+text);
        boolean existe = false;
        String[] splittedText = text.split(" ");
        String newText = "";

        for (int i = 0; i < splittedText.length; i++) {
            existe = false;
            for (int j = 0; j < dictionary.size(); j++) {
                if (splittedText[i].equals(dictionary.get(j).key)) {
                    newText += dictionary.get(j).value + " ";
                    existe = true;
                }
            }
            if (existe == false) {
                newText += "*" + splittedText[i] + "*" + " ";
            }
        }

        System.out.println("\n" + newText);
        System.out.println("Gracias por usar el traductor");
    }
        if(opcionseleccionada == 3) {//Traduce de ingles a frances

        System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
        String rutaTexto = teclado.next();
        for (int i = 0; i < words.size(); i++) {
            palabra = words.get(i);
            palabra = palabra.replaceAll("\\(", "");
            palabra = palabra.replaceAll("\\)", "");
            lista1 = palabra.split(",");
            key = lista1[0];
            value = lista1[2];
            dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
        }
        BinaryTree arbolbinario = new BinaryTree<>();
        for (int i = 0; i < dictionary.size(); i++) {
            arbolbinario.add(dictionary.get(i));
        }

        arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

        String text = lector.leerTexto(rutaTexto);
        System.out.println("Texto a traducir: "+text);
        boolean existe = false;
        String[] splittedText = text.split(" ");
        String newText = "";

        for (int i = 0; i < splittedText.length; i++) {
            existe = false;
            for (int j = 0; j < dictionary.size(); j++) {
                if (splittedText[i].equals(dictionary.get(j).key)) {
                    newText += dictionary.get(j).value + " ";
                    existe = true;
                }
            }
            if (existe == false) {
                newText += "*" + splittedText[i] + "*" + " ";
            }
        }

        System.out.println("\n" + newText);
        System.out.println("Gracias por usar el traductor");
    }
        if(opcionseleccionada == 4) {//Traduce de frances a ingles

        System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
        String rutaTexto = teclado.next();
        for (int i = 0; i < words.size(); i++) {
            palabra = words.get(i);
            palabra = palabra.replaceAll("\\(", "");
            palabra = palabra.replaceAll("\\)", "");
            lista1 = palabra.split(",");
            key = lista1[2];
            value = lista1[0];
            dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
        }
        BinaryTree arbolbinario = new BinaryTree<>();
        for (int i = 0; i < dictionary.size(); i++) {
            arbolbinario.add(dictionary.get(i));
        }

        arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

        String text = lector.leerTexto(rutaTexto);
        System.out.println("Texto a traducir: "+text);
        boolean existe = false;
        String[] splittedText = text.split(" ");
        String newText = "";

        for (int i = 0; i < splittedText.length; i++) {
            existe = false;
            for (int j = 0; j < dictionary.size(); j++) {
                if (splittedText[i].equals(dictionary.get(j).key)) {
                    newText += dictionary.get(j).value + " ";
                    existe = true;
                }
            }
            if (existe == false) {
                newText += "*" + splittedText[i] + "*" + " ";
            }
        }

        System.out.println("\n" + newText);
        System.out.println("Gracias por usar el traductor");
    }
        if(opcionseleccionada == 5) {//Traduce de español a frances

        System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
        String rutaTexto = teclado.next();
        for (int i = 0; i < words.size(); i++) {
            palabra = words.get(i);
            palabra = palabra.replaceAll("\\(", "");
            palabra = palabra.replaceAll("\\)", "");
            lista1 = palabra.split(",");
            key = lista1[1];
            value = lista1[2];
            dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
        }
        BinaryTree arbolbinario = new BinaryTree<>();
        for (int i = 0; i < dictionary.size(); i++) {
            arbolbinario.add(dictionary.get(i));
        }

        arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

        String text = lector.leerTexto(rutaTexto);
        System.out.println("Texto a traducir: "+text);
        boolean existe = false;
        String[] splittedText = text.split(" ");
        String newText = "";

        for (int i = 0; i < splittedText.length; i++) {
            existe = false;
            for (int j = 0; j < dictionary.size(); j++) {
                if (splittedText[i].equals(dictionary.get(j).key)) {
                    newText += dictionary.get(j).value + " ";
                    existe = true;
                }
            }
            if (existe == false) {
                newText += "*" + splittedText[i] + "*" + " ";
            }
        }

        System.out.println("\n" + newText);
        System.out.println("Gracias por usar el traductor");
    }
        if(opcionseleccionada == 6) {//Traduce de frances a español

        System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
        String rutaTexto = teclado.next();
        for (int i = 0; i < words.size(); i++) {
            palabra = words.get(i);
            palabra = palabra.replaceAll("\\(", "");
            palabra = palabra.replaceAll("\\)", "");
            palabra = palabra.replaceAll(".", "");
            lista1 = palabra.split(",");
            key = lista1[2];
            value = lista1[1];
            dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
        }
        BinaryTree arbolbinario = new BinaryTree<>();
        for (int i = 0; i < dictionary.size(); i++) {
            arbolbinario.add(dictionary.get(i));
        }

        arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

        String text = lector.leerTexto(rutaTexto);
        System.out.println("Texto a traducir: "+text);
        boolean existe = false;
        String[] splittedText = text.split(" ");
        String newText = "";

        for (int i = 0; i < splittedText.length; i++) {
            existe = false;
            for (int j = 0; j < dictionary.size(); j++) {
                if (splittedText[i].equals(dictionary.get(j).key)) {
                    newText += dictionary.get(j).value + " ";
                    existe = true;
                }
            }
            if (existe == false) {
                newText += "*" + splittedText[i] + "*" + " ";
            }
        }

        System.out.println("\n" + newText);
        System.out.println("Gracias por usar el traductor");
    }


        
}
}