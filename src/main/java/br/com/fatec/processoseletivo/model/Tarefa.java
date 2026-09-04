package br.com.fatec.processoseletivo.model;

public class Tarefa {
    private String titulo;
    private String descricao;
    private int prioridade;

        public Tarefa() {
        }

        public Tarefa(String titulo, String descricao, int prioridade) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.prioridade = prioridade;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public int getPrioridade() {
            return prioridade;
        }

        public void setPrioridade(int prioridade) {
            this.prioridade = prioridade;
        }
}
