package com.metis.book.service;

import java.util.List;

import com.metis.book.dto.CheckoutForm;
import com.metis.book.dto.OrderShow;
import com.metis.book.model.order.Order;
import com.metis.book.model.user.User;

public interface IOrderService {


	Long createOrder(CheckoutForm checkoutForm);

	Order getOrderById(Long orderId);

	List<OrderShow> getOrderShows();

    OrderShow getOrderShowById(Long orderID);

    void updateOrder(OrderShow orderShow);

	List<Order> getAllOrderByUser(User user);
}
