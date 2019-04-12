package com.jk.lj.model.book;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 16:49$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 16:49$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Entity
@Table(name = "t_book_type")
public class BookTypeBean implements Serializable {
    private static final long serialVersionUID = 4029609467307152869L;
    @Id
    @GeneratedValue
    private  Integer typeId;
    private  String typeName;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "BookTypeBean{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
