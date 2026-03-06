package com.my.company.data;

import jakarta.annotation.Nullable;

import java.io.Serializable;

public record AmbiguousObject(@Nullable String foo) implements Serializable {}
