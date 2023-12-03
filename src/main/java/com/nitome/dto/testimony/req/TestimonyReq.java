package com.nitome.dto.testimony.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestimonyReq {

    String testimony;
    String custName;
    Float rating;
    String location;
    String custProfile;
    String createdBy;
}