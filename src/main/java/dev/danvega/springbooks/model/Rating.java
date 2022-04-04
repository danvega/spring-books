package dev.danvega.springbooks.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Rating {
    FIVE_STARS("⭐️⭐️⭐️⭐️⭐️️️️"),
    FOUR_STARS("⭐️⭐️⭐️⭐️"),
    THREE_STARS("⭐️⭐️⭐️"),
    TWO_STARS("⭐️⭐️"),
    ONE_STAR("⭐️");

    private String star;

    Rating(String star) {
        this.star = star;
    }

    @JsonValue
    public String getStar() {
        return star;
    }
}
