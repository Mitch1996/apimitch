package com.main.api;

import com.opencsv.bean.CsvBindByPosition;

public class Country {

    //"id","code","name","continent","wikipedia_link","keywords"

    @CsvBindByPosition(position = 0)
    private String id;

    @CsvBindByPosition(position = 1)
    private String code;

    @CsvBindByPosition(position = 2)
    private String name;

    @CsvBindByPosition(position = 3)
    private String continent;

    @CsvBindByPosition(position = 4)
    private String wikipedia_link;

    @CsvBindByPosition(position = 5)
    private String keywords;

}