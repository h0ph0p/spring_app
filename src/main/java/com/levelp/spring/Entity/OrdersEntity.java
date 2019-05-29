package com.levelp.spring.Entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "orders", schema = "public", catalog = "prac")
public class OrdersEntity {
    private int id;
    private Integer quantity;
    private Double cost;
    private GoodsEntity goodsByOrderId;
    private TotalOrdersEntity totalOrdersByOrderId;

    @Id
    @GenericGenerator(name="keygen", strategy = "increment")
    @GeneratedValue(generator = "keygen")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "quantity", nullable = true)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "cost", nullable = true, precision = 0)
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (id != that.id) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) id;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", nullable = false)
    public TotalOrdersEntity getTotalOrdersByOrderId() {
        return totalOrdersByOrderId;
    }

    public void setTotalOrdersByOrderId(TotalOrdersEntity totalOrdersByOrderId) {
        this.totalOrdersByOrderId = totalOrdersByOrderId;
    }

    @OneToOne
    @JoinColumn(name = "goods_id", referencedColumnName = "id", nullable = false)
    public GoodsEntity getGoodsByOrderId() { return goodsByOrderId; }

    public void setGoodsByOrderId(GoodsEntity goodsByOrderId) {
        this.goodsByOrderId = goodsByOrderId;
    }
}
