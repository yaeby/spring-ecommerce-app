package com.c8a.dream_shops.service.cart;

import com.c8a.dream_shops.dto.CartDto;
import com.c8a.dream_shops.model.Cart;
import com.c8a.dream_shops.model.User;

import java.math.BigDecimal;

public interface ICartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
    Cart getUserCartOrCreateOne(User user);
    Cart getCartByUserId(Long userId);
    CartDto convertCartToDto(Cart cart);
}
