package classes;

import java.util.Date;

public class Aluno extends Pessoa{
    private Date datanascimento;
    private Turma turma; //um aluno pertence a uma turma; quando é 1 precisa de private;
    
    
    public Date getDatanascimento() {
        return datanascimento;
    }


    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }


    public Turma getTurma() {
        return turma;
    }


    public void setTurma(Turma turma) {
        this.turma = turma;
    }


    void realizarAvaliacao(){
        
    }
}
