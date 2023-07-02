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
@Table(name = "refresh_token")
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "refresh_token")
    private String token;

    @Column(name = "creating_time")
    private ZonedDateTime creatingTime;

    @Column(name = "life_duration")
    private Duration lifeDuration;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    private User user;
}
