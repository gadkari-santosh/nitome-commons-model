package com.nitome.dto.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorCreateReq {

    private Integer id;

    private String name;

    private String description;

    private String address;

    private String pContact;

    private String sContact;

    private String email;

    private String createdBy;
}
