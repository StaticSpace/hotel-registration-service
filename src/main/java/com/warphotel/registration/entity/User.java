package com.warphotel.registration.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private AccessToken accessToken;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private RefreshToken refreshToken;

    @Column(name = "user_email", nullable = false)
    private String email;

    @Column(name = "user_password", nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "create_datetime")
    private ZonedDateTime createDateTime;

    @Column(name = "blocking_datetime")
    private ZonedDateTime blockingDateTime;

    @Column(name = "delete_time")
    private ZonedDateTime deleteDateTime;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "sex")
    private String sex;

    @Column(name = "product_description")
    private String description;

//    @Column(name = "user_is_enabled") // считаем что аккаунт по умолчанию активирован если не заблокирован или не удлён
//    private Boolean isEnabled;

    @Column(name = "user_is_blocked")
    private Boolean isBlocked;

    @Column(name = "user_is_Deleted")
    private Boolean isDeleted;
}
