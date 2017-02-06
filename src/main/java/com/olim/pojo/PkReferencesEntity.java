package com.olim.pojo;

import javax.persistence.*;


@Entity
@Table(name = "PK_REFERENCES", schema = "OLIM", catalog = "")
public class PkReferencesEntity {
    private long referencesId;
    private PkObjectsEntity pkObjectsByObjectId;
    private PkAttributesEntity pkAttributesByAttributeId;
    private PkObjectsEntity pkObjectsByReferenceId;

    @Id
    @Column(name = "REFERENCES_ID", nullable = false, precision = 0)
    public long getReferencesId() {
        return referencesId;
    }

    public void setReferencesId(long referencesId) {
        this.referencesId = referencesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PkReferencesEntity that = (PkReferencesEntity) o;

        if (referencesId != that.referencesId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (referencesId ^ (referencesId >>> 32));
    }

    @ManyToOne
    @JoinColumn(name = "OBJECT_ID", referencedColumnName = "OBJECT_ID", nullable = false)
    public PkObjectsEntity getPkObjectsByObjectId() {
        return pkObjectsByObjectId;
    }

    public void setPkObjectsByObjectId(PkObjectsEntity pkObjectsByObjectId) {
        this.pkObjectsByObjectId = pkObjectsByObjectId;
    }

    @ManyToOne
    @JoinColumn(name = "ATTRIBUTE_ID", referencedColumnName = "ATTRIBUTE_ID", nullable = false)
    public PkAttributesEntity getPkAttributesByAttributeId() {
        return pkAttributesByAttributeId;
    }

    public void setPkAttributesByAttributeId(PkAttributesEntity pkAttributesByAttributeId) {
        this.pkAttributesByAttributeId = pkAttributesByAttributeId;
    }

    @ManyToOne
    @JoinColumn(name = "REFERENCE_ID", referencedColumnName = "OBJECT_ID", nullable = false)
    public PkObjectsEntity getPkObjectsByReferenceId() {
        return pkObjectsByReferenceId;
    }

    public void setPkObjectsByReferenceId(PkObjectsEntity pkObjectsByReferenceId) {
        this.pkObjectsByReferenceId = pkObjectsByReferenceId;
    }
}
