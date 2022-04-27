import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AnimalTest {

    @Test
    void deveEmitirDocVacinacaoBovino() {
        FabricaAbstrata fabrica = new FabricaBovino();
        Animal animal = new Animal(fabrica);
        assertEquals("Emitido documento de vacinação de bovino.", animal.emitirDocVacinacao());
    }

    @Test
    void deveEmitirDocVacinacaoEquino() {
        FabricaAbstrata fabrica = new FabricaEquino();
        Animal animal = new Animal(fabrica);
        assertEquals("Emitido documento de vacinação de equino.",animal.emitirDocVacinacao());
    }

    @Test
    void deveEmitirGtaBovino() {
        FabricaAbstrata fabrica = new FabricaBovino();
        Animal animal = new Animal(fabrica);
        assertEquals("Emitido GTA de bovino.", animal.emitirGta());
    }

    @Test
    void deveEmitirGtaEquino() {
        FabricaAbstrata fabrica = new FabricaEquino();
        Animal animal = new Animal(fabrica);
        assertEquals("Emitido GTA de equino.", animal.emitirGta());
    }

}