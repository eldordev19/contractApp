package com.example.contractapp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    UUID id;

    String fullName;

    String role;

    String username;

    String password;
}
