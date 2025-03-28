public class ColaPrioridadArray<T> implements ColaPrioridad<T> {
    private class Elemento<T>{
        T valor;
        int prioridad;
        int ordenLlegada;
    
        Elemento(T valor, int prioridad, int ordenLlegada){
                this.valor = valor;
                this.prioridad = prioridad;
                this.ordenLlegada = ordenLlegada;
        }
    }
    private Elemento<T>[] elementos;
    private int cant;
    private int contadorLlegada;
    
    @SuppressWarnings("unchecked")
    public ColaPrioridadArray() {
        elementos = (Elemento<T>[]) new Elemento[10];
        cant = 0;
        contadorLlegada = 0;
    }

    public void insertar(T elem, int prioridad) {
        if(cant == elementos.length){
            expandir();
        }
        Elemento<T> nuevo = new Elemento<>(elem, prioridad, contadorLlegada++);
    
        int i = cant - 1;
        while (i >= 0 && compararElems(elementos[i], nuevo) > 0) {
            elementos[i + 1] = elementos[i];
            i--;
        }
        elementos[i + 1] = nuevo;
        cant++;
    }

    public T eliminar() {
        if(estaVacia()){
            return null;
        }
        
        T valor = elementos[0].valor;

        for(int i = 0; i < cant -1; i++){
            elementos[i] = elementos[i + 1];
        }
        elementos[cant - 1] = null;
        cant--;
        return valor;
    }

    public T observar() {
        if(estaVacia())
            throw new IllegalStateException("la cola esta vacia");
            return elementos[0].valor;
    }

    public boolean estaVacia() {
        return cant == 0;
    }

    public int tamanio() {
        return cant;
    }

    @SuppressWarnings("unchecked")
    private void expandir(){
        Elemento<T>[] nuevoArreglo = (Elemento<T>[]) new Elemento[elementos.length * 2];
        System.arraycopy(elementos, 0, nuevoArreglo, 0, elementos.length);
        elementos = nuevoArreglo;
    }

    private int compararElems(Elemento<T> a, Elemento<T> b){
        if(a.prioridad != b.prioridad){
            return Integer.compare(a.prioridad, b.prioridad);
        }
        return Integer.compare(a.ordenLlegada, b.ordenLlegada);
    }
}
