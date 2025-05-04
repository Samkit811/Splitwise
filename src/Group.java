import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<User> userList;
    private String name;
    private Integer id;

    public Group(String name, Integer id){
        this.name = name;
        this.id = id;
        this.userList = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addUser(User user){
        System.out.println("User: " + user.getName() + " is added in the group: " + this.name);
        this.userList.add(user);
    }
}
