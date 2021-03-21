package decorator;

import decorator.decorador.MayusculaDecorador;
import decorator.decorador.RemplazarEspaciosDecorador;
import decorator.decorador.ReversaDecorador;
import decorator.decorador.SubrayadoDecorador;

public class Main {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola soy Jonathan!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        RemplazarEspaciosDecorador remplazar = new RemplazarEspaciosDecorador(subrayar);

        System.out.println(remplazar.darFormato());
    }
}
