/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author gustavo
 */
public enum DueDateType {
    CHECK_IN,
    CHECK_OUT,
    CONFIRMATION;

    public static DueDateType getEnum(String enumerator) {

        if (enumerator.equals("I")) {
            return DueDateType.CHECK_IN;
        } else if (enumerator.equals("O")) {
            return DueDateType.CHECK_OUT;
        } else if (enumerator.equals("C")) {
            return DueDateType.CONFIRMATION;
        }
        return null;
    }
}
