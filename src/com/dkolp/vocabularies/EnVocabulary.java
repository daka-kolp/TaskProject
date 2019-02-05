package com.dkolp.vocabularies;

import com.dkolp.vocabularies.constants.QuantityKeys;
import com.dkolp.vocabularies.constants.TranslationKeys;
import org.json.simple.JSONObject;

public class EnVocabulary extends Vocabulary {

    private JSONObject enVocabulary;

    public EnVocabulary() {
        if (mJsonFile != null)
            enVocabulary = (JSONObject) mJsonFile.get(TranslationKeys.EN);
    }

    @Override
    protected JSONObject getJsonProduct(String typeProduct) {
        return (JSONObject) enVocabulary.get(typeProduct);
    }

    @Override
    protected String getQuantity(int count) {
        if (count == 1)
            return QuantityKeys.ONE;
        else
            return QuantityKeys.DEFAULT;
    }

}
