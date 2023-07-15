package it.jobinformatica.infoVoli.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "VOLO")
public class Volo {
    @Id
    @EqualsAndHashCode.Include
    @Column(name = "ID")
    private long id;

    @Column(length = 10, name = "IDVOLO")
    private String idVolo;

    @Column(name = "GIORNOSETT")
    private LocalDateTime giornoSett;

    @ManyToOne
    @JoinColumn(name = "CITTAPART")
    private Aeroporti cittaPart;

    @Column(name = "ORAPART")
    private LocalDateTime oraPart;

    @ManyToOne
    @JoinColumn(name = "CITTAARR")
    private Aeroporti cittaArr;

    @Column(name = "ORAARR")
    private LocalDateTime oraArr;

    @ManyToOne
    @JoinColumn( name = "TIPOAEREO")
    private Aereo tipoAereo;
}