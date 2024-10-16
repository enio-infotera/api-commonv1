/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author enioj
 */
public class Utils {

    public static <T> T isNull(T a, T b) {
        return (a == null) ? b : a;
    }

    public static String encodeBase64(String str) {
        return encodeBase64(str.getBytes());
    }

    public static String encodeBase64(byte[] bytes) {
        Base64.Encoder enc = Base64.getEncoder();
        return enc.encodeToString(bytes);
    }

    public static String decodeBase64(String encoded) {
        Base64.Decoder dec = Base64.getDecoder();
        return new String(dec.decode(encoded));
    }

    public static Date formatDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSSX");
        try {
            LocalDateTime parsedDateTime = LocalDateTime.parse(date, formatter);

            return Date.from(parsedDateTime.atOffset(ZoneOffset.UTC).atZoneSameInstant(ZoneOffset.ofHours(-3)).toLocalDateTime().atZone(ZoneId.of("America/Sao_Paulo")).toInstant());
        } catch (DateTimeParseException e) {
            return null;
        }
    }
    
    public static Date toDate(String value, String format) {
        Date result = null;
        if (!isNothing(value)) {
            try {
                DateFormat formatter = new SimpleDateFormat(format);
                result = (Date) formatter.parse(value);
            } catch (ParseException ex) {
            }
        }
        return result;
    }

    public static String removeSpecialCharactersAndSpaces(String str) {
        // Use regular expression to match all non-alphanumeric characters and spaces
        String regex = "[^a-zA-Z0-9]";

        // Replace all occurrences of the regular expression with an empty string
        String result = str.replaceAll(regex, "");

        return result;
    }

    public static String formatDate(Date value, String format) {
        try {
            return formatDate(value, format, new Locale("pt", "BR"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static String formatDate(Date value, String format, Locale locale) throws Exception {
        String result;
        try {
            DateFormat formatter = new SimpleDateFormat(format, locale);
            result = formatter.format(value).toString();
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static boolean isNothing(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isNothing(Integer value) {
        return value == null || value == 0;
    }

    public static boolean isNothing(Double value) {
        return value == null || value == 0;
    }

    public static boolean isNothing(Character value) {
        return value == null || value.toString().isEmpty();
    }

    public static boolean isListNothing(List<?> list) {
        return list == null || list.isEmpty();
    }

}
