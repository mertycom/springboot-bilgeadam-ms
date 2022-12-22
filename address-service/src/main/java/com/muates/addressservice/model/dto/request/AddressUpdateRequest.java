package com.muates.addressservice.model.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressUpdateRequest {

    private String country;
    private String city;
    private String neighbourhood;
    private String street;
}
