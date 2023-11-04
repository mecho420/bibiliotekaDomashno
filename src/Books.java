public class Books extends Edition{
    private String author;
    private int yearOfIssue;
    @Override
    public String getDetails() {
        return "Name of the book is " + getTitle() + " and the author's name is " + author + ".The year of issue is " + yearOfIssue;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    Books(){
        setTitle("Pod Igoto");
        setAuthor("Ivan Vazov");
        setYearOfIssue(1887);
    }
    Books(String title,boolean isAvailable, String author, int yearOfIssue) {
        super(title,isAvailable);
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }
}

