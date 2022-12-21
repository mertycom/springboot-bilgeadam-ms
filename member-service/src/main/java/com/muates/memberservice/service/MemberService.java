package com.muates.memberservice.service;

import com.muates.memberservice.model.dto.request.MemberAddRequest;
import com.muates.memberservice.model.dto.request.MemberUpdateRequest;
import com.muates.memberservice.model.dto.response.MemberResponse;

public interface MemberService {
    MemberResponse addMember(MemberAddRequest request);
    MemberResponse getMember(Long id);
    MemberResponse updateMember(Long id, MemberUpdateRequest request);
    String deleteMember(Long id);
}
