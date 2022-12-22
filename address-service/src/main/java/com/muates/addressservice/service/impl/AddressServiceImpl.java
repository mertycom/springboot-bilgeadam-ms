package com.muates.addressservice.service.impl;

import com.muates.addressservice.converter.AddressConverter;
import com.muates.addressservice.model.dto.request.AddressAddRequest;
import com.muates.addressservice.model.dto.request.AddressUpdateRequest;
import com.muates.addressservice.model.dto.response.AddressResponse;
import com.muates.addressservice.model.entity.Address;
import com.muates.addressservice.repository.AddressRepository;
import com.muates.addressservice.service.AddressService;
import com.muates.memberserviceclient.client.MemberServiceClient;
import com.muates.memberserviceclient.model.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final MemberServiceClient memberServiceClient;

    @Override
    public AddressResponse addAddress(Long memberId, AddressAddRequest request) {
        boolean isExist = memberServiceClient.existMember(memberId);

        if (!isExist)
            throw new RuntimeException();

        Address address = AddressConverter.convertToAddress(request);
        address.setMemberId(memberId);

        return AddressConverter.convertToResponse(addressRepository.save(address));
    }

    @Override
    public AddressResponse getAddress(Long addressId) {
        Optional<Address> address = addressRepository.findById(addressId);

        if (address.isEmpty())
            throw new RuntimeException();

        MemberDto member = memberServiceClient.getMember(address.get().getMemberId());

        return AddressConverter.convertToResponse(address.get(), member);
    }

    @Override
    public AddressResponse updateAddress(Long addressId, AddressUpdateRequest request) {
        return null;
    }

    @Override
    public String deleteAddress(Long addressId) {
        return null;
    }
}
