package Project.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "phi")
public class  phidetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String nic;
    private String phidivision;
    private String phoneno;
    private String password;

    private List <users> users;

    @OneToMany(targetEntity = users.class, cascade = CascadeType.ALL)
    public List<users> getUsers() {
        return users;
    }

    public void setUsers(List<users> users) {
        this.users = users;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "nic")
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    @Basic
    @Column(name = "phi_division")
    public String getPhidivision() {
        return phidivision;
    }

    public void setPhidivision(String phidivision) {
        this.phidivision = phidivision;
    }

    @Basic
    @Column(name = "Phone_Number")
    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        phidetails that = (phidetails) o;

        if (id != that.id) return false;
        if (nic != null ? !nic.equals(that.nic) : that.nic != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (phidivision != null ? !phidivision.equals(that.phidivision) : that.phidivision != null)
            return false;
        if (phoneno != null ? !phoneno.equals(that.phoneno) : that.phoneno != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nic != null ? nic.hashCode() : 0);
        result = 31 * result + (phidivision != null ? phidivision.hashCode() : 0);
        result = 31 * result + (phoneno != null ? phoneno.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }
}
