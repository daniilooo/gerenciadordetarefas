package models;

public class Tarefa {
    private int idTarefa;
    private String descricaoTarefa;
    private int statusTarefa;

    public Tarefa(int idTarefa, String descricaoTarefa, int statusTarefa) {
        this.setIdTarefa(idTarefa);
        this.setDescricaoTarefa(descricaoTarefa);
        this.setStatusTarefa(statusTarefa);
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public void setStatusTarefa(int statusTarefa) {
        this.statusTarefa = statusTarefa;
    }

    public int getIdTarefa() {
        return this.idTarefa;
    }

    public String getDescricaoTarefa() {
        return this.descricaoTarefa;
    }

    public int getStatusTarefa() {
        return this.statusTarefa;
    }

    @Override
    public String toString() {
        return "ID tarefa: " + this.getIdTarefa() + " | " + "Tarefa: " + this.getDescricaoTarefa() + " | "
                + "Status tarefa: " + this.getStatusTarefa();
    }

}