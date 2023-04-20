package com.careerit.emp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Currency {

       private String symbol;
       private String name;
       @JsonProperty("symbol_native")
       private String symbolNative;
       @JsonProperty("decimal_digits")
       private int decimalDigits;
       private int rounding;
       private String code;
       @JsonProperty("name_plural")
       private String namePlural;
}
