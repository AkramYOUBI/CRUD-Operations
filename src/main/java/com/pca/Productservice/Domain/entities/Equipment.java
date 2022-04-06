package com.pca.Productservice.Domain.entities;

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

    @ManyToOne @JoinColumn(name="airport_id", nullable=false)
    private Airport airport;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(
                    name = "numFacture",
                    column = @Column(name = "document_num_facture")),
            @AttributeOverride(
                    name = "dateFacture",
                    column = @Column(name = "document_date_facture")
            ),
            @AttributeOverride(
                    name = "titreImportation",
                    column = @Column(name = "document_titre_importation")
            ),
            @AttributeOverride(
                    name = "dateImportation",
                    column = @Column(name = "document_date_importation")
            ),

    })
    private Document document;


    @PrePersist
    protected void onPrePersist() {
        if(this.getId() == null){
            this.setId(new CommonId(Prefix.EQUIPMENT));
        }
        this.setCreatedAt(new Date());
    }
}
