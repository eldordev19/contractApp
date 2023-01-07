package com.example.contractapp.model;

import com.example.contractapp.model.entity.*;
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

@AllArgsConstructor
@NoArgsConstructor
@Data
@PackagePrivate
@Entity(name = "loading_types")
public class LoadingType {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    UUID id;

    @ManyToOne
    LocalizationType localizationType;

    @ManyToOne
    SignalType signalType;

    @ManyToOne
    UseType useType;

    @ManyToOne
    Power power;  // мощность

    @ManyToOne
    Fast fast;  // скорость

    @ManyToOne
    Distance distance;

    @ManyToOne
    CurrencyType currencyType;

    @ManyToOne
    Belonging belonging; // принадлежность

    @ManyToOne
    PayType payType;

    @ManyToOne
    Activity kindOfActivity; // вид деятельности

    @ManyToOne
    OrganizationalAndLegalActivities organizationalAndLegalActivities; // организационно-правовая деятельность


    @ManyToOne
    TrackView trackView; // вид трассы

    @ManyToOne
    Share share; //долевое участие


}
