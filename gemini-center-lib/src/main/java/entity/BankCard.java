package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "g_bank_card")
@Getter
@Setter
public class BankCard implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;

    @ManyToOne
    private UserInfo userInfo;

    @Column(name = "card_number",nullable = false,length = 64)
    private String cardNumber;

    @Column(name = "deposit_bank",nullable = false,length = 128)
    private String depositBank;

    @Column(name = "mobile",nullable = false,length = 64)
    private String mobile;

    @Column(name = "create_at")
    private Date createAt;


}
