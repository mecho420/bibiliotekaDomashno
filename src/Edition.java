public abstract class Edition implements Publicationable{
    private String title;
    private boolean isAvailable;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    @Override
    public void book() {
        isAvailable = false;
        System.out.println("It is already booked!");
    }

    @Override
    public void returnToLibrary() {
        isAvailable = true;
        System.out.println("You can book!");
    }
    Edition(){
        title = "Percy Jackson";
        isAvailable = false;
    }
    Edition(String title,boolean isAvailable) {
        this.title = title;
        this.isAvailable = isAvailable;
    }
    public abstract String getDetails();
}
