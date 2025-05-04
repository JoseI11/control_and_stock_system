package com.example.controlandstocksystem.service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.controlandstocksystem.repository.ProductRepository;
import com.example.controlandstocksystem.model.Product;
@Service
public class ProductService {
    ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> productsReturn(){
        return repo.findAll();
    }

    public void addProduct(Product product){
        repo.save(product);
    }
    public void deleteProduct(int id){
        repo.deleteById(id);
    }
    public void updateProduct(int id, Product product){
        Product productModified = repo.findById(id).get();
        productModified.setDescripcion(product.getDescripcion());
        productModified.setConsumo_mensual(product.getConsumo_mensual());
        productModified.setFecha_ingreso(product.getFecha_ingreso());
        productModified.setMoneda(product.getMoneda());
        productModified.setLote_de_compra(product.getLote_de_compra());
        productModified.setNombre_proveedor(product.getNombre_proveedor());
        productModified.setUnidad_medida(product.getUnidad_medida());
        productModified.setPrecio(product.getPrecio());
        productModified.setStock(product.getStock());
        productModified.setStock_minimo(product.getStock_minimo());
        productModified.setStock_seguridad(product.getStock_seguridad());
        productModified.setIdentificacion_prod(product.getIdentificacion_prod());
        repo.save(productModified);
    }
    public Product getProductById(int id){
        return repo.findById(id).get();
    }
}
