package com.maulikam.app;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(stagedBuilder = true)
public interface Currency {
    String code();

    String name();

    String symbol();
}
