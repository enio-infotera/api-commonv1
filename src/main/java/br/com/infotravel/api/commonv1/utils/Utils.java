/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infotravel.api.commonv1.utils;

/**
 *
 * @author enioj
 */
public class Utils {

    public static <T> T isNull(T a, T b) {
        return (a == null) ? b : a;
    }
}
