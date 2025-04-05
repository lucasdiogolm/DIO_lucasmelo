import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"LUCAS","ALINE","LARISSA","JUNIOR","GILBERTO"};
        for(String candidato: candidatos){
            
        }


        System.out.println("Imprimindo a lista de candidatos, informando o indice do elemento");
        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número "+indice+" é "+candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação");
        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi: "+candidato);
        }

    }

    static void selecaoCandidatos(){
        //Array com a lista de candidatos
        String [] candidatos = {"LUCAS","ALINE","LARISSA","JUNIOR","GILBERTO","JULIA","JONATA","CLAUDIO","FAGNER","JOELMA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Salário pretendido pelo candidato "+candidato+": "+salarioPretendido);
            if(salarioBase >= salarioPretendido){
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2000);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
    
}
