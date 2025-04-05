package equipamento.impressora;

import equipamento.equipamento.impressora.Impressora;

public class Deskjet implements Impressora {
    @Override
    public void imprimir(){
        System.out.println("Imprimindo com Deskjet...");
    }

}
