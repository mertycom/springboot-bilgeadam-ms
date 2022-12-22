package com.muates.memberserviceclient.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date birthOfDate;
    private String gender;
}
