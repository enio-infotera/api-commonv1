/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author gustavo
 */
public enum PointRuleType {
    BEFORE,
    AFTER;

    public static PointRuleType getEnum(String enumerator) {

        if (enumerator.equals("A")) {
            return PointRuleType.BEFORE;
        } else if (enumerator.equals("D")) {
            return PointRuleType.AFTER;
        }
        return null;
    }
}
