package com.olim.pojo;

import javax.persistence.*;

@Entity
@Table(name = "PK_ATTRIBUTES", schema = "OLIM", catalog = "")
public class PkAttributesEntity {
    private long attributeId;
    private String name;
    private String details;
    private Boolean ismutible;
    private PkAttributeTypesEntity pkAttributeTypesByAttributeTypeId;

    @Id
    @Column(name = "ATTRIBUTE_ID", nullable = false, precision = 0)
    public long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(long attributeId) {
        this.attributeId = attributeId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DETAILS", nullable = true, length = 255)
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "ISMUTIBLE", nullable = true, precision = 0)
    public Boolean getIsmutible() {
        return ismutible;
    }

    public void setIsmutible(Boolean ismutible) {
        this.ismutible = ismutible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PkAttributesEntity that = (PkAttributesEntity) o;

        if (attributeId != that.attributeId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (details != null ? !details.equals(that.details) : that.details != null) return false;
        if (ismutible != null ? !ismutible.equals(that.ismutible) : that.ismutible != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (attributeId ^ (attributeId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (ismutible != null ? ismutible.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ATTRIBUTE_TYPE_ID", referencedColumnName = "ATTRIBUTE_TYPE_ID", nullable = false)
    public PkAttributeTypesEntity getPkAttributeTypesByAttributeTypeId() {
        return pkAttributeTypesByAttributeTypeId;
    }

    public void setPkAttributeTypesByAttributeTypeId(PkAttributeTypesEntity pkAttributeTypesByAttributeTypeId) {
        this.pkAttributeTypesByAttributeTypeId = pkAttributeTypesByAttributeTypeId;
    }
}
