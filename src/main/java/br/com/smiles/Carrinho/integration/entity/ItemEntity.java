package br.com.smiles.Carrinho.integration.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemEntity {

    @Id
    @NotNull
    private String idItem;

    @NotNull
    private int quantidade;

    @NotNull
    private BigInteger preco;
}
