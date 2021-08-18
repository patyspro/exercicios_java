public class Main {

    public static void main(String[] args) {

        UsuarioJogo patricia= new UsuarioJogo("Patricia","patyspro");


        System.out.println(" O nickname"+" "+ patricia.getNickname()+ " "+ " Começou com a pontuação:"+ ""+patricia.getPontuacao());
        patricia.subirNivel();
        patricia.bonificar(3);
        patricia.pontuar();

        System.out.println( "Usuário:"+" " + patricia.getNome()+" "+ "Pontuou:"+  " " + patricia.getPontuacao() +" " + "E está no nível:"+ patricia.getNivel());
    }
}
