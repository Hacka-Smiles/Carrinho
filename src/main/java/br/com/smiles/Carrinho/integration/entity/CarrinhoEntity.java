package br.com.smiles.Carrinho.integration.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CarrinhoPK.class)
public class CarrinhoEntity {

    @Id
    @NotNull
    private String idCarrinho;

    @Id
    @NotNull
    private String idCliente;

    @NotNull
    private ItemEntity[] item;
}
