package com.nitome.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Price {

    private String currency;

    private Double value;

    private String currencySymbol;

    private String priceString;
}