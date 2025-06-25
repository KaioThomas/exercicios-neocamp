package aula02;

public abstract class Item implements ItemBiblioteca {

    public String getTipo() {
        return getClass().getSimpleName();
    }

}
