package domain.entities;

import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.Setter;
import domain.enums.Engine;
import domain.enums.Transmission;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;

@Getter
@Setter
@Entity
@Table(name = "offers")
public class Offer extends BaseEntity {

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    private Engine engine;

    @Column
    private String imageUrl;

    @Column
    private Integer mileage;

    @Column
    private BigDecimal price;

    @Enumerated
    private Transmission transmissionType;

    @Column
    private Year vehicleManufacturedYear;

    @ManyToOne
    private Model model;

    @ManyToOne
    private User user;

    @CreationTimestamp
    private LocalDateTime dateOfferCreated;

    @Timestamp
    private LocalDateTime dateOfferModified;


}
