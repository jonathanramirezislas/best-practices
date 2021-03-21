package decorator.decorador;

import decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
    
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
    
}
