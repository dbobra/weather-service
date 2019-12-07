package com.dbobr.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rain {

    @JsonProperty("1h")
    private Double oneHour;

    @JsonProperty("3h")
    private Double threeHour;

    public Double getOneHour() {
        return oneHour;
    }

    public void setOneHour(Double oneHour) {
        this.oneHour = oneHour;
    }

    public Double getThreeHour() {
        return threeHour;
    }

    public void setThreeHour(Double threeHour) {
        this.threeHour = threeHour;
    }
}
