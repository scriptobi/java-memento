package com.scriptobi.dev.classes;

import com.scriptobi.dev.enumerations.ECursus;

public class Student extends Individu {
    private ECursus cursus;// = ECursus.EPSI_Dev_B3; // enumeration cursus
    public String getCursusName() { return cursus.getCursusLabel(); }
    public ECursus getCursus() { return cursus; }

    // constructors - constructeurs
    /**
     * constructeur par défaut => initialise le paramètre 'id' pour le constructeur n°2
     * utilisation : Student student = new Student();
     */
    public Student() { this(1); }
    /**
     * constructeur n°2 => initialise les paramètres 'lastName', 'firstName' et 'cursus' pour le constructeur n°3
     * @param id as int for student identification number
     */
    public Student(int id) { this(id, "","", ECursus.EPSI_Dev_B3); }
    /**
     * constucteur n°3 => initialise les attrubuts 'id', 'lastName' et 'firstName'
     * @param id as int for student identification number
     * @param lastName as String for student lastName
     * @param firstName as String for student firstName
     * @param cursus as ECursus for student cursus
     */
    public Student(int id, String lastName, String firstName, ECursus cursus) {
        super(id, lastName, firstName);
        this.cursus = cursus;
    }

    /**
     * check if lastName and firstName attributes are empties or not
     * @return boolean as lastName && firstName are empty.
     */
    public boolean isValidStudent() { return super.isValidIndividu(); }
}
