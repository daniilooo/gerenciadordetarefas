package models;

/**
 * Classe que representa uma tarefa na lista de tarefas.
 * Contém id, descrição e status da tarefa.
 * 
 * Status possíveis:
 * - pendente
 * - andamento
 * - concluido
 * 
 * Desenvolvido como parte de um teste técnico.
 */
public class Tarefa {
    private int idTarefa;
    private String descricaoTarefa;
    private int statusTarefa;

    /**
     * Construtor da Tarefa.
     * 
     * @param id        ID da tarefa
     * @param descricao Descrição da tarefa
     * @param status    Status da tarefa (pendente, andamento, concluido)
     */
    public Tarefa(int idTarefa, String descricaoTarefa, int statusTarefa) {
        this.setIdTarefa(idTarefa);
        this.setDescricaoTarefa(descricaoTarefa);
        this.setStatusTarefa(statusTarefa);
    }

    /** @param id Define o ID da tarefa */
    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    /** @param descricao Define a descrição da tarefa */
    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    /** @param status Define o status da tarefa */
    public void setStatusTarefa(int statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    /** @return ID da tarefa */
    public int getIdTarefa() {
        return this.idTarefa;
    }

    /** @return Descrição da tarefa */
    public String getDescricaoTarefa() {
        return this.descricaoTarefa;
    }

    /** @return Status da tarefa */
    public int getStatusTarefa() {
        return this.statusTarefa;
    }

    /** @return Tarefa em um array */
    public Object[] toArray() {
        return new Object[] { this.getIdTarefa(), this.getDescricaoTarefa(), this.getStatusTarefa() };
    }

    /** @return do Objeto tarefa no formato String */
    @Override
    public String toString() {
        return "ID tarefa: " + this.getIdTarefa() + " | " + "Tarefa: " + this.getDescricaoTarefa() + " | "
                + "Status tarefa: " + this.getStatusTarefa();
    }

}