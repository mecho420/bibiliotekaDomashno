import java.util.List;

public class Library {
    private String name;
    private String address;
    private String workTime;
    private List<Edition> editions;

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

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }
    public void search(Edition edition){
        for (int i = 0; i < editions.size(); i++) {
            if (edition.getTitle().equals(editions.get(i).getTitle())){
                System.out.println("You found and booked the edition. The book is yours");
            }
        }
    }
    Library(String name, String address, String workTime, List<Edition> editions) {
        this.name = name;
        this.address = address;
        this.workTime = workTime;
        this.editions = editions;
    }
}
