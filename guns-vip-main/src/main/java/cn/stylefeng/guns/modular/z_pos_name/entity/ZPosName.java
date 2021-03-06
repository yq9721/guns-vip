package cn.stylefeng.guns.modular.z_pos_name.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * <p>
 * 职位名称表
 * </p>
 *
 * @author Hua
 * @since 2020-09-30
 */
@TableName("z_pos_name")
public class ZPosName implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
      @TableId(value = "pos_name_id", type = IdType.ID_WORKER)
    private Long posNameId;

    /**
     * 父id
     */
    @NotBlank
    @TableField("pid")
    private Long pid;

    /**
     * 职位名称
     */
    @NotBlank
    @TableField("name")
    private String name;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 创建时间
     */
      @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 更新时间
     */
      @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private Date updateTime;

    /**
     * 创建人
     */
      @TableField(value = "create_user", fill = FieldFill.INSERT)
    private Long createUser;

    /**
     * 更新人
     */
      @TableField(value = "update_user", fill = FieldFill.UPDATE)
    private Long updateUser;


    public Long getPosNameId() {
        return posNameId;
    }

    public void setPosNameId(Long posNameId) {
        this.posNameId = posNameId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return "ZPosName{" +
        "posNameId=" + posNameId +
        ", pid=" + pid +
        ", name=" + name +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", createUser=" + createUser +
        ", updateUser=" + updateUser +
        "}";
    }
}
