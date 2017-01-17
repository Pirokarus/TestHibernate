package pojo;

import javax.persistence.*;

/**
 * Created by Олимджон on 17.01.2017.
 */
@Entity
@Table(name = "PK_OBJECTS", schema = "OLIM", catalog = "")
public class PkObjectsEntity {
    private long objectId;
    private String name;
    private String discription;
    private PkObjectTypesEntity pkObjectTypesByObjectTypeId;
    private PkObjectsEntity pkObjectsByContainerId;

    @Id
    @Column(name = "OBJECT_ID", nullable = false, precision = 0)
    public long getObjectId() {
        return objectId;
    }

    public void setObjectId(long objectId) {
        this.objectId = objectId;
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

        PkObjectsEntity that = (PkObjectsEntity) o;

        if (objectId != that.objectId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (discription != null ? !discription.equals(that.discription) : that.discription != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (objectId ^ (objectId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (discription != null ? discription.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "OBJECT_TYPE_ID", referencedColumnName = "OBJECT_TYPE_ID", nullable = false)
    public PkObjectTypesEntity getPkObjectTypesByObjectTypeId() {
        return pkObjectTypesByObjectTypeId;
    }

    public void setPkObjectTypesByObjectTypeId(PkObjectTypesEntity pkObjectTypesByObjectTypeId) {
        this.pkObjectTypesByObjectTypeId = pkObjectTypesByObjectTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "CONTAINER_ID", referencedColumnName = "OBJECT_ID")
    public PkObjectsEntity getPkObjectsByContainerId() {
        return pkObjectsByContainerId;
    }

    public void setPkObjectsByContainerId(PkObjectsEntity pkObjectsByContainerId) {
        this.pkObjectsByContainerId = pkObjectsByContainerId;
    }
}
