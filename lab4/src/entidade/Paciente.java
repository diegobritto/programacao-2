package entidade;

public  class Paciente implements Comparable <Paciente>{
    private String nome;
    private int idade;
    private boolean vacinado;

    public Paciente(String nome, int idade, boolean vacinado){
        this.idade = idade;
        this.nome = nome;
        this.vacinado = vacinado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public boolean  getVacinado() {
        return this.vacinado;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Idade: " + idade +"\n"+
                "Vacinado=" + vacinado;
    }

    @Override
    public int compareTo(Paciente outroPaciente) {
        if (this.idade < outroPaciente.idade) {
            return -1;
        }
        return 0;
    }
}
