package com.c8a.dream_shops.service.product;

import com.c8a.dream_shops.dto.ProductDto;
import com.c8a.dream_shops.model.Product;
import com.c8a.dream_shops.request.AddProductRequest;
import com.c8a.dream_shops.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest request);
    Product getProductById(Long productId);
    void deleteProductById(Long productId);
    Product updateProduct(ProductUpdateRequest request, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String productName);
    List<Product> getProductsByBrandAndName(String brand, String productName);
    Long countProductsByBrandAndName(String brand, String productName);
    List<ProductDto> getConvertedProducts(List<Product> products);
    ProductDto convertToDto(Product product);
}
