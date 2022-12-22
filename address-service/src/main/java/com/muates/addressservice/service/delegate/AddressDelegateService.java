package com.muates.addressservice.service.delegate;

import com.muates.memberserviceclient.model.MemberDto;

public interface AddressDelegateService {
    MemberDto getMember(Long memberId);
    boolean isExistMember(Long memberId);
}
