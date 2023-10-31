package classes;

import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private Integer cargaHoraria;
    private ArrayList<Professor> professores; //uma disciplina pode ter vários professores
    private ArrayList<Turma> turmas;//uma disciplina pode ter várias turmas


    public Disciplina() {
        professores = new ArrayList<Professor>();
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Integer cargaHoraria) {
        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        }   
    }



    public void addProfessor(Professor professor){
        professores.add(professor);
    }
    public void excluirProfessor(Professor Professor){
        professores.remove(Professor);
    }
    public int quantidadeProfessors(){
       return professores.size();
    }
    public Professor getProfessor(int posicao){
        return professores.get(posicao);
    }

}
