package org.jp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users") // Added a table name for clarity
@Data
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Changed to lowercase 'id' for convention
    
    @Column(nullable = false) // Added nullable constraint for required fields
    private String firstName;

    @Column(nullable = false) // Added nullable constraint for required fields
    private String lastName;

    @Column(nullable = false, unique = true) // Added unique constraint for phone number
    private Long phoneNo;

    @Column(nullable = false)
    private Long roleId;

    @Column(nullable = false)
    private Boolean status;

    @Column(nullable = false, unique = true) // Added unique constraint for email
    private String userEmail;

    @OneToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id", insertable = false, updatable = false) // Set insertable and updatable to false
    private UserRole userRole;
}
