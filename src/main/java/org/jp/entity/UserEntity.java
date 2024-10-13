package org.jp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Data
@Entity
@Table // Added a table name for clarity
public class UserEntity {
   @Column
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Changed to lowercase 'id' for convention
    
    @Column // Added nullable constraint for required fields
    private String firstName;

    @Column // Added nullable constraint for required fields
    private String lastName;

    @Column // Added unique constraint for phone number
    private Long phoneNo;

    @Column
    private Long roleId;

    @Column
    private Boolean status;

    @Column // Added unique constraint for email
    private String userEmail;
    private String password;

}
