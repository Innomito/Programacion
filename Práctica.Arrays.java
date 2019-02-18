/*
 *
 */
package javaapplication2;

/**
 *
 * @author infor10
 */
import java.util.*;

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("Escoge el número del ejercicio: ");
        opcion=entrada.nextInt();
        switch (opcion){
            case 1:
                E1();
                break;
            case 2:
                E2();
                break;
            case 3:
                E3();
                break;
            case 4:
                E4();
                break;
            case 5:
                E5();
                break;
            case 6:
                E6();
                break;
        }
    }
/** 1. Leer 5 números y mostrarlos en el mismo orden introducido.  */
    public static void E1() {
        int i;
        int[] numeros = {1, 2, 3, 4, 5};
        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
/** 2. Leer 5 números y mostrarlos en orden inverso al introducido. */
    public static void E2() {
        int i;
        int[] numeros = {1, 2, 3, 4, 5};
        for (i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
/** 3. Leer 5 números por teclado y a continuación realizar la media de los números
positivos, la media de los negativos y contar el número de ceros.  */
    public static void E3(){
        int[] miarray = new int[5];
        int positivos = 0;
        int totalpositivos = 0;
        int negativos = 0;
        int totalnegativos = 0;
        int ceros = 0;
        
        for (int i = 0; i < miarray.length; i++) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un número");
            miarray[i] = entrada.nextInt();
        }

        for (int i = 0; i < miarray.length; i++) {
            if(miarray[i]<0){
                totalnegativos+=miarray[i];
                negativos++;
            }else if(miarray[i]>0){
                totalpositivos+=miarray[i];
                positivos++;
            }else{
                ceros++;
            }            
        }
        float mediapos=totalpositivos/positivos;
        float medianeg=totalnegativos/negativos;
        
        System.out.println("media de los números positivos " + mediapos 
        + ",media de los números negativos " + medianeg +
        " y número de ceros " + ceros);
    }
/** 4. Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el
último, el segundo, el penúltimo, el tercero, etc. */
    public static void E4(){
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un número");
            array[i] = entrada.nextInt();
        }
        System.out.println("Números desordenados");
        System.out.println(array[0]);
        System.out.println(array[9]);
        System.out.println(array[1]);
        System.out.println(array[8]);
        System.out.println(array[2]);
        System.out.println(array[7]);
        System.out.println(array[3]);
        System.out.println(array[6]);
        System.out.println(array[4]);
    }
/** 5. Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de
la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc. */
    public static void E5(){
        int[] arrayuno = new int[10];
        int[] arraydos = new int[10];
        int[] arraytres = new int[20];
        int contador = 0;
        int contador2= 0;
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < arrayuno.length; i++) {
            System.out.print("Introduce un número: ");
            arrayuno[i] = entrada.nextInt();
        }
        for (int i = 0; i < arraydos.length; i++) {
            System.out.print("Introduce un número: ");
            arraydos[i] = entrada.nextInt();
        }
        
        
        for (int i = 0; i < 20; i+=2) {
           arraytres [i]=arrayuno[contador]; 
           contador++;
        }
        for (int f = 0; f < 20; f+=2) {
           arraytres [f+1]=arraydos[contador2]; 
           contador2++;
        }
        
        for (int p = 0; p < arraytres.length; p++) {
            System.out.print(arraytres[p]+" / ");
        }
    }
/**6. Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y
mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3
de la B, etc. */
    public static void E6(){
        int[] arrayuno = new int[6];
        int[] arraydos = new int[6];
        int[] arraytres = new int[12];
        Scanner entrada = new Scanner(System.in);
        int j=0;
        
        for (int i = 0; i < arrayuno.length; i++) {
            System.out.print("Introduce un número (1): ");
            arrayuno[i] = entrada.nextInt();
        }
        for (int i = 0; i < arraydos.length; i++) {
            System.out.print("Introduce un número (2): ");
            arraydos[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < arrayuno.length; i++) {
            arraytres[j] = arrayuno[i];
            j++;
            arraytres[j] = arraydos[i];
            j++;
        }
        
        for (int p = 0; p < arraytres.length; p++) {
            System.out.print(arraytres[p]+" / ");
        }
    }
}

