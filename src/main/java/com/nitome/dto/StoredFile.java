package com.nitome.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoredFile {

    private Long id;

    private String name;

    private String type;

    private byte[] data;
}
