package pojo;

import javax.persistence.*;

/**
 * Created by Олимджон on 17.01.2017.
 */
@Entity
@Table(name = "PK_OBJECT_TYPES", schema = "OLIM", catalog = "")
public class PkObjectTypesEntity {
    private long objectTypeId;
    private String name;
    private String discription;
    private PkObjectTypesEntity pkObjectTypesByParentTypeId;

    @Id
    @Column(name = "OBJECT_TYPE_ID", nullable = false, precision = 0)
    public long getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(long objectTypeId) {
        this.objectTypeId = objectTypeId;
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
    @Column(name = "DISCRIPTION", nullable = true, length = 255)
    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PkObjectTypesEntity that = (PkObjectTypesEntity) o;

        if (objectTypeId != that.objectTypeId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (discription != null ? !discription.equals(that.discription) : that.discription != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (objectTypeId ^ (objectTypeId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (discription != null ? discription.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "OBJECT_TYPE_ID")
    public PkObjectTypesEntity getPkObjectTypesByParentTypeId() {
        return pkObjectTypesByParentTypeId;
    }

    public void setPkObjectTypesByParentTypeId(PkObjectTypesEntity pkObjectTypesByParentTypeId) {
        this.pkObjectTypesByParentTypeId = pkObjectTypesByParentTypeId;
    }
}
