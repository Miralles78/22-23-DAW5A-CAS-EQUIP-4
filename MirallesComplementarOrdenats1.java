import java.util.Scanner; //importem la bibliteca scanner

public class MirallesComplementarOrdenats1 { //Especifiquem el nostre nom que tindra el programa
    public static void main(String[] args) { //Despres aquets linea servei per a poder executar el nostre programa
        Scanner scaners = new Scanner(System.in); // Definim un scanner amb la variable scaners
        
        int lines = -1; //Variable lines esta creada per amb el valor -1 per a les lines 
        int contador = 1; // Especifiquem el contador amb el valor 1 per a que comneçe a contar a partit de la primera liena
        while(scaners.hasNext()){ // Definim un while amb el hasNext per a que ens detecte un fitxer amb els true i false
            if(scaners.nextBoolean()) //despres amb el if el nextboolean ens fara la boleana amb el fitxer.
            lines = contador; //Despres l'i estem dien que el la variable lines sigui igual que el contador
            contador ++; //El contador ens sumara una linea es a dir un numero.
        }
        System.out.println("L'ultim true esta a la linea "+ lines); // amb el println ens apareixera un misstage a la pantalla i el que ens dira el numero de la linea que es situa el ultim true.
}
}