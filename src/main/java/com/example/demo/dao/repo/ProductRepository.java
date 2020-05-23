package com.example.demo.dao.repo;

import com.example.demo.dao.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    public List<ProductEntity> findByProductNameLike(String keyword);

    @Query("SELECT entity from ProductEntity entity where entity.productName like :keyword")
    public List<ProductEntity> findByNameLike2(@Param("keyword") String keyword);

    @Query(value="select * from c_product t where t.productname like :keyword",nativeQuery=true)
    public List<ProductEntity> findByNameLikeRawSQL(@Param("keyword")String keyword);

    @Modifying
    @Query("update ProductEntity set productName = :productname where id = :id ")
    public void updateProductName(@Param("productname")String productname, @Param("id")Long id);

    @Query(value="select * from c_product t where t.id = :id",nativeQuery=true)
    public ProductEntity findByIdLikeRawSQL(@Param("id")Long productId);

    @Query(value="select * from c_product t where t.productname = :productname",nativeQuery=true)
    public ProductEntity findByNameUseRawSQL(@Param("productname")String productname);

    @Query(value="select t.productname from c_product t where t.id = :id",nativeQuery=true)
    public String findNameByIdLikeRawSQL(@Param("id")Long productId);

}
