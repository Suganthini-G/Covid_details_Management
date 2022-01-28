package Project.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;


@Entity
@Table(name = "coviddetails")
public class coviddetails implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String totalcases;
    private String totaldeaths;
    private String totalrecovered;
    private Date date;

    private List<phidetails> phi;

    @ManyToMany
    public List<phidetails> getPhi() {
        return phi;
    }

    public void setPhi(List<phidetails> phi) {
        this.phi = phi;
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
    @Column(name = "Totalcases")
    public String getTotalcases() {
        return totalcases;
    }

    public void setTotalcases(String totalcases) {
        this.totalcases = totalcases;
    }

    @Basic
    @Column(name = "TotalDeaths")
    public String getTotaldeaths() {
        return totaldeaths;
    }

    public void setTotaldeaths(String totaldeaths) {
        this.totaldeaths = totaldeaths;
    }

    @Basic
    @Column(name = "TotalRecovered")
    public String getTotalrecovered() {
        return totalrecovered;
    }

    public void setTotalrecovered(String totalrecovered) {
        this.totalrecovered = totalrecovered;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        coviddetails that = (coviddetails) o;

        if (id != that.id) return false;
        if (totalcases != null ? !totalcases.equals(that.totalcases) : that.totalcases != null)
            return false;
        if (totalrecovered != null ? !totalrecovered.equals(that.totalrecovered) : that.totalrecovered != null)
            return false;
        if (totaldeaths != null ? !totaldeaths.equals(that.totaldeaths) : that.totaldeaths != null)
            return false;
        if (date != null ? !date.equals(that.date) : that.date != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (totalcases != null ? totalcases.hashCode() : 0);
        result = 31 * result + (totalrecovered != null ? totalrecovered.hashCode() : 0);
        result = 31 * result + (totaldeaths != null ? totaldeaths.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
