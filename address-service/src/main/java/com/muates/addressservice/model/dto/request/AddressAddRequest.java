package com.muates.addressservice.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressAddRequest {

    private String country;
    private String city;
    private String neighbourhood;
    private String street;
}
