package team.ruike.cim.service;

import team.ruike.cim.pojo.EverydayPurchasingPlan;
import team.ruike.cim.pojo.Purchase;
import team.ruike.cim.pojo.StagePurchasingPlan;
import team.ruike.cim.pojo.StagePurchasingPlanTerm;
import team.ruike.cim.util.Pager;

import java.util.List;

/**
 * 采购业务接口
 * @author 张振国
 * @version 1.0
 */
public interface PurchaseService {
    /**
     * 获取周期采购计划集合
     *
     * @param stagePurchasingPlan 计划对象（参数）
     * @param pager               分页辅助类
     */
    void getStagePurchasingPlans(StagePurchasingPlan stagePurchasingPlan, Pager<StagePurchasingPlan> pager);

    /**
     * 获取周期计划详细信息
     *
     * @param stagePurchasingPlanId 计划id
     * @return 周期计划对象
     */
    StagePurchasingPlan getStagePurchasingPlan(Integer stagePurchasingPlanId);

    /**
     * 修改计划信息
     *
     * @param stagePurchasingPlan 计划id
     * @param items               计划项集合
     */
    void updateStagePurchasingPlan(StagePurchasingPlan stagePurchasingPlan, List<StagePurchasingPlanTerm> items);

    /**
     * 获取所有采购列表
     *
     * @param purchase 采购对象（参数）
     * @param pager    分页辅助类
     */
    void getPurchase(Purchase purchase, Pager<Purchase> pager);

    /**
     * 新增周期采购计划
     *
     * @param stagePurchasingPlan 采购计划对象
     */
    void addStagePurchasingPlan(StagePurchasingPlan stagePurchasingPlan);

    /**
     * 删除周期采购计划
     *
     * @param stagePurchasingPlanId 计划id
     */
    void delStagePurchasingPlan(Integer stagePurchasingPlanId);

    /**
     * 获取每日采购计划列表
     *
     * @param everydayPurchasingPlan 每日采购计划对象（参数）
     * @param pager                  分页辅助类
     */
    void getEverydayPurchasePlans(EverydayPurchasingPlan everydayPurchasingPlan, Pager<EverydayPurchasingPlan> pager);
}
