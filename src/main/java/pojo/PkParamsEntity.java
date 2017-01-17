package pojo;

import javax.persistence.*;

/**
 * Created by Олимджон on 17.01.2017.
 */
@Entity
@Table(name = "PK_PARAMS", schema = "OLIM", catalog = "")
public class PkParamsEntity {
    private String textValue;
    private Long numberValue;
    private PkObjectsEntity pkObjectsByObjectId;
    private PkAttributesEntity pkAttributesByAttributeId;

    @Basic
    @Column(name = "TEXT_VALUE", nullable = true, length = 255)
    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    @Basic
    @Column(name = "NUMBER_VALUE", nullable = true, precision = 0)
    public Long getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(Long numberValue) {
        this.numberValue = numberValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PkParamsEntity that = (PkParamsEntity) o;

        if (textValue != null ? !textValue.equals(that.textValue) : that.textValue != null) return false;
        if (numberValue != null ? !numberValue.equals(that.numberValue) : that.numberValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = textValue != null ? textValue.hashCode() : 0;
        result = 31 * result + (numberValue != null ? numberValue.hashCode() : 0);
        return result;
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
}
