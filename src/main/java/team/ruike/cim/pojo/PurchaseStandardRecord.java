package team.ruike.cim.pojo;


import java.io.Serializable;

/**
 * 采购品控评估记录类
 *
 * @author 王傲祥
 * @version 1.0
 */
public class PurchaseStandardRecord implements Serializable {

    private static final long serialVersionUID = -668236938594625481L;
    /**
     * 采购品控评估记录ID
     */
    private Integer purchaseStandardRecordId;
    /**
     * 标准
    private PurchaseStandard purchaseStandard;
     */

    /**
     * 采购表外键
     */
    private Purchase purchase;


    /**
     * 物料表外键
     */
    private Materiel materiel;


     /**
     * 标准a评分
     */
    private Integer standardAScore;
    /**
     * 标准b评分
     */
    private Integer standardBScore;
    /**
     * 标准c评分
     */
    private Integer standardCScore;
    /**
     * 结论
     */
    private String conclusion;
    /**
     * 删除状态
     */
    private Integer status;

    public Purchase getPurchase() {

        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }

    public Integer getPurchaseStandardRecordId() {
        return purchaseStandardRecordId;
    }

    public void setPurchaseStandardRecordId(Integer purchaseStandardRecordId) {
        this.purchaseStandardRecordId = purchaseStandardRecordId;
    }

    public Integer getStandardAScore() {
        return standardAScore;
    }

    public void setStandardAScore(Integer standardAScore) {
        this.standardAScore = standardAScore;
    }


    public Integer getStandardBScore() {
        return standardBScore;
    }

    public void setStandardBScore(Integer standardBScore) {
        this.standardBScore = standardBScore;
    }


    public Integer getStandardCScore() {
        return standardCScore;
    }

    public void setStandardCScore(Integer standardCScore) {
        this.standardCScore = standardCScore;
    }


    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

/*
    public PurchaseStandard getPurchaseStandard() {
        return purchaseStandard;
    }

    public void setPurchaseStandard(PurchaseStandard purchaseStandard) {
        this.purchaseStandard = purchaseStandard;
    }
*/

}
