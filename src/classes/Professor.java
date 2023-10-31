package classes;

import java.util.ArrayList;

public class Professor extends Pessoa{

    private String formacaoAcademica;
    private Double salario;
    private ArrayList<Disciplina> disciplinas; //um professor pode ter várias didsciplinas
    private ArrayList<Turma> turmas; //um professor pode ter várias turmas


    public Professor(){
        disciplinas = new ArrayList<Disciplina>();//inicia uma lista de disciplina
    }
    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void addDiscipla(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void excluirDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
    public int quantidadeDisciplinas(){
       return disciplinas.size();
    }
    public Disciplina getDisciplina(int posicao){
        return disciplinas.get(posicao);
    }
















    void aplicarAvaliacao(){
        
    }
}
