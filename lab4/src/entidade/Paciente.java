package entidade;

public class Paciente implements Comparable<Paciente> {
    private String nome;
    private int idade;
    private boolean vacinado;

    public Paciente(String nome, int idade, boolean vacinado) {
        this.idade = idade;
        this.nome = nome;
        this.vacinado = vacinado;
    }

    public void Vacinar() {
        this.vacinado = true;
    }

    @Override
    public int compareTo(Paciente outroPaciente) {
        if (this.idade > outroPaciente.idade) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Vacinado: " + (vacinado ? "Vacinado" : "Não vacinado"+"\n");
    }
}
