package com.muates.memberserviceclient.client;

import com.muates.memberserviceclient.model.MemberDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("member-service")
public interface MemberServiceClient {

    @RequestMapping("/member/v1/get/{id}")
    MemberDto getMember(@PathVariable Long id);

    @RequestMapping("/member/v1/exist/{id}")
    boolean existMember(@PathVariable Long id);
}
