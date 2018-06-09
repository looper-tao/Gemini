package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "g_user_info")
@Setter
@Getter
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column(name = "name",length = 64)
    private String name;

    @Column(name = "password",length = 64)
    private String password;

    @Column(name = "mobile",length = 32)
    private String mobile;

    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private Sex sex;

    @Column(name = "id_card",length = 64)
    private String idCard;

    @Column(name = "diploma",length = 64)
    private String diploma;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "child_num")
    private Integer childNum;

    @Column(name = "province",length = 128)
    private String province;

    @Column(name = "permanent_address",length = 128)
    private String permanentAddress;

    @Column(name = "residence_time",length = 64)
    private String residenceTime;

    @Column(name = "qq")
    private String qq;

    @Column(name = "email",length = 64)
    private String email;

    @Column(name = "occupation",length = 64)
    private String occupation;

    @Column(name = "monthly_income",length = 64)
    private String monthlyIncome;

    @Column(name = "organization_name",length = 64)
    private String organizationName;

    @Column(name = "organization_province",length = 64)
    private String organizationProvince;

    @Column(name = "organization_address",length = 64)
    private String organizationAddress;

    @Column(name = "organization_telephone",length = 64)
    private String organizationTelephone;

    @Column(name = "creat_date")
    private Date createDate;


    /**
     * 性别枚举
     */
    public enum Sex{
        //男,女,未知
        MALE,FEMALE,UNKNOW
    }
}

