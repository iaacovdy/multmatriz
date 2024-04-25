package multiplos;

/**
 * PROGRAMA QUE MUESTRA EN PANTALLA LOS MÚLTIPLOS DE X NÚMERO MENORES QUE Y SIENDO X y Y PROPORCIONADOS POR EL USUARIO
 * EL PROCESO SE DETIENE AL LLEGAR AL TOPE Y Ó LUEGO DE MOSTRAR 100 NÚMEROS PARA EVITAR BUCLES INFINITOS
 * @author Daza Yepes Santiago
 */
import java.util.Scanner;//Importa el objeto scanner para leer datos del usuario
public class Multiplos {
    
    public static void main(String[] args) {
        Scanner SD=new Scanner(System.in);//Crea un nuevo scanner "SD"
        System.out.println("Múltiplos de: ");//Solicita al usuario que ingrese el múltiplo deseado
        int SDmul=SD.nextInt();//Usa el scanner para leer el múltiplo deseado
        System.out.println("Hasta: ");//Solicita al usuario que ingrese el número tope
        int SDmax=SD.nextInt();//Usa el scanner para leer el número tope
        
        int i=1;//Define la variable i como entero y le asigna valor incial de 1
        while (i<=(SDmax/SDmul)){//Ciclo que funciona mientras i sea menor a la cantidad de múltiplos ente 0 y tope
            System.out.println("Múltiplo " + i + ": " + i*SDmul); // Muestra en pantalla los múltiplos obtenidos, numerados
            i=i+1;//Avanza +1 en la variable i
            if (i==101){//Verifica que la cantidad de múltiplos acumulados sea menor a 100
                break;}//Detiene el proceso luego de mostrar los primeros 100 resultados
        }
        for (int j=1;j<=(SDmax/SDmul);j++){//Misma función, pero esta vez usando ciclos for (compacto)
            if (j==101){//Verifica que la cantidad de múltiplos acumulados sea menor a 100
                break;}//Detiene el proceso luego de mostrar los primeros 100 resultados
            System.out.println("Múltiplo " + j + ": " + j*SDmul);// Muestra en pantalla los múltiplos obtenidos, numerados
        }
    }
    
}
