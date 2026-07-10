public class User {
    private String name;
    private String ID;
    private String password;

    public User(String name, String ID, String password) {
        this.name = name;
        this.ID = ID;
        this.password = password;
    }

    public void login(String inputID, String inputPass){
        if(ID.equals(inputID) && password.equals(inputPass)){
            System.out.println("Logged in successfully");
        }
        else{
            System.out.println("ID or Password incorrect");
        }
    }
    
    public void logout(){
        System.out.print("Logged out");
    }
    
    public void displayInfo(){
        System.out.println("Name: " + name + " id: " + ID);
    }
    
}
