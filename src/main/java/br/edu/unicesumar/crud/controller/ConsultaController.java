package br.edu.unicesumar.crud.controller;

import br.edu.unicesumar.crud.model.domain.Consulta;
import br.edu.unicesumar.crud.model.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private ConsultaRepository consultaRepository;

    @GetMapping
    public List<Consulta> all(){
        return consultaRepository.findAll();
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long idConsulta, @RequestBody Consulta editConsulta){

        Consulta consulta = new Consulta(idConsulta,
                editConsulta.getPaciente(),
                editConsulta.getMedico());

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long idConsulta){
        long l = idConsulta.longValue();
    }

    @PostMapping
    public Consulta create(@RequestBody Consulta consultaNovo){
        return consultaNovo.save(consultaNovo);
    }

}
