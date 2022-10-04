public class User {
    private Integer id;
    private String name;
    private String address;
    private Work work;

    public User() {

    }

    public User(Integer id, String name, String address,Work work) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.work=work;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", work=" + work +
                '}';
    }
}
