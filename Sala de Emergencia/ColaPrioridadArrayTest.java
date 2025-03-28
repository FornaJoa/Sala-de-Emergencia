public class ColaPrioridadArrayTest {

    // Metodo auxiliar
    public static void assertEquals(Object expected, Object actual, String message) {
        if (!expected.equals(actual)) {
            System.err.println(message + " Expected: " + expected + ", but got: " + actual);
            System.exit(1);
        }
    }

    // Metodo auxiliar
    public static void assertNull(Object object, String message) {
        if (object != null) {
            System.err.println(message);
            System.exit(1);
        }
    }

    public static void testTamanioColaVacia() {
        ColaPrioridad<Integer> cola = new ColaPrioridadArray<>();

        assertEquals(0, cola.tamanio(), "La cola vacía debe tener tamanio 0");
    }

    public static void testAumentaTamanio() {
        ColaPrioridad<Integer> cola = new ColaPrioridadArray<>();
        int oldValue = cola.tamanio();
        cola.insertar(5, 1);
        int newValue = cola.tamanio();

        assertEquals(oldValue + 1, newValue, "Insertar() debe aumentar el tamanio");
    }

    public static void testDecrementaTamanio() {
        ColaPrioridad<Integer> cola = new ColaPrioridadArray<>();
        cola.insertar(5, 1);
        cola.insertar(4, 2);
        int oldValue = cola.tamanio();

        cola.eliminar();
        int newValue = cola.tamanio();

        assertEquals(oldValue, newValue + 1, "Eliminar() debe disminuir el tamanio");
    }

    public static void testColaVacia() {
        ColaPrioridad<Integer> cola = new ColaPrioridadArray<>();
        assertEquals(cola.estaVacia(), true, "EstaVacia() debe ser true en una cola recien construida");
    }

    public static void testColaNoVacia() {
        ColaPrioridad<Integer> cola = new ColaPrioridadArray<>();
        cola.insertar(1, 1);
        cola.insertar(2, 2);
        assertEquals(cola.estaVacia(), false, "EstaVacia() debe ser true en una cola con elementos");
    }

    public static void testColaObservar() {
        ColaPrioridad<String> cola = new ColaPrioridadArray<>();
        cola.insertar("a", 3);
        cola.insertar("b", 2);
        cola.insertar("c", 1);

        assertEquals("c", cola.observar(), "El primer elemento no es el esperado");
        assertEquals("c", cola.observar(), "Observar() no debe eliminar el elemento");
    }

    public static void testColaInsertarEliminar() {
        ColaPrioridad<String> cola = new ColaPrioridadArray<>();
        cola.insertar("a", 3);
        cola.insertar("b", 2);
        cola.insertar("c", 1);

        assertEquals("c", cola.eliminar(), "El primer elemento no es el esperado");
        assertEquals("b", cola.eliminar(), "El segundo elemento no es el esperado");

        cola.insertar("z", 2);
        assertEquals("z", cola.eliminar(), "El tercer elemento no es el esperado");
        assertEquals("a", cola.eliminar(), "El cuarto elemento no es el esperado");
        assertNull(cola.eliminar(), "Se espera null, debería estar vacia");
    }

    public static void main(String[] args) {
        testTamanioColaVacia();
        testAumentaTamanio();
        testDecrementaTamanio();
        testColaVacia();
        testColaNoVacia();
        testColaObservar();
        testColaInsertarEliminar();
    }

}
