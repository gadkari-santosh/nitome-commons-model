package com.nitome.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.io.Serializable;
import java.util.Currency;
import lombok.*;

@Value
@Builder(setterPrefix = "with")
@JsonPOJOBuilder(withPrefix = "")
@JsonDeserialize(builder = Price.PriceBuilder.class)
public class Price implements Serializable {

    private Double value;

    private String currency;

    @JsonProperty("currencyString")
    public String currencyString() {

        var curr = Currency.getInstance(currency);

        return String.format("%s%.0f", curr.getSymbol(), value);
    }

    public String toString() {
        return currencyString();
    }
}
