package br.com.fatec.processoseletivo.controller;

import br.com.fatec.processoseletivo.model.Tarefa;
import br.com.fatec.processoseletivo.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    public Tarefa cadastrar(@RequestBody Tarefa novaTarefa) {
        return tarefaService.cadastrar(novaTarefa);
    }

    @GetMapping
    public List<Tarefa> listarTodas() {
        return tarefaService.listarTodas();
    }

    @GetMapping("/{indice}")
    public Tarefa buscarPorIndice(@PathVariable int indice) {
        Optional<Tarefa> tarefa = tarefaService.buscarPorIndice(indice);
        return tarefa.orElse(null);
    }

    @PutMapping("/{indice}")
    public Tarefa atualizar(@PathVariable int indice, @RequestBody Tarefa tarefaAtualizada) {
        return tarefaService.atualizar(indice, tarefaAtualizada);
    }

    @DeleteMapping("/{indice}")
    public String deletar(@PathVariable int indice) {
        boolean removido = tarefaService.deletar(indice);
        if (removido) {
            return "Tarefa removida com sucesso!";
        }
        return "Tarefa não encontrada.";
    }
}
