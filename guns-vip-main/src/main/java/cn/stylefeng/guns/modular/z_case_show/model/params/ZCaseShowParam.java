package cn.stylefeng.guns.modular.z_case_show.model.params;

import lombok.Data;
import cn.stylefeng.roses.kernel.model.validator.BaseValidatingParam;
import java.util.Date;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 案例展示表
 * </p>
 *
 * @author Hua
 * @since 2020-09-29
 */
@Data
public class ZCaseShowParam implements Serializable, BaseValidatingParam {

    private static final long serialVersionUID = 1L;


    /**
     * 主键id
     */
    private Long caseShowId;

    /**
     * 图片地址
     */
    private String picAddress;

    /**
     * 标题
     */
    private String title;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private Long createUser;

    /**
     * 更新人
     */
    private Long updateUser;

    @Override
    public String checkParam() {
        return null;
    }

}
