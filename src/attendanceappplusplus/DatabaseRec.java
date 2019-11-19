/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceappplusplus;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Ken
 */
@Entity
@Table(name = "database_rec", catalog = "attendancedatabase", schema = "")
@NamedQueries({
    @NamedQuery(name = "DatabaseRec.findAll", query = "SELECT d FROM DatabaseRec d")
    , @NamedQuery(name = "DatabaseRec.findByNo", query = "SELECT d FROM DatabaseRec d WHERE d.no = :no")
    , @NamedQuery(name = "DatabaseRec.findByFirstName", query = "SELECT d FROM DatabaseRec d WHERE d.firstName = :firstName")
    , @NamedQuery(name = "DatabaseRec.findByLastName", query = "SELECT d FROM DatabaseRec d WHERE d.lastName = :lastName")
    , @NamedQuery(name = "DatabaseRec.findByUsn", query = "SELECT d FROM DatabaseRec d WHERE d.usn = :usn")
    , @NamedQuery(name = "DatabaseRec.findByStatus", query = "SELECT d FROM DatabaseRec d WHERE d.status = :status")
    , @NamedQuery(name = "DatabaseRec.findByTime", query = "SELECT d FROM DatabaseRec d WHERE d.time = :time")})
public class DatabaseRec implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "No")
    private Integer no;
    @Basic(optional = false)
    @Column(name = "First Name")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "Last Name")
    private String lastName;
    @Column(name = "USN")
    private BigInteger usn;
    @Column(name = "Status")
    private String status;
    @Basic(optional = false)
    @Column(name = "Time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    public DatabaseRec() {
    }

    public DatabaseRec(Integer no) {
        this.no = no;
    }

    public DatabaseRec(Integer no, String firstName, String lastName, Date time) {
        this.no = no;
        this.firstName = firstName;
        this.lastName = lastName;
        this.time = time;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        Integer oldNo = this.no;
        this.no = no;
        changeSupport.firePropertyChange("no", oldNo, no);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public BigInteger getUsn() {
        return usn;
    }

    public void setUsn(BigInteger usn) {
        BigInteger oldUsn = this.usn;
        this.usn = usn;
        changeSupport.firePropertyChange("usn", oldUsn, usn);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        Date oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DatabaseRec)) {
            return false;
        }
        DatabaseRec other = (DatabaseRec) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "attendanceappplusplus.DatabaseRec[ no=" + no + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

