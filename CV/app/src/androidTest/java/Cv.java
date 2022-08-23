public class Cv {
     private String name;
     private int number;
     private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public int getPhoto1() {
        return photo1;
    }

    public void setPhoto1(int photo1) {
        this.photo1 = photo1;
    }

    private String job;
    private String path;

    public Cv(String name, int number, int age, String job, String path, String uri, int photo1) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.job = job;
        this.path = path;
        this.uri = uri;
        this.photo1 = photo1;
    }

    private String uri;
 private int  photo1;

}
