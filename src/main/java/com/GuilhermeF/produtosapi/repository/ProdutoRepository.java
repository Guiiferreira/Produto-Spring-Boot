package com.GuilhermeF.produtosapi.repository;

import com.GuilhermeF.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
