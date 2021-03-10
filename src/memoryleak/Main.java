package memoryleak;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    
        Thread.sleep(10000);
        System.out.println("un numero aleatorio"+ ClaseConVariableEstaticaPesada.NUMEROS_ALEATORIOS.get(5));
        System.gc();//forzar la recoleccion de basura
        Thread.sleep(5000);
    //Nota cuando usamos una referencia a una variable static de una clase esta se queda en memoria
    //hasta el final del programa ocupando memoria Tener cuado cuando usamos una variable statica
    
    //Si perro no tiene implentado el hashcode y equasl se crearan 1000 perro pero si los tienen solo se implementara uno debido a atributo husky
        HashMap<Perro, Integer> map = new HashMap<>();
        for(int i=0; i<1000;i++){
            map.put(new Perro("husky"), i);
        }

}



}
