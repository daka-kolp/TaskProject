package com.dkolp.vocabularies;

import com.dkolp.vocabularies.constants.QuantityKeys;
import com.dkolp.vocabularies.constants.TranslationKeys;
import org.json.simple.JSONObject;

public class RuVocabulary extends Vocabulary {

    private JSONObject ruVocabulary;

    public RuVocabulary() {
        if (mJsonFile != null)
            ruVocabulary = (JSONObject) mJsonFile.get(TranslationKeys.RU);
    }

    @Override
    protected JSONObject getJsonProduct(String typeProduct) {
        return (JSONObject) ruVocabulary.get(typeProduct);
    }

    @Override
    protected String getQuantity(int count) {
        if (count % 10 == 1 && count % 100 != 11)
            return QuantityKeys.ONE;
        else if (count % 100 >= 12 && count % 100 <= 14)
            return QuantityKeys.DEFAULT;
        else if ((count % 10 >= 2 && count % 10 <= 4))
            return QuantityKeys.FEW;
        else
            return QuantityKeys.DEFAULT;
    }

}
