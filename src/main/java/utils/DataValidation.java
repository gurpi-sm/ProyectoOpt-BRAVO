/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Francesc Perez 
 * @version 1.1.0
 */
public class DataValidation {
private static final String EMAIL_REGEX = 
        "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + 
        "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

    
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    /**
     * Valida si un string tiene un formato de email correcto.
     * * @param email El correo electrónico a validar.
     * @return true si es válido, false en caso contrario.
     */
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        Matcher matcher = PATTERN.matcher(email);
        return matcher.matches();
    }
    private static final String PHONE_REGEX = 
        "^\\+?[0-9]{1,4}?[-.\\s]?\\(?[0-9]{1,3}?\\)?[-.\\s]?[0-9]{1,4}[-.\\s]?[0-9]{1,4}[-.\\s]?[0-9]{1,9}$";

    private static final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

    public static boolean isValidPhone(String phone) {
        if (phone == null) {
            return false;
        }
        Matcher matcher = PHONE_PATTERN.matcher(phone);
        return matcher.matches();
    }
    public static boolean isNumber(char c) {
        return (48 <= c && c <= 57);
    }

    public static boolean isLetter(char c) {
        //The name can contain uppercase and lowercase letters, whitespace, 
        //hyphens and code control
//        return (97 <= c && c <= 122) || (65 <= c && c <= 90) || (c == 32) || (c == 45);
        return Character.isLetter(c) || c==32 || c==45;
    }

    public static String calculateNifLetter(String nifNoLetter) {
        String [] letter = {"T","R","W","A","G","M","Y","F","P","D","X","B",
            "N","J","Z","S","Q","V","H","L","C","K","E"};
        return nifNoLetter + letter[Integer.parseInt(nifNoLetter)%23];
    }
    public static boolean isValidPostalCode(String postalCode) {
        if (postalCode == null) {
            return false;
        }
        String postalCodeRegex = "^(\\d{5})(?:[-\\s]?\\d{4})?$";
        return postalCode.matches(postalCodeRegex);
    }

}
