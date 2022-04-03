public class FabricaLinux implements FabricaAbstrata{

    @Override
    public Button createButton(){
        return new ButtonLinux();
    }

    @Override
    public Form createForm(){
        return new FormLinux();
    }

}
