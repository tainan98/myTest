package com.food;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 * food entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_food"
    ,catalog="food"
)

public class food  implements java.io.Serializable {


    // Fields    

     private Integer foodid;
     private String foodname;
     private Double unitprice;
     private String filepath;
     private Set<order> orders = new HashSet<order>(0);
     private Set<order> orders_1 = new HashSet<order>(0);


    // Constructors

    /** default constructor */
    public food() {
    }

	/** minimal constructor */
    public food(String filepath) {
        this.filepath = filepath;
    }
    
    /** full constructor */
    public food(String foodname, Double unitprice, String filepath, Set<order> orders, Set<order> orders_1) {
        this.foodname = foodname;
        this.unitprice = unitprice;
        this.filepath = filepath;
        this.orders = orders;
        this.orders_1 = orders_1;
    }

   
    // Property accessors
    @GenericGenerator(name="generator", strategy="increment")@Id @GeneratedValue(generator="generator")
    
    @Column(name="foodid", unique=true, nullable=false)

    public Integer getFoodid() {
        return this.foodid;
    }
    
    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }
    
    @Column(name="foodname", length=40)

    public String getFoodname() {
        return this.foodname;
    }
    
    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }
    
    @Column(name="unitprice", precision=22, scale=0)

    public Double getUnitprice() {
        return this.unitprice;
    }
    
    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }
    
    @Column(name="filepath", nullable=false, length=100)

    public String getFilepath() {
        return this.filepath;
    }
    
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="food")

    public Set<order> getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set<order> orders) {
        this.orders = orders;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="food")

    public Set<order> getOrders_1() {
        return this.orders_1;
    }
    
    public void setOrders_1(Set<order> orders_1) {
        this.orders_1 = orders_1;
    }
   








}