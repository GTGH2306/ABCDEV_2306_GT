package toto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClasseAnonymeExercise {
    public static void main(String[] args) {
        // Crée une liste de nombres entiers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        // Trie la liste en utilisant une classe anonyme comme comparateur
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1 - num2; // Trie par ordre croissant
            }
        });

        // Affiche les nombres triés
        System.out.println("Nombres triés : ");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}

