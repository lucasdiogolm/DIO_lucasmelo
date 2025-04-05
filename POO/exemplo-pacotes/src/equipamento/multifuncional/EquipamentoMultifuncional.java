package equipamento.multifuncional;

import equipamento.equipamento.copiadora.Copiadora;
import equipamento.equipamento.digitalizadora.Digitalizadora;
import equipamento.equipamento.impressora.Impressora;

public class EquipamentoMultifuncional implements Digitalizadora, Impressora, Copiadora {
    public void digitalizar(){
        System.out.println("Digitalizando com Equipamento Multifuncional...");
    }
    public void imprimir(){
        System.out.println("Imprimindo com Equipamento Multifuncional...");
    }
    public void copiar(){
        System.out.println("Copiando com Equipamento Multifuncional...");
    }
    
}
