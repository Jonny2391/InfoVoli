package it.jobinformatica.infoVoli;

import it.jobinformatica.infoVoli.model.RecordDati;
import it.jobinformatica.infoVoli.repository.VoloRepository;
import it.jobinformatica.infoVoli.utils.BeanUtil;
import it.jobinformatica.infoVoli.utils.InfoOutput;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@NoArgsConstructor
@Component
@Slf4j
public class Esecuzione {
    private VoloRepository voloRepository;

    ArrayList<RecordDati> records = null;
    Object[][] dati = null;

    public void start(String citta) {
        this.voloRepository = BeanUtil.getBean(VoloRepository.class);

        //Lettura dati da DB
        log.info("Inizio lettura db");
        records = voloRepository.voliDa(citta);

        //Trasformazione dati per scrittura in excel
        log.info("Trasformazione dati");
        dati = new Object[records.size() + 2][RecordDati.NUM_CAMPI];
        dati[0] = RecordDati.ritornaIntestazione();

        int cont = 2;
        for(RecordDati r : records){
            dati[cont++] = r.ritornaRiga();
        }

        //Scrittura su excel
        log.info("Scrittura excel");
        InfoOutput.scriviExcel(dati,"nome_file","Nome foglio");
    }
}
