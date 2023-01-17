package domain.entities;

import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.Setter;
import domain.enums.ModelCategory;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.time.Year;

@Getter
@Setter
@Entity
@Table(name = "models")
public class Model extends BaseEntity {

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private ModelCategory category;

    @Column
    private String imageUrl;

    @Column
    private Year startYear;

    @Column
    private Year endYear;

    @CreationTimestamp
    private LocalDateTime created;

    @Timestamp
    private LocalDateTime modified;

    @ManyToOne
    private Brand brand;

}
