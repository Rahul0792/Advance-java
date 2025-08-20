import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@ToString

public class Course {
    private  int id;
    private   String name;
    private   int price;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Course{id=" + id + ", name='" + name + "', price=" + price + "}";
    }
}
