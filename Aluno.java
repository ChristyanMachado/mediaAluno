package EXERCICIO;

public class Aluno {
    private String nome;
    private int registroAcademico;
    private double prova1;
    private double prova2;
    private double projeto;

    public Aluno(String nome, int registroAcademico, double prova1, double prova2, double projeto) {
        this.nome = nome;
        this.registroAcademico = registroAcademico;
        this.prova1 = prova1;
        this.prova2 = prova2;
        this.projeto = projeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public double getProva1() {
        return prova1;
    }

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public double getProva2() {
        return prova2;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public double getProjeto() {
        return projeto;
    }

    public void setProjeto(double projeto) {
        this.projeto = projeto;
    }

    public double calcularMediaFinal() {
        return ((prova1 + prova2) * 3.5 + projeto * 3) / 10;
    }

    public String situacao() {
        double mediaFinal = calcularMediaFinal();
        return (mediaFinal >= 7) ? "APROVADO" : "EXAME";
    }

    @Override
    public String toString() {
        return String.format("R.A.: %d | Nome: %s", registroAcademico, nome);
    }
}
