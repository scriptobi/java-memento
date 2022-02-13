package com.scriptobi.dev.collections;

import com.scriptobi.dev.classes.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTest {
    private ArrayList<String> listOfSNames;
    private String[] names = {"Arthur", "Mickael", "François", "Annie", "Stéphane", "Jean-François"};
    private ArrayList<Student> listOfStudents;
    // Constructors
    public ArrayListTest() {
        initializeArrayListOfNames();
        addValueToListOfNames();
        getValueFromListOfNames();
        setValueFromListOfNames();
        removeValueFromListOfStrings();
        convertArrayToArrayList();
        copyListOfNames();
        alterListOfNames();
        convertArrayListToArray();
    }

    private void initializeArrayListOfNames() {
        System.out.println("--> Initialize listOfNames\n=> listOfNames = new ArrayList<>();");
        listOfSNames = new ArrayList<>();
        System.out.println("Result: " + listOfSNames + "\n");
    }
    private void addValueToListOfNames() {
        System.out.println("--> Ajoute l'élément' \"Jules\"\n\tthis.listOfNames.add(\"Jules\");");
        listOfSNames.add("Jules");
        System.out.println("--> Ajoute l'élément \"Marc\"\n\tthis.listOfNames.add(\"Marc\");");
        listOfSNames.add("Marc");
        System.out.println("--> Ajoute l'élément \"Anabelle\"\n\tthis.listOfNames.add(\"Anabelle\");");
        listOfSNames.add("Anabelle");
        System.out.println("Result: " + listOfSNames + "\n");
        System.out.println("--> Ajoute l'élément \"Catherine\" à l'index 2\n\tthis.listOfNames.add(\"Catherine\");");
        listOfSNames.add(2, "Catherine");
        System.out.println("Result: " + listOfSNames + "\n");
    }
    private void getValueFromListOfNames() {
        System.out.println("--> lecture d'un élémént à l'index 0\n\tString value = listOfNames.get(0);\nResult: value = " + listOfSNames.get(0));
        System.out.println("--> lecture par boucle for:\nfor(int i = 0; i < listOfNames.size(); i++) {");
        for(int i = 0; i < listOfSNames.size(); i++) {
            System.out.println("\tlistOfNames.get("+ i + ") => " + listOfSNames.get(i));
        }
        System.out.println("}");
        System.out.println("--> lecture par boucle foreach :\nfor(String element: listOfNames) {");
        for(String element: listOfSNames) {
            System.out.println("\telement => " + element);
        }
        System.out.println("}");
        System.out.println("--> lecture par iterator:\nIterator<String> it = listOfNames.iterator();\nwhile(it.hasNext()) {");
        Iterator<String> it = listOfSNames.iterator();
        while(it.hasNext()) {
            System.out.println("\tit.next() => " + it.next());
        }
        System.out.println("}");
    }
    private void setValueFromListOfNames() {
        System.out.println("--> Modification d'un élément");
        System.out.println("Ancienne valeur:\n\tlistOfStrings.get(1) => " + listOfSNames.get(1));
        listOfSNames.set(1, "Cette chaine de caractère à été moddifiée");
        System.out.println("Nouvelle valeur:\n\tlistOfStrings.set(1, \"Cette chaine de caractère à été moddifiée\");\n\tlistOfStrings.get(1); => " + listOfSNames.get(1));
        System.out.println("Result: " + listOfSNames);
    }
    private void removeValueFromListOfStrings() {
        System.out.println("--> supression d'un élément à l'index 1:");
        System.out.println("Anciennes valeurs: " + listOfSNames + "\nSize: " + listOfSNames.size());
        System.out.println("\tlistOfStrings.remove(1);");
        listOfSNames.remove(1);
        System.out.println("Result: " + listOfSNames + "\nSize: " + listOfSNames.size());
        for(int i = 0; i < listOfSNames.size(); i++) {
            System.out.println("\tlistOfStrings.get("+i+") => " + listOfSNames.get(i));
        }
    }

    private void convertArrayToArrayList() {
        System.out.println("--> Conversion d'un String[] en un ArrayList<String>\nlocalListOfNames = new ArrayList(Arrays.asList(names);");
        ArrayList<String> localListOfNames = new ArrayList(Arrays.asList(names));
        System.out.println("Result: " + localListOfNames);
        System.out.println("for(int i = 0; i < localListOfNames.size(); i++) {");
        for (int i = 0; i < localListOfNames.size(); i++) {
            System.out.println("\tlocalListOfNames.get(" + i + ") => " + localListOfNames.get(i));
        }
        System.out.println("}");
    }
    private void copyListOfNames() {
        ArrayList<String> localListOfNames = new ArrayList<>(Arrays.asList(names));
        System.out.println("--> copie d'une liste: mauvaise saolution");
        System.out.println(("ArrayList<String> badCopie = list;"));
        ArrayList<String> badCopie = localListOfNames;
        System.out.println("Result: \n\tlist = " + localListOfNames + "\n\tbadCopie = " + badCopie);
        System.out.println("Ajout d'un élément à la liste badCopie : badCopie.add(\"Bernard\"");
        badCopie.add("Bernard");
        System.out.println("Result: \n\tlocalListOfNames = " + localListOfNames + "\n\tbadCopie = " + badCopie);

        System.out.println("--> copie d'une liste: bonne solution");
        System.out.println(("ArrayList<String> copieOfNames = new ArrayList<>(localListOfNames);"));
        ArrayList<String> copieOfNames = new ArrayList<>(localListOfNames);
        System.out.println("Result: \n\tlocalListOfNames = " + localListOfNames + "\n\tcopieOfNames = " + copieOfNames);
        System.out.println("Ajout d'un élément à la liste copieOfNames : copieOfNames.add(\"Léon\"");
        copieOfNames.add("Léon");
        System.out.println("Result: \n\tlocalListOfNames = " + localListOfNames + "\n\tcopieOfNames = " + copieOfNames);
    }
    private void alterListOfNames() {
        ArrayList<String> localListOfNames = new ArrayList<>(Arrays.asList(names));
        ArrayList<String> copieOfNames = new ArrayList<>(localListOfNames);
        System.out.println("--> modification par référence");
        System.out.println("modification(copieOfNames);");
        modifyByReference(copieOfNames);
        System.out.println("Result: copieOfNames = " + copieOfNames);
        System.out.println("Result: localListOfNames = " + localListOfNames + "\n");

        System.out.println("--> concaténation d'ArrayList");
        System.out.println("\tlocalListOfNames.addAll(listOfNames);");
        localListOfNames.addAll(listOfSNames);
        System.out.println("Result:\n\tlocalListOfNames = " + localListOfNames);
        System.out.println("\tlistOfNames = " + listOfSNames);
    }
    private void modifyByReference(ArrayList<String> namesCol) {
        /*
            le paramètre namesCol étant une référence, un "return namesCol;" est inutile.
         */
        System.out.println("\tvoid modify(ArrayList<String> namesCol) {");
        System.out.println("\t\tnamesCol.add(\"Frédérique\")");
        namesCol.add("Frédérique");
        System.out.println("\t\tnamesCol.set(3, \"Hanna\");");
        namesCol.set(3, "Hanna");
        System.out.println("\t\tnamesCol.remove(\"Stéphane\"");
        namesCol.remove("Stéphane");
        System.out.println("\t}");
        System.out.println("\tResult: namesCol = " + namesCol);
    }
    private void convertArrayListToArray() {
        ArrayList<String> localListOfNames = new ArrayList<>(Arrays.asList(names));
        System.out.println("--> conversion d'une liste en array");
        System.out.println("\tString[] tmpNames = new String[localListOfNames.size()];\n" +"\tlocalListOfNames.toArray(tmpNames);");
        String[] tmpNames = new String[localListOfNames.size()];
        localListOfNames.toArray(tmpNames);
        System.out.println("Result:\n\ttmpName = " + Arrays.toString(tmpNames));
    }

    public static void main(String... args) {
        System.out.println("--- Starting ArrayListTest ---");
        ArrayListTest test = new ArrayListTest();
    }
}
