package com.c8a.dream_shops.service.order;

import com.c8a.dream_shops.exceptions.ResourceNotFoundException;
import com.c8a.dream_shops.model.OrderItem;
import com.c8a.dream_shops.repository.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemService implements IOrderItemService {
    private final OrderItemRepository orderItemRepository;

    @Override
    public void deleteOrderItemsByProductId(Long id) {
        List<OrderItem> orderItems = orderItemRepository.findAllByProductId(id);
        if(orderItems != null && !orderItems.isEmpty()) {
            orderItemRepository.deleteAll(orderItems);
        } else {
            throw new ResourceNotFoundException("No such order items");
        }
    }
}
