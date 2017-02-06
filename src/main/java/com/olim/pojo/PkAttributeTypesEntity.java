package com.olim.pojo;

import javax.persistence.*;

@Entity
@Table(name = "PK_ATTRIBUTE_TYPES", schema = "OLIM", catalog = "")
public class PkAttributeTypesEntity {
    private long attributeTypeId;
    private String name;

    @Id
    @Column(name = "ATTRIBUTE_TYPE_ID", nullable = false, precision = 0)
    public long getAttributeTypeId() {
        return attributeTypeId;
    }

    public void setAttributeTypeId(long attributeTypeId) {
        this.attributeTypeId = attributeTypeId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PkAttributeTypesEntity that = (PkAttributeTypesEntity) o;

        if (attributeTypeId != that.attributeTypeId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (attributeTypeId ^ (attributeTypeId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
