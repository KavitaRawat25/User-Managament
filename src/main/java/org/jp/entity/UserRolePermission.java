package org.jp.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user_role_permissions") // Added a table name for clarity
@Data
public class UserRolePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private boolean canRead;

    @Column(nullable = false)
    private boolean canWrite;

    @Column(nullable = false)
    private boolean canUpdate;

    @Column(nullable = false)
    private boolean canDelete;

    @Column(nullable = false)
    private boolean isDefaultLandingPage;

    @Column(nullable = false)
    private int moduleId;

    @Column(nullable = false)
    private int subModulesIds;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private UserRole userRole;
}
