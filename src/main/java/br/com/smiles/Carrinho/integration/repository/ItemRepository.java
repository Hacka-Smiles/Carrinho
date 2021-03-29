package br.com.smiles.Carrinho.integration.repository;

import br.com.smiles.Carrinho.integration.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity,String> {
}
