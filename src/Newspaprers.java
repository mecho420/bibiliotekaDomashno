 class Newspapers extends Edition{
    private String dateOfIssue;
    Newspapers(){
        setTitle("24 hours");
        setAvailable(true);
        setDateOfIssue("18 april 1991");
    }

    Newspapers(String title,boolean isAvailable,String dateOfIssue) {
        super(title,isAvailable);
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public String getDetails() {
        return "Name of the newspaper is " + getTitle() + " and the date of issue is " + dateOfIssue;
    }
    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

}
