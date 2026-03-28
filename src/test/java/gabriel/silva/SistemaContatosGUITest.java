package gabriel.silva;

import gabriel.silva.SistemaContatosGUI;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class SistemaContatosGUITest {
    @Test

    public void testGUIInitialization() {

        assumeFalse(Boolean.getBoolean("java.awt.headless"), "Skipping GUI test in headless environment.");
        SistemaContatosGUI gui = new SistemaContatosGUI();
        assertNotNull(gui);
    }
}
