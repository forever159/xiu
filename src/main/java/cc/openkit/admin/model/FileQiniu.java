package cc.openkit.admin.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="kit_file_qiniu")
public class FileQiniu {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer fqId;

    private String fqAccesskey;

    private String fqSecretkey;

    private String fqBucket;


    public Integer getFqId() {
        return fqId;
    }

    public void setFqId(Integer fqId) {
        this.fqId = fqId;
    }

    public String getFqAccesskey() {
        return fqAccesskey;
    }

    public void setFqAccesskey(String fqAccesskey) {
        this.fqAccesskey = fqAccesskey == null ? null : fqAccesskey.trim();
    }

    public String getFqSecretkey() {
        return fqSecretkey;
    }

    public void setFqSecretkey(String fqSecretkey) {
        this.fqSecretkey = fqSecretkey == null ? null : fqSecretkey.trim();
    }

    public String getFqBucket() {
        return fqBucket;
    }

    public void setFqBucket(String fqBucket) {
        this.fqBucket = fqBucket == null ? null : fqBucket.trim();
    }
}