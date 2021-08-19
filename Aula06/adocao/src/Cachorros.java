import java.util.Calendar;
import java.util.Date;

public class Cachorros {
    private String raca;
    private Date nascimento;
    private Double peso;
    private boolean chip;
    private boolean ferimento;
    private String nome;

    public Cachorros(String raca, Date nascimento, Double peso, boolean chip, boolean ferimento, String nome) {
        this.raca = raca;
        this.nascimento = nascimento;
        this.peso = peso;
        this.chip = chip;
        this.ferimento = ferimento;
        this.nome = nome;
    }


    public int getIdade() {
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(this.nascimento);
        Calendar dataAtual = Calendar.getInstance();

        Integer diferencaMes = dataAtual.get(Calendar.MONTH) - dataNascimento.get(Calendar.MONTH);
        Integer diferencaDia = dataAtual.get(Calendar.DAY_OF_MONTH) - dataNascimento.get(Calendar.DAY_OF_MONTH);
        Integer idade = (dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR));

        if (diferencaMes < 0 || (diferencaMes == 0 && diferencaDia < 0)) {
            idade--;
        }

        return idade;
    }

    public boolean adocao() {
        if (this.ferimento == false && this.peso >= 5) {
            return true;

        } else {
            return false;
        }
    }
    public boolean animalRastreavel(){
        if(this.chip == true){
            return true;
        } else {
            return false;
        }
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isFerimento() {
        return ferimento;
    }

    public void setFerimento(boolean ferimento) {
        this.ferimento = ferimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}





