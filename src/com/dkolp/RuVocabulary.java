package com.dkolp;

import org.json.simple.JSONObject;

public class RuVocabulary extends Vocabulary {

    private JSONObject ruVocabulary;

    public RuVocabulary() {
        if (mJsonFile != null)
            ruVocabulary = (JSONObject) mJsonFile.get(Vocabulary.RU);
    }

    private String getQuantity(int count) {
        if (count % 10 == 1 && count % 100 != 11)
            return "ONE";
        else if (count % 100 >= 12 && count % 100 <= 14)
            return "MANY";
        else if ((count % 10 >= 2 && count % 10 <= 4))
            return "FEW";
        else
            return "MANY";
    }

    @Override
    public String getProduct(String typeProduct, int count) {
        JSONObject product = (JSONObject) ruVocabulary.get(typeProduct);
        String value = product.get(getQuantity(count)).toString();
        return count + " " + value;
    }
}
