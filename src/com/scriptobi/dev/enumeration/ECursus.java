package com.scriptobi.dev.enumeration;

public enum ECursus {
    EPSI_Dev_B3 ("EPSI Dev B3"),
    LDS_Dev_B3 ("LDS Dev B3")
    ;

    private final String cursus;
    ECursus(String cursus) { this.cursus = cursus; }

    public int getId() { return  ordinal(); }
    public String getCursusLabel() { return this.cursus; }
}
