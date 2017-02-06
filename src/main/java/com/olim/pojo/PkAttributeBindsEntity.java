package com.olim.pojo;

import javax.persistence.*;


@Entity
@Table(name = "PK_ATTRIBUTE_BINDS", schema = "OLIM", catalog = "")
public class PkAttributeBindsEntity {
    private long attributeBindsId;
    private String description;

    @Id
    @Column(name = "ATTRIBUTE_BINDS_ID", nullable = false, precision = 0)
    public long getAttributeBindsId() {
        return attributeBindsId;
    }

    public void setAttributeBindsId(long attributeBindsId) {
        this.attributeBindsId = attributeBindsId;
    }

    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PkAttributeBindsEntity that = (PkAttributeBindsEntity) o;

        if (attributeBindsId != that.attributeBindsId) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (attributeBindsId ^ (attributeBindsId >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
