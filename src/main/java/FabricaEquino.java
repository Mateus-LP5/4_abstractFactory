public class FabricaEquino implements FabricaAbstrata{

    @Override
    public DocVacinacao createDocVacinacao() {
        return new DocVacinacaoEquino();
    }

    @Override
    public Gta createGta() {
        return new GtaEquino();
    }
}
