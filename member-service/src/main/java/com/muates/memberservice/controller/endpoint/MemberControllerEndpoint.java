package com.muates.memberservice.controller.endpoint;

public class MemberControllerEndpoint {

    public static final String PATH = "/member";
    public static final String V1 = "/v1";

    public static final String ADD_MEMBER = PATH + V1 + "/add";
    public static final String GET_MEMBER = PATH + V1 + "/get/{id}";
    public static final String UPDATE_MEMBER = PATH + V1 + "/update/{id}";
    public static final String DELETE_MEMBER = PATH + V1 + "/delete/{id}";
}
