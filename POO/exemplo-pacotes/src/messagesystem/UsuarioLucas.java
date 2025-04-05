public class UsuarioLucas {
    public static void main(String[] args) {
      ServicoMensagemInstantanea smi = null;
      //NÃO SE SABE QUAL APP, MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
        String appEscolhido = "msn";
        
        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else {
            System.out.println("App não encontrado");
        }
        
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}