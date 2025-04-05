package equipamento.estabelecimento;

import equipamento.equipamento.impressora.Impressora;
import equipamento.impressora.Deskjet;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
        impressora.imprimir();
    }
}
