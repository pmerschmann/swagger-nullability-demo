package com.my.company.data;

import jakarta.annotation.Nullable;

import java.io.Serializable;

public record MyObject(
        @Nullable AmbiguousObject ambiguousObjectNullable,
        AmbiguousObject ambiguousObjectNonNull,

        @Nullable NullableObject nestedNullableObject,

        NonNullableObject nestedNonNullableObject)
        implements Serializable {}
