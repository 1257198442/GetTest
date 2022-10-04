public class Company {
    private String addressCompany;
    private Integer idCompany;
    private String nameCompany;


    public Company() {
    }

    public Company(String addressCompany, Integer idCompany, String nameCompany) {
        this.addressCompany = addressCompany;
        this.idCompany = idCompany;
        this.nameCompany = nameCompany;
    }

    public String getAddressCompany() {
        return addressCompany;
    }

    public void setAddressCompany(String addressCompany) {
        this.addressCompany = addressCompany;
    }

    public Integer getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Integer idCompany) {
        this.idCompany = idCompany;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    @Override
    public String toString() {
        return "Company{" +
                "addressCompany='" + addressCompany + '\'' +
                ", idCompany=" + idCompany +
                ", nameCompany='" + nameCompany + '\'' +
                '}';
    }
}
