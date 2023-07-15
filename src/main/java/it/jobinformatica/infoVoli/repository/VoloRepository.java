package it.jobinformatica.infoVoli.repository;

import it.jobinformatica.infoVoli.model.RecordDati;
import it.jobinformatica.infoVoli.model.entity.Volo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface VoloRepository extends JpaRepository<Volo,Long> {
    @Query(value = "SELECT new it.jobinformatica.infoVoli.model.RecordDati( " +
            "v.idVolo, " +
            "v.giornoSett, " +
            "v.cittaPart.citta, " +
            "v.tipoAereo.tipoAereo, " +
            "v.tipoAereo.numPasseggeri) " +
            "FROM Volo v " +
            "WHERE v.cittaPart.citta = :citta " +
            "ORDER BY v.idVolo")
    ArrayList<RecordDati> voliDa(String citta);
}
