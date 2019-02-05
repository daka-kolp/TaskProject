package com.dkolp;

import com.dkolp.vocabularies.TranslationKeys;
import com.dkolp.vocabularies.TypeProductKeys;
import com.dkolp.vocabularies.Vocabulary;

public class Main {

    public static void main(String[] args) {

        Vocabulary english = Vocabulary.createVocabularyByTag(TranslationKeys.EN);
        for (int i = 0; i < 25; i++) {
            System.out.println(english.getProductText(TypeProductKeys.APPLE, i));
        }for (int i = 0; i < 25; i++) {
            System.out.println(english.getProductText(TypeProductKeys.GLASSES, i));
        }

        Vocabulary russian = Vocabulary.createVocabularyByTag(TranslationKeys.RU);
        for (int i = 0; i < 25; i++) {
            System.out.println(russian.getProductText(TypeProductKeys.APPLE, i));
        }for (int i = 0; i < 25; i++) {
            System.out.println(russian.getProductText(TypeProductKeys.GLASSES, i));
        }

    }
}
