package com.nitome.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;

    public Author() {}

    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    private Long id;

    private String name;

    private String description;

    private String address;

    private String pContact;

    private String sContact;

    private String email;

    private LocalDateTime createdOn;

    private String createdBy;
}
