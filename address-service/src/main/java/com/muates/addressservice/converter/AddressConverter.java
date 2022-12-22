package com.muates.addressservice.converter;

import com.muates.addressservice.model.dto.request.AddressAddRequest;
import com.muates.addressservice.model.dto.response.AddressResponse;
import com.muates.addressservice.model.entity.Address;
import com.muates.memberserviceclient.model.MemberDto;

public class AddressConverter {

    public static AddressResponse convertToResponse(Address address) {
        if (address == null)
            return null;

        return AddressResponse.builder()
                .id(address.getId())
                .country(address.getCountry())
                .city(address.getCity())
                .neighbourhood(address.getNeighbourhood())
                .street(address.getStreet())
                .build();
    }

    public static AddressResponse convertToResponse(Address address, MemberDto member) {
        if (address == null || member == null)
            return null;

        return AddressResponse.builder()
                .id(address.getId())
                .country(address.getCountry())
                .city(address.getCity())
                .neighbourhood(address.getNeighbourhood())
                .street(address.getStreet())
                .member(convertToMember(member))
                .build();
    }

    public static Address convertToAddress(AddressAddRequest request) {
        if (request == null)
            return null;

        return Address.builder()
                .country(request.getCountry())
                .city(request.getCity())
                .neighbourhood(request.getNeighbourhood())
                .street(request.getStreet())
                .build();
    }

    // todo: ayrı converter oluşturulacak
    public static MemberDto convertToMember(MemberDto member) {
        if (member == null)
            return null;

        return MemberDto.builder()
                .id(member.getId())
                .firstName(member.getFirstName())
                .lastName(member.getLastName())
                .email(member.getEmail())
                .phone(member.getPhone())
                .birthOfDate(member.getBirthOfDate())
                .gender(member.getGender())
                .build();
    }
}
