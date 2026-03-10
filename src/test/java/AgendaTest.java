import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.uv.agenda.Agenda;

public class AgendaTest {

    @Test
    public void testAgregarTarea() {
        Agenda agenda = new Agenda();
        agenda.agregarTarea("Aprender GitHub Actions");
        
        // Verifica que, al añadir una tarea, esta se guarde correctamente 
        assertEquals(1, agenda.getCantidadTareas(), "La lista debería tener 1 tarea");
    }
}