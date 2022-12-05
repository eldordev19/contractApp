package com.example.contractapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@PackagePrivate
@Entity
public class Contract {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    UUID id;

    @ManyToOne
    Consumer consumer;

    @ManyToOne
    Payer payer;

    String contractNumber;

    String index;

    @ManyToOne
    Specification contractSpecification;

    @ManyToOne
    ServiceType serviceType;

    @ManyToOne
    Status documentStatus;

    LocalDate contractDate;

    LocalDate startDate;

    LocalDate expirationDate;

    Integer hoursCount;

    LocalDate terminatedDate;

    @ManyToOne
    TerminateReason terminateReason;

    Double paymentPercentage;

    Double penaltyPercentage;

    Double percentInstallation;

    Double prepaymentPercentage;

    LocalDate prepaymentDate;

    Double preCalculationPercentage;

    Double penyaPercentage;

    Double maxRetentionPercentage;

    Double lineCost;

    LocalDate additionalAgreementDate;
}
