public class Animal {

    private DocVacinacao docVacinacao;

    //O documento oficial para transporte de animal no Brasil é a Guia de Trânsito Animal (GTA).
    private Gta gta;

    public  Animal (FabricaAbstrata fabrica) {
        this.docVacinacao = fabrica.createDocVacinacao();
        this.gta = fabrica.createGta();
    }

    public String emitirDocVacinacao() {
        return this.docVacinacao.emitir();
    }

    public String emitirGta() {
        return this.gta.emitir();
    }
}
