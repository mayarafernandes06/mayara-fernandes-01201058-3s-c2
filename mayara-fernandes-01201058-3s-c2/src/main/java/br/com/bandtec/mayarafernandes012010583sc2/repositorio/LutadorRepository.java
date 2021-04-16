package br.com.bandtec.mayarafernandes012010583sc2.repositorio;

import br.com.bandtec.mayarafernandes012010583sc2.dominio.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;
import java.util.List;

public interface LutadorRepository extends JpaRepository<Lutador, Integer> {


    @Query("select l from Lutador l order by forcaGolpe")
    List<Lutador> findAllOrderByForcaGolpe();



    @Transactional
    @Modifying
    @Query("update Lutador l set l.vida = ?1 where l.id is ?2")
    void alterarVidaJogador(Double vida, Integer id);



}
