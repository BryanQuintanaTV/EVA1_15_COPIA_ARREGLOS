/*
 * "EVALUACIÓN 1 PRÁCTICA 15
 *  COPIA ARREGLOS"
 */
package eva1_15_copia_arreglos;

/**
 *
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_15_COPIA_ARREGLOS {

   public static void main(String[] args) {
        int[] arregloDatos = new int[100];
        llenar(arregloDatos);
        imprimir(arregloDatos);
        
        //Copiar los valores almacenados en el arreglo
        int[] arregloCopia = new int [arregloDatos.length];
        System.out.println("");
        System.out.println(arregloDatos);
        System.out.println(arregloCopia);
        
        //¿Cómo crear la copia de los valores? 
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloCopia[(arregloCopia.length)-(i+1)] = arregloDatos[i];
            //arregloCopia[i] = arregloDatos[(arregloDatos.length -1)-i]
        }
            imprimir(arregloCopia);
    }
    
    public static void llenar(int[] arregloDatos){
        for (int i = 0; i < arregloDatos.length; i++) {
            arregloDatos[i] = (int) (Math.random()*100);
        }
    }
    
    public static void imprimir(int[] arregloDatos){
        for (int i = 0; i < arregloDatos.length; i++) {
            System.out.print(" [" + arregloDatos[i] + "]");
        }  
    }
}