package com.scriptobi.dev.collections;

import com.scriptobi.dev.classes.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    private ArrayList<String> listOfStrings;
    private ArrayList<String> listOfNames;
    private String[] names = {"Arthur", "Mickael", "François", "Annie", "Stephane", "Jean-François"};
    private ArrayList<Student> listOfStudents;
    // Constructors
    public ArrayListTest() {
        /*
        System.out.println("-> test001 : ajout de valeur à un ArrayList<String>");
        test001();// */
        //*
        System.out.println(("\n-> test002 : manipulation d'un ArrayList<String>"));
        test002();// */
    }

    /**
     * gestion d'une ArrayList<String>
     */
    private void test001() {
        System.out.println("Initialize listOfStrings\n=> listOfString = new ArrayList<>();");
        listOfStrings = new ArrayList<>();
        System.out.println("Adding value \"Une chaine de caratères.\" to listOfString\n=> this.listOfString.add(\"Une chaine de caratères.\");");
        listOfStrings.add("Une chaine de caractères");
        System.out.println("Adding value \"Une autre chaine de caratères.\" to listOfString\n=> this.listOfString.add(\"Une autre chaine de caratères.\");");
        listOfStrings.add("Une autre chaine de caractères");
        System.out.println("Adding value \"Une dernière chaine de caratères.\" to listOfString\n=> this.listOfString.add(\"Une dernière chaine de caratères.\");");
        listOfStrings.add("Une dernière chaine de caractères");
        System.out.println("Result: " + listOfStrings);

        System.out.println("--> lecture par boucle for:\nfor(int i = 0; i < listOfString.size(); i++) {");
        for(int i = 0; i < listOfStrings.size(); i++) {
            System.out.println("\tlistOfString.get("+ i + ") => " + listOfStrings.get(i));
        }
        System.out.println("}");
        System.out.println("--> lecture par boucle foreach :\nfor(String element: listOfStrings) {");
        for(String element: listOfStrings) {
            System.out.println("\telement => " + element);
        }
        System.out.println("}");
        System.out.println("--> lecture par iterator:\nIterator<String> it = listOfStrings.iterator();\nwhile(it.hasNext()) {");
        Iterator<String> it = listOfStrings.iterator();
        while(it.hasNext()) {
            System.out.println("\tit.next() => " + it.next());
        }
        System.out.println("}");

        System.out.println("--> Insertion d'un élément à l'index 2");
        listOfStrings.add(2, "Cette chaine de caractères à été inséré à l'index 2");
        System.out.println("Result: " + listOfStrings);

        System.out.println("--> Modification d'une valeur");
        System.out.println("Ancienne valeur:\n\tlistOfStrings.get(1) => " + listOfStrings.get(1));
        listOfStrings.set(1, "Cette chaine de caractère à été moddifiée");
        System.out.println("Nouvelle valeur:\n\tlistOfStrings.set(1, \"Cette chaine de caractère à été moddifiée\");\n\tlistOfStrings.get(1); => " + listOfStrings.get(1));

        System.out.println("--> supression d'un élément à l'index 1:");
        System.out.println("Anciennes valeurs: " + listOfStrings + "\nSize: " + listOfStrings.size());
        System.out.println("\tlistOfStrings.remove(1);");
        listOfStrings.remove(1);
        System.out.println("Result: " + listOfStrings + "\nSize: " + listOfStrings.size());
        for(int i = 0; i < listOfStrings.size(); i++) {
            System.out.println("\tlistOfStrings.get("+i+") => " + listOfStrings.get(i));
        }
    }

    private void test002() {
        System.out.println("--> Conversion d'un String[] en un ArrayList<String>\nlistOfNames = new ArrayList(Arrays.asList(names);");
        listOfNames = new ArrayList(Arrays.asList(names));
        System.out.println("Result: " + listOfNames);
        System.out.println("for(int i = 0; i < listOfNames.size(); i++) {");
        for(int i = 0; i < listOfNames.size(); i++) {
            System.out.println("\tlistOfNames.get(" + i + ") => " + listOfNames.get(i));
        }
        System.out.println("}");

        System.out.println("--> copie d'une liste: mauvaise saolution");
        System.out.println(("ArrayList<String> badCopie = listOfNames;"));
        ArrayList<String> badCopie = listOfNames;
        System.out.println("Result: \n\tlistOfNames = " + listOfNames + "\n\tbadCopie = " + badCopie);
        System.out.println("Ajout d'un élément à la liste badCopie : badCopie.add(\"Bernard\"");
        badCopie.add("Bernard");
        System.out.println("Result: \n\tlistOfNames = " + listOfNames + "\n\tbadCopie = " + badCopie);

        System.out.println("--> copie d'une liste: bonne solution");
        System.out.println(("ArrayList<String> copieOfNames = new ArrayList<>(listOfNames);"));
        ArrayList<String> copieOfNames = new ArrayList<>(listOfNames);
        System.out.println("Result: \n\tlistOfNames = " + listOfNames + "\n\tcopieOfNames = " + copieOfNames);
        System.out.println("Ajout d'un élément à la liste copieOfNames : copieOfNames.add(\"Léon\"");
        copieOfNames.add("Léon");
        System.out.println("Result: \n\tlistOfNames = " + listOfNames + "\n\tcopieOfNames = " + copieOfNames);

        System.out.println("--> modification par référence");
        System.out.println("test002Bis(copieOfNames);");
        test002Bis(copieOfNames);
        System.out.println("Result: copieOfNames = " + copieOfNames);
        System.out.println("Result: listOfNames = " + listOfNames);

    }
    private void test002Bis(ArrayList<String> namesCol) {
        /*
            le paramètre namesCol étant une référence, un "return namesCol;" est inutile.
         */
        System.out.println("\tvoid test002Bis(ArrayList<String> namesCol)");
        System.out.println("\t\tnamesCol.add(\"Frédérique\")");
        namesCol.add("Frédérique");
        System.out.println("\tResult: namesCol = " + namesCol);
    }

    public static void main(String... args) {
        System.out.println("--- Starting ArrayListTest ---");
        ArrayListTest test = new ArrayListTest();
    }
}
