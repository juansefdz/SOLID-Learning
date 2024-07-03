package exercises.databaseSolid;

public class DataService {

    private DataStorage dataStorage;

    public DataService (DataService dataService){
        this.dataStorage = new Database();
    }
    
    public void saveData(String data) {
        dataStorage.save(data);
    }
    
}
