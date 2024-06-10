package com.example.eracertificate.BasicCertificates;


public class basic
{
    
    private String name;
    private String course;
    private String strating_date;
    private String ending_date;
    private String date_of_issue;
    private boolean certificate_status;

    
    public boolean isCertificate_status() {
        return certificate_status;
    }


    public void setCertificate_status(boolean certificate_status) {
        this.certificate_status = certificate_status;
    }


    public basic() 
    {
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getStrating_date() {
        return strating_date;
    }
    public void setStrating_date(String strating_date) {
        this.strating_date = strating_date;
    }
    public String getEnding_date() {
        return ending_date;
    }
    public void setEnding_date(String ending_date) {
        this.ending_date = ending_date;
    }
    public String getDate_of_issue() {
        return date_of_issue;
    }
    public void setDate_of_issue(String date_of_issue) {
        this.date_of_issue = date_of_issue;
    }


    @Override
    public String toString() {
        return "basic [name=" + name + ", course=" + course + ", strating_date=" + strating_date + ", ending_date="
                + ending_date + ", date_of_issue=" + date_of_issue + ", certificate_status=" + certificate_status + "]";
    }


    

}
