package com.my.company.data;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class MyObject implements Serializable {

    @Nullable
    private AmbiguousObject ambiguousObjectNullable;

    private AmbiguousObject ambiguousObjectNonNull;

    @Nullable
    private NullableObject nestedNullableObject;

    private NonNullableObject nestedNonNullableObject;
}
