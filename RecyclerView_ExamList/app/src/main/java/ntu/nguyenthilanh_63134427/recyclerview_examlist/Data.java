package ntu.nguyenthilanh_63134427.recyclerview_examlist;

public class Data {
    String name;
    String date;
    String message;

    Data(String name,
             String date,
             String message)
    {
        this.name = name;
        this.date = date;
        this.message = message;
    }
    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getMassage() {
        return message;
    }
}