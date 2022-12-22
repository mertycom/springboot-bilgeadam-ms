package com.muates.addressservice.model.dto.response;

import com.muates.memberserviceclient.model.MemberDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressResponse {

    private Long id;
    private String country;
    private String city;
    private String neighbourhood;
    private String street;
    private MemberDto member;
}
