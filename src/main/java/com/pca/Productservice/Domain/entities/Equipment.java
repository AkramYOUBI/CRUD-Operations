package com.pca.Productservice.Domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pca.Productservice.Domain.support.*;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "equipmentdb")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Equipment extends BaseEntity<CommonId> {
    private String serialNumber;
    private String assetTag;
    private String nodeName;
    private Integer quantity;
    private String comment;

    @Enumerated(EnumType.STRING)
    private Model model;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private Project project;
    @Enumerated(EnumType.STRING)
    private Site site;
    @Enumerated(EnumType.STRING)
    private State state;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(
                    name = "numFacture",
                    column = @Column(name = "num_facture")
            ),
            @AttributeOverride(
                    name = "dateFacture",
                    column = @Column(name = "date_facture")
            ),
            @AttributeOverride(
                    name = "titreImportation",
                    column = @Column(name = "titre_importation")
            ),
            @AttributeOverride(
                    name = "dateImportation",
                    column = @Column(name = "date_importation")
            ),

    })
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;
    @ManyToOne
    @JoinColumn(name = "terminal_id")
    private Terminal terminal;
    @ManyToOne
    @JoinColumn(name = "zone_id")
    private Zone zone;
    @ManyToOne
    @JoinColumn(name = "counter_id")
    private Counter counter;


    @PrePersist
    protected void onPrePersist() {
        if(this.getId() == null){
            this.setId(new CommonId(Prefix.EQUIPMENT));
        }
        this.setCreatedAt(new Date());
    }
}
