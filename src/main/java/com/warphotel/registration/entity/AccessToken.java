package com.warphotel.registration.entity;

import lombok.*;

import javax.persistence.*;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "access_tokens")
public class AccessToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "access_token")
    private String token;

    @Column(name = "creating_time")
    private ZonedDateTime creatingTime;

    @Column(name = "life_duration")
    private Duration lifeDuration;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private User user;
}

