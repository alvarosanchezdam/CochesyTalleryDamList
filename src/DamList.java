import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Clase que hereda de ArrayList<E> con el metodo borrarSi().
 */
public class DamList<E> extends ArrayList<E>{
    public void borrarSi(Predicate<? super E> filter){
        //Recorro la lista y comprueba si cumple la condicion con test(), si la cumple borra la posicion del DamList
        // La lista se ha de recorrer al reves
        for (int i = this.size()-1; i >=0 ; i--) {
            E e =this.get(i);
            if(filter.test(e)){
                this.remove(i);
            }
        }
    }
}
