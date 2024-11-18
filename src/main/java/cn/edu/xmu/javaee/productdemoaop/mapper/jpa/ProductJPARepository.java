
package cn.edu.xmu.javaee.productdemoaop.mapper.jpa;

import cn.edu.xmu.javaee.productdemoaop.mapper.jpa.po.ProductPoJPA;
import org.apache.ibatis.annotations.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;



import org.springframework.data.jpa.repository.Query;
@Repository
public interface ProductJPARepository extends  JpaRepository<ProductPoJPA,Long> {

    List<ProductPoJPA> findByName(String Name);

    List<ProductPoJPA> findOtherProductsByGoodsId(Long goodsId,Long id);

}
