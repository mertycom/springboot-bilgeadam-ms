package com.muates.memberservice.controller;

import com.muates.memberservice.model.dto.request.MemberAddRequest;
import com.muates.memberservice.model.dto.request.MemberUpdateRequest;
import com.muates.memberservice.model.dto.response.MemberResponse;
import com.muates.memberservice.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.muates.memberservice.controller.endpoint.MemberControllerEndpoint.*;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class MemberController {

    private final MemberService memberService;

    @PostMapping(ADD_MEMBER)
    public MemberResponse addMember(@RequestBody @Valid MemberAddRequest request) {
        return memberService.addMember(request);
    }

    @GetMapping(GET_MEMBER)
    public MemberResponse getMember(@PathVariable Long id) {
        return memberService.getMember(id);
    }

    @PutMapping(UPDATE_MEMBER)
    public MemberResponse updateMember(@PathVariable Long id,
                                       @RequestBody MemberUpdateRequest request) {
        return memberService.updateMember(id, request);
    }

    @DeleteMapping(DELETE_MEMBER)
    public String deleteMember(@PathVariable Long id) {
        return memberService.deleteMember(id);
    }
}
