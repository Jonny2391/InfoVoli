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
@Table(name = "AEREO")
public class Aereo {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 6, name = "TIPOAEREO")
    private String tipoAereo;

    @Column(name = "NUMPASSEGGERI")
    private long numPasseggeri;

    @Column(name = "QNTMERCI")
    private long qntMerci;
}