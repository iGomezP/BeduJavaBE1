package org.bedu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class SortInt {

    private static final Logger logger = LoggerFactory.getLogger(SortInt.class);

    public void sort () {

        int[] listaInt1 = {1, 2, 3, 4};
        final int TAMANIO = 10;
        int[] listaInt2 = new int [TAMANIO];
        rellenarArray(listaInt2);
        int[] listaInt3 = {};
        int[] listaInt4 = null;

        // ListaInt1
        imprimirArrayInt(listaInt1);
        separadores();

        // ListaInt2
        imprimirArrayInt(listaInt2);
        separadores();

        // ListaInt3
        imprimirArrayInt(listaInt3);
        separadores();

        // ListaInt4
        imprimirArrayInt(listaInt4);
        separadores();
    }

    private void imprimirArrayInt(int[] listaInt){
        boolean banderaOrdenamiento = false;
        logger.info("Array de números sin ordenar: ");
        logger.info(Arrays.toString(listaInt));
        if (listaInt != null && listaInt.length != 0){
            banderaOrdenamiento = sortingInt(listaInt, banderaOrdenamiento);
            if (banderaOrdenamiento){
                logger.info("Se terminó de ordenar el arreglo.");
            } else {
                logger.warn("El arreglo ya está ordenado.");
            }
            logger.info("Array ordenado: ");
            logger.info(Arrays.toString(listaInt));
        } else {
            logger.error("El arreglo está vacío.");
        }
    }

    private void separadores(){
        System.out.println("\n");
    }

    private static void rellenarArray(int[] lista){
        for (int i=0;i<lista.length;i++){
            lista[i]=numeroAleatorio();
        }
    }

    private static int numeroAleatorio(){
        return ((int)Math.floor(Math.random()*1000));
    }

    private boolean sortingInt(int[] lista, boolean bandera){
        for (int i=0; i < (lista.length-1); i++){
            for (int j=i+1;j<lista.length;j++){
                if(lista[i]>lista[j]){
                    int auxVar = lista[i];
                    lista[i]=lista[j];
                    lista[j] = auxVar;
                    bandera =true;
                }
            }
        }
        return bandera;
    }
}
