package classes;

import java.util.ArrayList;

public class Turma {
    private String sigla;
    private Integer ano;
    private ArrayList<Aluno> alunos; //uma turma pode ter vários alunos
    private ArrayList<Professor> professores; // uma turma pode ter vários professores
    private ArrayList<Disciplina> disciplinas;//uma turma pode ter várias disciplinas
    
    //construtor
    public Turma(){
        alunos = new ArrayList<Aluno>();//inicializando lista de alunos no construtor

    }

    //encapsulamento - getters e setters
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    //metodos para listas; recebendo o objeto aluno
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void excluir(Aluno aluno){
        alunos.remove(aluno);
    }
    public int quantidadeAlunos(){
        return alunos.size();
    }
    public Aluno getAluno(int posicao){//retorna um aluno
        return alunos.get(posicao);
    }
}
