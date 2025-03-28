public interface ColaPrioridad<T> {

    /**
     * Inserta un elemento en la cola de prioridad con una prioridad específica.
     *
     * @param elem      El elemento a insertar
     * @param prioridad La prioridad del elemento
     */
    void insertar(T elem, int prioridad);

    /**
     * Elimina y devuelve el elemento con la prioridad más alta.
     *
     * @return el elemento con la prioridad más alta, o null si la cola está vacía
     */
    T eliminar();

    /**
     * Devuelve (sin eliminar) el elemento con la prioridad más alta.
     *
     * @return el elemento con la prioridad más alta, o null si la cola está vacía
     */
    T observar();

    /**
     * Verifica si la cola de prioridad está vacía.
     *
     * @return true si la cola está vacía, de lo contrario false
     */
    boolean estaVacia();

    /**
     * Devuelve el tamaño de la cola de prioridad.
     *
     * @return el número de elementos almacenados en la cola de prioridad
     */
    int tamanio();

}