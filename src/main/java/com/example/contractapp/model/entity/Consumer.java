package com.example.contractapp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@PackagePrivate
public class Consumer {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    UUID    id;

    String nameOrganization; // руководящая организация

    String shortName;

    String fullName;

    String positionOfManager; // должность руководителя

    String fullNameOfManager;

    String positionOfAccountant;

    String fullNameOfAccountant;

    String phoneNumber;

    String email;

    String fax;

    @ManyToOne
    PayType payType;

    @ManyToOne
    Condition condition; // состояние

    @ManyToOne
    StatusConsumer statusConsumer;

    @ManyToOne
    Belonging belonging; // принадлежность

    @ManyToOne
    Activity kindOfActivity; // вид деятельности

    @ManyToOne
    OrganizationalAndLegalActivities organizationalAndLegalActivities; // организационно-правовая деятельность

    @ManyToOne
    Share share; //долевое участие

    @ManyToOne
    LastMile lastMile; // последняя миля

    @ManyToOne
    BankDetails bankDetails; // банковские реквизиты
}
