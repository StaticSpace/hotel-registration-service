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
@Table(name = "user_roles")
public class Role {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "product_name", nullable = false)
    private String name;

    @Column(name = "product_description")
    private String description;

    @Column(name = "creating_datetime", nullable = false)
    private ZonedDateTime creatingTime;

    @Column(name = "blocking_datetime")
    private ZonedDateTime blockingTime;

    @Column(name = "delete_time")
    private ZonedDateTime deleteTime;

}
