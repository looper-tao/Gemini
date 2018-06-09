package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "g_transaction_record")
@Getter
@Setter
public class TransactionRecord implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;

    @ManyToOne
    private UserInfo userInfo;

    @Column(name = "loan_amount",nullable = false)
    private BigDecimal loanAmount;

    @Column(name = "loan_date",nullable = false)
    private Date loanDate;

    @Column(name = "repayment_date",nullable = false)
    private Date repaymentDate;

    @Column(name = "status")
    private String status;

    @Column(name = "be_overdue",nullable = false)
    private Integer beOverdue;

    @Column(name = "repayment_amount",nullable = false)
    private BigDecimal repaymentAmount;

    @Column(name = "total_amount",nullable = false)
    private BigDecimal totalAmount;

    @Column(name = "create_at")
    private Date createAt;

}
