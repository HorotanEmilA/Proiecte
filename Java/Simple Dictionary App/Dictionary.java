package horotan.emil.lab1.ex5;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<Word, Definition> dictionary = new HashMap<>();

    public void addWord(Word word, Definition definition) {
        dictionary.put(word, definition);
    }

    public Definition getDefinition(Word word) {
        return dictionary.get(word);
    }

    public Map<Word, Definition> getAllWords() {
        return dictionary;
    }

    // Metoda pentru a obține toate definițiile poate returna o colecție de definiții sau poate afișa definițiile
    public void getAllDefinitions() {
        for (Definition definition : dictionary.values()) {
            System.out.println(definition.getDescription());
        }
    }
}