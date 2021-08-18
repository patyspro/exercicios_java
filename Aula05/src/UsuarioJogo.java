public class UsuarioJogo {
     private String nome;
     private String nickname;
     private int pontuacao=0;
     private int nivel=1;

    public UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }


    public void pontuar(){
        pontuacao=pontuacao +1;
    }

    public void bonificar(int bonus){
        pontuacao=pontuacao+bonus;
    }

    public void subirNivel(){
        nivel++;
    }

    public String getNome() {
        return nome;
    }

    public String getNickname() {
        return nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


}

