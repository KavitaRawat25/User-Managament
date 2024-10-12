package org.jp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "user_roles") // Added a table name for clarity
@Data
@NoArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    @OneToMany(mappedBy = "userRole", cascade = CascadeType.ALL)
    private List<UserRolePermission> rolePermissions; // Changed variable name for clarity
}
