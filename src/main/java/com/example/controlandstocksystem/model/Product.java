package com.example.controlandstocksystem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_productos;
    private int stock;
    private String unidad_medida;
    private String nombre_proveedor;
    private double precio;
    private String moneda;
    private int lote_de_compra;
    private int consumo_mensual;
    private int stock_seguridad;
    private int stock_minimo;
    private String descripcion;
    private String fecha_ingreso;
    private int identificacion_prod;

    public Product(){

    }

    public Product(int id_productos, int stock, String unidad_medida, String nombre_proveedor, double precio, String moneda, int lote_de_compra, int consumo_mensual, int stock_seguridad, int stock_minimo, String descripcion, String fecha_ingreso, int identificacion_prod) {
        this.id_productos = id_productos;
        this.stock = stock;
        this.unidad_medida = unidad_medida;
        this.nombre_proveedor = nombre_proveedor;
        this.precio = precio;
        this.moneda = moneda;
        this.lote_de_compra = lote_de_compra;
        this.consumo_mensual = consumo_mensual;
        this.stock_seguridad = stock_seguridad;
        this.stock_minimo = stock_minimo;
        this.descripcion = descripcion;
        this.fecha_ingreso = fecha_ingreso;
        this.identificacion_prod = identificacion_prod;
    }

    public int getId_productos() {
        return id_productos;
    }

    public void setId_productos(int id_productos) {
        this.id_productos = id_productos;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public int getLote_de_compra() {
        return lote_de_compra;
    }

    public void setLote_de_compra(int lote_de_compra) {
        this.lote_de_compra = lote_de_compra;
    }

    public int getConsumo_mensual() {
        return consumo_mensual;
    }

    public void setConsumo_mensual(int consumo_mensual) {
        this.consumo_mensual = consumo_mensual;
    }

    public int getStock_seguridad() {
        return stock_seguridad;
    }

    public void setStock_seguridad(int stock_seguridad) {
        this.stock_seguridad = stock_seguridad;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getIdentificacion_prod() {
        return identificacion_prod;
    }

    public void setIdentificacion_prod(int identificacion_prod) {
        this.identificacion_prod = identificacion_prod;
    }
}
