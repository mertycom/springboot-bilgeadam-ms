package com.muates.memberservice.converter;

import com.muates.memberservice.model.dto.request.MemberAddRequest;
import com.muates.memberservice.model.dto.response.MemberResponse;
import com.muates.memberservice.model.entity.Member;
import com.muates.memberservice.model.enums.Gender;

public class MemberConverter {

    public static Member convertToMember(MemberAddRequest request) {
        if (request == null)
            return null;

        return Member.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .birthOfDate(request.getBirthOfDate())
                .gender(convertToGender(request.getGender()))
                .build();
    }

    public static MemberResponse convertToResponse(Member member) {
        if (member == null)
            return null;

        return MemberResponse.builder()
                .id(member.getId())
                .firstName(member.getFirstName())
                .lastName(member.getLastName())
                .email(member.getEmail())
                .phone(member.getPhone())
                .birthOfDate(member.getBirthOfDate())
                .gender(member.getGender().toString())
                .build();
    }

    private static Gender convertToGender(String gender) {
        if (gender == null)
            return null;

        switch (gender) {
            case "MALE":
                return Gender.MALE;
            case "FEMALE":
                return Gender.FEMALE;
            default:
                return null;
        }
    }
}
