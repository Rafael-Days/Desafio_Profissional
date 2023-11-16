package br.edu.unicesumar.crud.controller;

import br.edu.unicesumar.crud.model.domain.Paciente;
import br.edu.unicesumar.crud.model.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public List<Paciente> all(){
        return pacienteRepository.findAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long idPaciente, @RequestBody Paciente editPaciente){

        Paciente paciente = new Paciente(idPaciente,
                editPaciente.getNome(),
                editPaciente.getIdade());

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long idPaciente){
        long l = idPaciente.longValue();
    }

    @PostMapping
    public Paciente create(@RequestBody Paciente pacienteNovo){
        return pacienteNovo.save(pacienteNovo);
    }
}
