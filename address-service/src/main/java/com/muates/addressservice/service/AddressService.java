package com.muates.addressservice.service;

import com.muates.addressservice.model.dto.request.AddressAddRequest;
import com.muates.addressservice.model.dto.request.AddressUpdateRequest;
import com.muates.addressservice.model.dto.response.AddressResponse;

public interface AddressService {
    AddressResponse addAddress(Long memberId, AddressAddRequest request);
    AddressResponse getAddress(Long addressId);
    AddressResponse updateAddress(Long addressId, AddressUpdateRequest request);
    String deleteAddress(Long addressId);
}
