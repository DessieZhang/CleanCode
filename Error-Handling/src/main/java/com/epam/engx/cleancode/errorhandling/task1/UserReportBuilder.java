package com.epam.engx.cleancode.errorhandling.task1;

import com.epam.engx.cleancode.errorhandling.task1.thirdpartyjar.Exceptions.EmptyOrdersException;
import com.epam.engx.cleancode.errorhandling.task1.thirdpartyjar.Exceptions.InvalidOrderAmountException;
import com.epam.engx.cleancode.errorhandling.task1.thirdpartyjar.Exceptions.InvalidUserException;
import com.epam.engx.cleancode.errorhandling.task1.thirdpartyjar.Order;
import com.epam.engx.cleancode.errorhandling.task1.thirdpartyjar.UserDao;
import java.util.List;

public class UserReportBuilder {

    private UserDao userDao;

    public Double getUserTotalOrderAmount(String userId) {

        if (isInvalidUser(userId))
            throw new InvalidUserException("Invalid user!");

        if (isEmptyOrders(userId))
            throw new EmptyOrdersException("Orders are empty!");

        Double sum = 0.0;
        for (Order order : getUserOrders(userId)) {
            if (order.isSubmitted()) {
                Double total = order.total();
                if (total < 0)
                    throw new InvalidOrderAmountException("Invalid order Amount");
                sum += total;
            }
        }
        return sum;
    }

    public Boolean isInvalidUser(String userId){
        if(userDao == null || userDao.getUser(userId)==null){
            return true;}
        return false;
    }

    public Boolean isEmptyOrders(String userId){
        if(getUserOrders(userId).isEmpty()){return true;}
        return false;
    }

    public List<Order> getUserOrders(String userId){
        List<Order> orders = userDao.getUser(userId).getAllOrders();
        return orders;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


}
