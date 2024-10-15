package br.com.infotravel.api.commonv1.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author enioj
 */
public class CustomDateNoHourDeserializer extends JsonDeserializer<Date> {

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String dateAsString = jsonParser.getText();
        try {
            return (Date) formatter.parse(dateAsString);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected: yyyy-MM-dd", e);
        }
    }
}
