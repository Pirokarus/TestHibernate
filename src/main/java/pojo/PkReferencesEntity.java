package pojo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by Олимджон on 17.01.2017.
 */
@Entity
@Table(name = "PK_REFERENCES", schema = "OLIM", catalog = "")
public class PkReferencesEntity {
    private PkObjectsEntity pkObjectsByObjectId;
    private PkAttributesEntity pkAttributesByAttributeId;
    private PkObjectsEntity pkObjectsByReferenceId;

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
