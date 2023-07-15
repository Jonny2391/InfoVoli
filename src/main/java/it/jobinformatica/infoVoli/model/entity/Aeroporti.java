package it.jobinformatica.infoVoli.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "AEROPORTI")
public class Aeroporti {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 20, name = "CITTA")
    private String citta;

    @Column(length = 3, name = "NAZIONE")
    private String nazione;

    @Column(name = "NUMPISTE")
    private long numPiste;
}
