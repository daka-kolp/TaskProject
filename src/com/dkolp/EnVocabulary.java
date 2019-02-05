package com.dkolp;

import org.json.simple.JSONObject;

public class EnVocabulary extends Vocabulary {

    private JSONObject enVocabulary;

    public EnVocabulary() {
        if (mJsonFile != null)
            enVocabulary = (JSONObject) mJsonFile.get(Vocabulary.EN);
    }

    private String getQuantity(int count) {
        if (count == 1)
            return "ONE";
        else
            return "MANY";
    }
    @Override
    public String getProduct(String typeProduct, int count) {
        JSONObject product = (JSONObject) enVocabulary.get(typeProduct);
        String type = product.get(getQuantity(count)).toString();
        return count + " " + type;
    }

}
