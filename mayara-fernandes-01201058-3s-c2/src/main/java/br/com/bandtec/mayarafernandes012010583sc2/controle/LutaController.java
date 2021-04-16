package br.com.bandtec.mayarafernandes012010583sc2.controle;

import br.com.bandtec.mayarafernandes012010583sc2.dominio.Lutador;
import br.com.bandtec.mayarafernandes012010583sc2.repositorio.LutadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/lutas")
public class LutaController {

    @Autowired
private LutadorRepository repository;

    @PostMapping("lutadores")
    public ResponseEntity postLutadores (@RequestBody @Valid Lutador novoLutador) {

        novoLutador.setConcentracoesRealizadas(0);
        novoLutador.setVida(100.0);
        novoLutador.setVivo(true);

        repository.save(novoLutador);
           return ResponseEntity.status(201).build();
    }

    @GetMapping("/lutadores")
    public ResponseEntity getLutadores() {
        List<Lutador> getLutadores = repository.findAllOrderByForcaGolpe();

        if(getLutadores.isEmpty()) {
            return ResponseEntity.status(204).build();
        } else {
            return ResponseEntity.status(200).body(repository.findAll());
        }

    }


    @GetMapping("/lutadores/{id}/concentrar")
    public ResponseEntity getLutadoresConcentrar(@PathVariable int id) {
        Boolean concentracoesMaiorRealizadas = repository.existsByIdAndConcentracoesRealizadasLessThan(id,);

        if(concentracoesMaiorRealizadas){


        }
    }

    @PostMapping("/lutadores/golpe")
    public ResponseEntity golpe(RequestBody GolpeRequest golpe) {
    if(repository.existsById(golpe.))
    }

}
