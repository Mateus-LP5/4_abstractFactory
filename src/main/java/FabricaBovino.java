public class FabricaBovino implements FabricaAbstrata{


    @Override
    public DocVacinacao createDocVacinacao() {
        return new DocVacinacaoBovino();
    }

    @Override
    public Gta createGta() {
        return new GtaBovino();
    }
}
