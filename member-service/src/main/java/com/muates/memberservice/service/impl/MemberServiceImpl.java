package com.muates.memberservice.service.impl;

import com.muates.memberservice.converter.MemberConverter;
import com.muates.memberservice.model.dto.request.MemberAddRequest;
import com.muates.memberservice.model.dto.request.MemberUpdateRequest;
import com.muates.memberservice.model.dto.response.MemberResponse;
import com.muates.memberservice.model.entity.Member;
import com.muates.memberservice.repository.MemberRepository;
import com.muates.memberservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public MemberResponse addMember(MemberAddRequest request) {
        Member member = MemberConverter.convertToMember(request);
        return MemberConverter.convertToResponse(memberRepository.save(member));
    }

    @Override
    public MemberResponse getMember(Long id) {
        Optional<Member> member = memberRepository.findById(id);
        if (member.isEmpty())
            throw new RuntimeException();

        return MemberConverter.convertToResponse(member.get());
    }

    @Override
    public MemberResponse updateMember(Long id, MemberUpdateRequest request) {
        Optional<Member> member = memberRepository.findById(id);
        if (member.isEmpty())
            throw new RuntimeException();

        checkUpdate(member.get(), request);

        return MemberConverter.convertToResponse(memberRepository.save(member.get()));
    }

    @Override
    public String deleteMember(Long id) {
        memberRepository.deleteById(id);
        return "Silme işlemi başarılı!";
    }

    @Override
    public boolean isExistMember(Long id) {
        return memberRepository.existsById(id);
    }

    private void checkUpdate(Member member, MemberUpdateRequest request) {
        if (request.getLastName() != null) member.setLastName(request.getLastName());
        if (request.getPhone() != null) member.setPhone(request.getPhone());
    }
}
