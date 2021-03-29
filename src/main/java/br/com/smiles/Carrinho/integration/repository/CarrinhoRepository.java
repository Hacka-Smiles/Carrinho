package br.com.smiles.Carrinho.integration.repository;

import br.com.smiles.Carrinho.integration.entity.CarrinhoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<CarrinhoRepository,String> {
    CarrinhoEntity findBy
}
