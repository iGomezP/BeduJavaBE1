package org.bedu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


public class SortString {
    private static final Logger logger = LogManager.getLogger(SortString.class);

    public void sort() {
        String lista1[] = {"A", "B", "C", "D"};
        String lista2[] = {"D", "C", "A", "B"};
        String lista3[] = {};
        String lista4[] = null;

        // Array1
        imprimirArray(lista1);
        separadores();

        // Array2
        imprimirArray(lista2);
        separadores();

        // Array3
        imprimirArray(lista3);
        separadores();

        // Array4
        imprimirArray(lista4);
    }

    private void imprimirArray(String lista[]){
        boolean banderaOrdenamiento = false;
        logger.info("Array sin ordenar: ");
        logger.info(Arrays.toString(lista));
        if (lista != null && lista.length != 0){
            banderaOrdenamiento = sortingArray(lista, banderaOrdenamiento);
            if (banderaOrdenamiento){
                logger.info("Se terminó de ordenar el arreglo.");
            } else {
                logger.warn("El arreglo ya está ordenado.");
            }
        } else {
            logger.error("El arreglo está vacío.");
        }
    }

    private void separadores(){
        System.out.println("\n");
    }

    private boolean sortingArray(String lista[], boolean bandera){
        if (lista==null || lista.length == 0) {
            logger.error("El arreglo está vacío");
        }
        for (int i = 0; i < (lista.length-1); i++){
            for (int j=i+1;j < lista.length; j++){
                if (lista[i].compareToIgnoreCase(lista[j])>0){
                    String auxVar = lista[i];
                    lista[i]=lista[j];
                    lista[j] = auxVar;
                    bandera = true;
                }
            }
        }
        return bandera;
    }
}
