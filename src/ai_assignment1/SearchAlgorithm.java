/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai_assignment1;

import java.util.Comparator;

/**
 *
 * @author Adrian
 * @param <T>
 */
public interface SearchAlgorithm<T>{
    String name();
    EnumHeursitic getHeursitic();
    int getNodeCost(T t);
    Comparator<T> getComparator();
}
