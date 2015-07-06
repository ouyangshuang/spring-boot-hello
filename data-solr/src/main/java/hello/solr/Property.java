package hello.solr;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.io.Serializable;

/**
 * @author ouyang
 * @since 2015-07-06 10:14
 */
@SolrDocument(solrCoreName = "collection1")
public class Property implements Serializable {

    @Id
    @Field
    private String propertyId;

    @Field
    private String estateName;

    @Field
    private String address;

    @Field
    private String roomNo;


    public Property(String propertyId, String estateName, String address, String roomNo) {
        this.propertyId = propertyId;
        this.estateName = estateName;
        this.address = address;
        this.roomNo = roomNo;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getEstateName() {
        return estateName;
    }

    public void setEstateName(String estateName) {
        this.estateName = estateName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
}
