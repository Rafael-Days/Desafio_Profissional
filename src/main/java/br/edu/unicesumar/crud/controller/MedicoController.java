package br.edu.unicesumar.crud.controller;

import br.edu.unicesumar.crud.model.domain.Medico;
import br.edu.unicesumar.crud.model.domain.Paciente;
import br.edu.unicesumar.crud.model.repository.MedicoRepository;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> all(){
        return medicoRepository.findAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long idMedico, @RequestBody Medico editMedico){
        Medico medico = new Medico(
                editMedico.getNome(),
                editMedico.getIdade(),
                idMedico,
                editMedico.getEspecializacao());

    }
}
