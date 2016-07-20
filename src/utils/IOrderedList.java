package utils;

import model.User;

/**
 * Created by faith on 7/19/16.
 */
public interface IOrderedList extends IList <User> {
    /**
     *
     * @param userName String
     * @return boolean
     */
    boolean remove(String userName);

    /**
     *
     * @param userName String
     * @return boolean
     */
    boolean contains(String userName);
}
