package it.jobinformatica.infoVoli.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class RecordDati {
    public static final int NUM_CAMPI = 5;

    private String idVolo;
    private LocalDateTime giornoSett;
    private String cittaPart;
    private String tipoAereo;
    private long numPasseggeri;

    public Object[] ritornaRiga(){
        return new Object[]{idVolo, giornoSett.toLocalDate().toString(), cittaPart, tipoAereo, numPasseggeri};
    }

    public static Object[] ritornaIntestazione() {
        return new Object[]{"Id volo","Giorno settimana","Citta di partenza","Tipo aereo","Numero passeggeri"};
    }
}
