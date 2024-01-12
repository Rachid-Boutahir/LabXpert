package com.simplon.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "analysis_type")
public class AnalysisType {

    @Id
    @Column(name = "analysis_type_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int analysisTypeId;

    @Column(name = "label")
    private String label;

    @Column(name = "description")
    private String description;

}
