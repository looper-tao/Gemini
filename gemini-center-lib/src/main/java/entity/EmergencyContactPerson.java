package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "g_emergency_contact_person")
@Getter
@Setter
public class EmergencyContactPerson implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;

    @ManyToOne
    private UserInfo userInfo;

    @Column(name = "name")
    private String name;

    @Column(name = "relationship",nullable = false)
    private String relationship;

    @Column(name = "mobile",nullable = false)
    private String mobile;

    @Column(name = "create_at")
    private Date createAt;
}
