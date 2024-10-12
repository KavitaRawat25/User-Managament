package org.jp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table // Added a table name for clarity
@Data
@NoArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) // Added unique constraint for role name
    private String roleName;

    @Column(nullable = false)
    private String roleDescription;

    @Column(nullable = false)
    private boolean canAccessMobileRequest;

    @Column(nullable = false)
    private boolean canAccessWebRequest;

    @Column(nullable = false)
    private int status;

}
