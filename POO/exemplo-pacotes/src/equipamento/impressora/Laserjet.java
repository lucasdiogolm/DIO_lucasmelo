package equipamento.impressora;

import equipamento.equipamento.impressora.Impressora;

public class Laserjet implements Impressora {
    @Override
    public void imprimir(){
        System.out.println("Imprimindo com Laserjet...");
    }

}
