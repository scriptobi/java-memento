package com.scriptobi.dev.classes;

public abstract class Individu {
    // attributes - attributs
    private int id; // identifiant numérique
    private String lastName; // prénom
    private String firstName; // nom

    // assessors - assesseurs
    public int getId() { return this.id; }
    private void setId(int id) { this.id = id; } //
    public String getLastName() { return this.lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFirstName() { return this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    protected Individu() {}
    protected Individu(int id) { this(id, "", ""); }
    protected Individu(int id, String lastName, String firstName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean isValidIndividu() { return !lastName.isBlank() && !firstName.isBlank(); }
}
