package com.simplon.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;


import com.simplon.enums.Status;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "sample")
public class Sample {

    @Id
    @Column(name = "sample_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int sampleId;

    @Column(name = "collection_date")
    private Date collectionDate;

    @Column(name = "status")
    private Status status;
}
