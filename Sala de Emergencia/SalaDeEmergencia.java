import java.util.List;

public class SalaDeEmergencia {

    /**
     * Calcula el N-ésimo paciente en ser atendido
     * 
     * @param n N-ésimo paciente a buscar
     * @pre n >= 1
     * @return El n-ésimo paciente o null si no existe
     */
    public static Paciente calcularAtencionN(int n) {
        if(n < 1)
            throw new IllegalArgumentException();
    
        List<Paciente> pacientesPorLlegada = Paciente.leerPacientes();
        ColaPrioridad<Paciente> cola = new ColaPrioridadArray<>();
    
        for(Paciente p : pacientesPorLlegada){
            cola.insertar(p, p.clasificacionEmergencia());
        } 
    
        if(n > cola.tamanio()){
            return null;
        }
    
        for(int i = 0; i < n-1; i++){  
            cola.eliminar();
        }
        return cola.eliminar();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Pasar el número de paciente a calcular");
            return;
        }
        int n = Integer.parseInt(args[0]);
        Paciente resultado = calcularAtencionN(n);
        System.out.print("Paciente: ");
        System.out.println(resultado);
    }
}
