public class Database{

    private String name;

    // instance of the class
    private static Database instance;

    // constructor must be private so that no instances can be created outside the class
    private Database(String name){
        this.name = name;
    }

    

    // instead of the constructor, use the getInstance method to ensure that only one instance will be created
    public Database getInstance(String name){
        if (instance == null){
            instance = new Database(name);
        }

        return instance;
    }



    public String getName(){
        return this.name;
    }
}