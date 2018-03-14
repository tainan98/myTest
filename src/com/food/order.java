package com.food;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * order entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_order"
    ,catalog="food"
)

public class order  implements java.io.Serializable {


    // Fields    

     private Integer orderid;
     private customer customer;
     private food food;
     private Integer foodnum;
     private Double total;


    // Constructors

    /** default constructor */
    public order() {
    }

	/** minimal constructor */
    public order(food food) {
        this.food = food;
    }
    
    /** full constructor */
    public order(customer customer, food food, Integer foodnum, Double total) {
        this.customer = customer;
        this.food = food;
        this.foodnum = foodnum;
        this.total = total;
    }

   
    // Property accessors
    @GenericGenerator(name="generator", strategy="increment")@Id @GeneratedValue(generator="generator")
    
    @Column(name="orderid", unique=true, nullable=false)

    public Integer getOrderid() {
        return this.orderid;
    }
    
    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="customer")

    public customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(customer customer) {
        this.customer = customer;
    }
	@ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="food", nullable=false)

    public food getFood() {
        return this.food;
    }
    
    public void setFood(food food) {
        this.food = food;
    }
    
    @Column(name="foodnum")

    public Integer getFoodnum() {
        return this.foodnum;
    }
    
    public void setFoodnum(Integer foodnum) {
        this.foodnum = foodnum;
    }
    
    @Column(name="total", precision=22, scale=0)

    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
   








}