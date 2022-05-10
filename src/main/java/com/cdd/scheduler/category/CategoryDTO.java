package com.cdd.scheduler.category;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class CategoryDTO {
    @JsonProperty(access = Access.READ_ONLY)
    public Long categoryID;
    public String description;
}
