package com.dkolp;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Task {
    private static final String FILE_URL = "/home/darya/MyDirectory/my_projects/IdeaProjects/TaskProject/src/com/dkolp/vocabulary";

    static final String EN = "en";
    static final String RU = "ru";

    static final String APPLE = "apples";
    static final String GLASSES = "glasses";

    private static final String ONE = "ONE";
    private static final String FEW = "FEW";
    private static final String DEFAULT = "DEFAULT";

    public String getProductText(String language, String typeProduct, int number) {
        try {
            JSONObject file = (JSONObject) new JSONParser().parse(new FileReader(FILE_URL));
            JSONObject vocabulary = (JSONObject) file.get(language);
            JSONObject product = (JSONObject) vocabulary.get(typeProduct);

            String type = product.get(getQuantity(language, number)) != null
                    ? product.get(getQuantity(language, number)).toString()
                    : product.get(DEFAULT).toString();
            return number + " " + type;
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return  null;
    }

    private String getQuantity(String language, int number) {
        switch (language){
            case EN:
                if (number == 1)
                    return ONE;
                else
                    return DEFAULT;
            case RU:
                if (number % 10 == 1 && number % 100 != 11)
                    return ONE;
                else if (number % 100 >= 12 && number % 100 <= 14)
                    return DEFAULT;
                else if ((number % 10 >= 2 && number % 10 <= 4))
                    return FEW;
                else
                    return DEFAULT;
        }
        return null;
    }

}
