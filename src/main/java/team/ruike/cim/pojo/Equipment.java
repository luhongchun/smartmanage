package team.ruike.cim.pojo;


import java.io.Serializable;
import java.util.Date;

/**
 * 设备
 * @author 张振国
 * @version 1.0
 */
public class Equipment implements Serializable {

    private static final long serialVersionUID = 4233770308844199286L;
    /**
     * 设备id
     */
    private Integer equipmentId;
    /**
     * 所属生产线
     */
    private ProductionLine productionLine;
    /**
     * 所属工序
     */
    private Working working;
    /**
     * 负责人
     */
    private User user;
    /**
     * 启用时间
     */
    private Date startDate;
    /**
     * 设备状态
     */
    private EquipmentType equipmentType;
    /**
     *保养周期(天)
     */
    private Integer maintenanceCycle;
    /**
     * 检查周期(天)
     */
    private Integer inspectionCycle;
    /**
     * 设备名称
     */
    private String equipmentName;
    /**
     * 删除状态
     */
    private Integer status;


    public Integer getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    public ProductionLine getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(ProductionLine productionLine) {
        this.productionLine = productionLine;
    }

    public Working getWorking() {
        return working;
    }

    public void setWorking(Working working) {
        this.working = working;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Integer getMaintenanceCycle() {
        return maintenanceCycle;
    }

    public void setMaintenanceCycle(Integer maintenanceCycle) {
        this.maintenanceCycle = maintenanceCycle;
    }


    public Integer getInspectionCycle() {
        return inspectionCycle;
    }

    public void setInspectionCycle(Integer inspectionCycle) {
        this.inspectionCycle = inspectionCycle;
    }


    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
