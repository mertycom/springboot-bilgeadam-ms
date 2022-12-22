package com.muates.addressservice.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "neighbourhood")
    private String neighbourhood;

    @Column(name = "street")
    private String street;

    @Column(name = "member_id")
    private Long memberId;
}
