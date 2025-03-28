public class SalaDeEmergenciaTest {
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

    public static void testPrimerPaciente() {
        Paciente resultado = SalaDeEmergencia.calcularAtencionN(1);

        assertEquals("Juan", resultado.nombre, "El nombre del primer paciente es incorrecto");
        assertEquals("Perez", resultado.apellido, "El apellido del primer paciente es incorrecto");
    }

    public static void testPacienteNoExistente() {
        Paciente resultado = SalaDeEmergencia.calcularAtencionN(40);

        assertNull(resultado, "Se espera que el 40-ésimo paciente no exista.");
    }

    public static void testPaciente102030() {
        Paciente r10 = SalaDeEmergencia.calcularAtencionN(10);
        Paciente r20 = SalaDeEmergencia.calcularAtencionN(20);
        Paciente r30 = SalaDeEmergencia.calcularAtencionN(30);

        assertEquals("Pedro", r10.nombre, "El nombre del 10-ésimo paciente es incorrecto");
        assertEquals("Rodriguez", r10.apellido, "El apellido del 10-ésimo paciente es incorrecto");

        assertEquals("Marta", r20.nombre, "El nombre del 20-ésimo paciente es incorrecto");
        assertEquals("Gutierrez", r20.apellido, "El apellido del 20-ésimo paciente es incorrecto");

        assertEquals("Valeria", r30.nombre, "El nombre del 30-ésimo paciente es incorrecto");
        assertEquals("Ibanez", r30.apellido, "El apellido del 30-ésimo paciente es incorrecto");
    }

    public static void main(String[] args) {
        testPrimerPaciente();
        testPacienteNoExistente();
        testPaciente102030();
    }
}
