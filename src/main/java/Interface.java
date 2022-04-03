public class Interface {

    private Button button;
    private Form form;


    public Interface (FabricaAbstrata fabrica){
        this.button = fabrica.createButton();
        this.form = fabrica.createForm();
    }

    public String gerarButton(){
        return this.button.create();
    }

    public String gerarForm(){
        return this.form.create();
    }
}
