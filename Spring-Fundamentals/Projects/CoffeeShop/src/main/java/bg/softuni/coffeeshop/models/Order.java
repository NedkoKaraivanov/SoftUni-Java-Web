package bg.softuni.coffeeshop.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "order_time", nullable = false)
    private LocalDateTime orderTime;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne(optional = false)
    private Category category;

    @ManyToOne()
    private User employee;

    public String getName() {
        return name;
    }

    public Order setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Order setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public Order setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Order setDescription(String description) {
        this.description = description;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Order setCategory(Category category) {
        this.category = category;
        return this;
    }

    public User getEmployee() {
        return employee;
    }

    public Order setEmployee(User employee) {
        this.employee = employee;
        return this;
    }
}
