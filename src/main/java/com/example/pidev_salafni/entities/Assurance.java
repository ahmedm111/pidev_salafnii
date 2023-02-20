package com.example.pidev_salafni.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="Assurance")
public class Assurance  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long ID;
    private String LoanerName;
    private Number AmountRefund;
    private String Status;
    private Number ExchangeRate;
    private Number FinalRefundAmount;

    @Override
    public String toString() {
        return "Assurance{" +
                "ID=" + ID +
                ", LoanerName='" + LoanerName + '\'' +
                ", AmountRefund=" + AmountRefund +
                ", Status='" + Status + '\'' +
                ", ExchangeRate=" + ExchangeRate +
                ", FinalRefundAmount=" + FinalRefundAmount +
                '}';
    }
}