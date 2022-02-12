package Datos;
import java.util.List;
/**
 *
 * @author Usuario
 * @param <T>
 */
public abstract class Dao<T> {
    public abstract int insertar(T obj);
    public abstract List<T> mostrarListado();
    public abstract int editar(T obj);
    public abstract int eliminar(T obj);
}
