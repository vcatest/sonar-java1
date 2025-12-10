package com.example;

import javax.persistence.*;

public class JpaEagerFetchTypeCheck {

    @Entity
    @Table(name = "orders")
    public static class Order {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // Noncompliant
        @OneToMany(mappedBy = "order", eager = true)
        private java.util.List<OrderItem> orderItems;

        private String customerName;

        // Getters and setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public java.util.List<OrderItem> getOrderItems() {
            return orderItems;
        }

        public void setOrderItems(java.util.List<OrderItem> orderItems) {
            this.orderItems = orderItems;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }
    }

    @Entity
    @Table(name = "order_items")
    public static class OrderItem {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "order_id")
        private Order order;

        private String itemName;

        // Noncompliant
        @OneToMany(mappedBy = "orderItem", eager = true)
        private java.util.List<OrderItemDetail> orderItemDetails;

        // Getters and setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Order getOrder() {
            return order;
        }

        public void setOrder(Order order) {
            this.order = order;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public java.util.List<OrderItemDetail> getOrderItemDetails() {
            return orderItemDetails;
        }

        public void setOrderItemDetails(java.util.List<OrderItemDetail> orderItemDetails) {
            this.orderItemDetails = orderItemDetails;
        }
    }

    @Entity
    @Table(name = "order_item_details")
    public static class OrderItemDetail {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "order_item_id")
        private OrderItem orderItem;

        private String detail;

        // Getters and setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public OrderItem getOrderItem() {
            return orderItem;
        }

        public void setOrderItem(OrderItem orderItem) {
            this.orderItem = orderItem;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }
    }

    @Entity
    @Table(name = "customers")
    public static class Customer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // Compliant
        @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
        private java.util.List<Order> orders;

        private String name;

        // Getters and setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public java.util.List<Order> getOrders() {
            return orders;
        }

        public void setOrders(java.util.List<Order> orders) {
            this.orders = orders;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Entity
    @Table(name = "products")
    public static class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // Compliant
        @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
        private java.util.List<OrderItem> orderItems;

        private String name;

        // Getters and setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public java.util.List<OrderItem> getOrderItems() {
            return orderItems;
        }

        public void setOrderItems(java.util.List<OrderItem> orderItems) {
            this.orderItems = orderItems;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
