package com.simplon.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "patient")
public class Patient {

    @Id
    @Column(name = "patient_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int patientId;

    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;

    @Column(name = "date_of_birth", nullable = true)
    private Date dateOfBirth;

    @Column(name = "address", length = 50, nullable = false)
    private String address;

    @Column(name = "phone_number", length = 20, nullable = false)
    private String phoneNumber;

    @Column(name = "analysis_history", length = 50, nullable = false)
    private String analysisHistory;

    @OneToMany(mappedBy = "sampleId")
    @ToString.Exclude
    private List<Sample> list_of_samples;


}