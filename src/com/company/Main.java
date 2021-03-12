package com.company;

public class Main {

    public static void main(String[] args) {
	/*Creeaza un program care verifica propozitia: "ANA are mere impreuna cu MADAM Daiana."
      Atunci cand gaseste un palidrom, il afiseaza iar la final cand intalneste '.' afiseaza cate palindroame au fost in total*/

	String textInitial = "Ana are mere impreuna cu madam Daiana. Bla bla ASA.";
        System.out.println("Propozitia data : " +textInitial);
        String text = textInitial.replace(".", " ");
        text = text.toUpperCase();
        String[] words = text.split(" ");
        int counter = 0; //variabila counter pentru numararea de palindroame
        for (int i = 0; i < words.length; i++) { //parcurgem fiecare cuvant din propozitie
            for (int j = 0; j < words[i].length(); j++) {
                int k=words[i].length()-1; //variabila k pentru compararea simetriei cuvantului
                if (words[i].charAt(j) == words[i].charAt(k-j)) {
                    if(j==k){
                        counter++;
                        System.out.println(words[i]);}
                }
            }
        }
        System.out.println("Numarul de palindroame existente: "+ counter);
    }
}

