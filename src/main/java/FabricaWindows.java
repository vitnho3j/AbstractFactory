public class FabricaWindows implements FabricaAbstrata{

    @Override
    public Button createButton() {
        return new ButtonWindows();
    }

    @Override
    public Form createForm(){
        return new FormWindows();
    }

}
