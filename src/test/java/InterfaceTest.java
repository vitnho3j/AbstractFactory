import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterfaceTest {

    @Test
    public void deveCriarButaoWindows() {
        FabricaAbstrata fabrica = new FabricaWindows();
        Interface interfaceGrafica = new Interface(fabrica);
        assertEquals("Button Windows", interfaceGrafica.gerarButton());
    }

    @Test
    public void deveCriarButaoLinux(){
        FabricaAbstrata fabrica = new FabricaLinux();
        Interface interfaceGrafica = new Interface(fabrica);
        assertEquals("Button Linux", interfaceGrafica.gerarButton());
    }

    @Test
    public void deveCriarFormWindows(){
        FabricaAbstrata fabrica = new FabricaWindows();
        Interface interfaceGrafica = new Interface(fabrica);
        assertEquals("Form Windows", interfaceGrafica.gerarForm());
    }

    @Test
    public void deveCriarFormLinux(){
        FabricaAbstrata fabrica = new FabricaLinux();
        Interface interfaceGrafica = new Interface(fabrica);
        assertEquals("Form Linux", interfaceGrafica.gerarForm());
    }


}
