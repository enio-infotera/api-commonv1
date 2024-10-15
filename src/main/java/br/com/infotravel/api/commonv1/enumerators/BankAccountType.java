/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.enumerators;

/**
 *
 * @author enioj
 */
public enum BankAccountType {

    SAVINGS_ACCOUNT,
    CHECKING_ACCOUNT;

    public static BankAccountType getEnum(Integer id) {
        if (id.equals(1)) {
            return BankAccountType.CHECKING_ACCOUNT;
        } else if (id.equals(2)) {
            return BankAccountType.SAVINGS_ACCOUNT;
        }

        return null;
    }
}
