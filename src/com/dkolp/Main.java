package com.dkolp;

public class Main {

    public static void main(String[] args) {

        Vocabulary english = Vocabulary.createVocabularyByTag(Vocabulary.EN);
        for (int i = 0; i < 25; i++) {
            System.out.println(english.getProduct(Vocabulary.APPLE, i));
        }for (int i = 0; i < 25; i++) {
            System.out.println(english.getProduct(Vocabulary.GLASSES, i));
        }

        Vocabulary russian = Vocabulary.createVocabularyByTag(Vocabulary.RU);
        for (int i = 0; i < 25; i++) {
            System.out.println(russian.getProduct(Vocabulary.APPLE, i));
        }for (int i = 0; i < 25; i++) {
            System.out.println(russian.getProduct(Vocabulary.GLASSES, i));
        }

    }
}
