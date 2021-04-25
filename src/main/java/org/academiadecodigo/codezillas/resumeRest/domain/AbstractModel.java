package org.academiadecodigo.codezillas.resumeRest.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class AbstractModel implements Model{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonIgnore
    @Version
    private Integer version;

    @JsonIgnore
    @CreationTimestamp
    private Date creationTime;

    @JsonIgnore
    @UpdateTimestamp
    private Date updateTime;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "AbstractModel{" +
                "id=" + id +
                ", version=" + version +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
