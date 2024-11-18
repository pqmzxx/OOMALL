package cn.edu.xmu.javaee.productdemoaop.mapper.jpa.po;

import cn.edu.xmu.javaee.productdemoaop.mapper.generator.po.OnSalePo;
import cn.edu.xmu.javaee.productdemoaop.mapper.generator.po.ProductPo;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "goods_product")
public class ProductPoJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="goods_id")
    private Long goodsId;

    @OneToMany(mappedBy =  "parentProduct",fetch = FetchType.LAZY)
    private List<ProductPoJPA> otherProduct;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goods_id", insertable = false,updatable = false)
    private ProductPoJPA parentProduct;

    @OneToMany(mappedBy = "product",cascade =CascadeType.ALL,fetch =FetchType.LAZY)
    private List<OnSalePoJPA> onSaleList;


    private String skuSn;

    private String name;

    private Long originalPrice;

    private Long weight;

    private String barcode;

    private String unit;

    private String originPlace;

    private Long creatorId;

    private String creatorName;

    private Long modifierId;

    private String modifierName;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    private Integer commissionRatio;

    private Long freeThreshold;

    private Byte status;
}

