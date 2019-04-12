package com.jk.lj.model.tree;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 17:24$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 17:24$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Entity
@Table(name = "t_tree")
public class TreeBean implements Serializable {
    private static final long serialVersionUID = 5896887421779882193L;
    @Id
    @GeneratedValue
    private Integer id;
    private String text;
    private String href;
    private Integer pid;
    @Transient
    private List<TreeBean> nodes;
    @Transient
    private Boolean checked;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<TreeBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeBean> nodes) {
        this.nodes = nodes;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    @Override
    public String toString() {
        return "TreeBean{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", href='" + href + '\'' +
                ", pid=" + pid +
                ", nodes=" + nodes +
                ", checked=" + checked +
                '}';
    }
}
