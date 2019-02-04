package com.dkolp;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public abstract class Vocabulary {
    private static final String FILE_URL = "/home/darya/MyDirectory/my_projects/IdeaProjects/TaskProject/out/production/TaskProject/com/dkolp/vocabulary";

    public static final String EN = "en";
    public static final String RU = "ru";

    static final String APPLE = "apples";
    static final String GLASSES = "glasses";

    protected JSONObject mJsonFile;

    protected Vocabulary() {
        try {
            mJsonFile = (JSONObject) new JSONParser().parse(new FileReader(FILE_URL));
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }

    public static Vocabulary createVocabularyByTag(String tag) {
        if (tag.equals(RU))
            return new RuVocabulary();
        else if (tag.equals(EN))
            return new EnVocabulary();
        else
            throw new RuntimeException("incorrect language tag");
    }

    public abstract String getProduct(String typeProduct, int count);


}
