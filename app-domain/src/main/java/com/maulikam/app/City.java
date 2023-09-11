package com.maulikam.app;

import org.immutables.value.Value;

@Value.Immutable
@Value.Style(stagedBuilder = true, allParameters = true)
public interface City {

    String getName();
}
