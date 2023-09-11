package com.maulikam.app;


import java.util.List;

public interface CountriesRepository {

    List<Country> getByName(String name);

    List<Country> all();

    void persist(List<Country> countries);

}
