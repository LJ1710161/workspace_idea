package com.jk.lj.model.book;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description: java类作用描述
 * @Author: 刘佳
 * @CreateDate: 2019/4/11$ 16:42$
 * @UpdateUser: 刘佳
 * @UpdateDate: 2019/4/11$ 16:42$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Entity
@Table(name = "t_book")
public class BookBean implements Serializable {
    private static final long serialVersionUID = 6025497881486522228L;
    @Id
    @GeneratedValue
    private  Integer bookId;
    private  String bookName;
    private  Double price;
    private  String author;
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd")
    private  Date createTime;
    private  Integer typeId;
    @Transient
    private  String typeName;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

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
        return "BookBean{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", createTime=" + createTime +
                ", typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
