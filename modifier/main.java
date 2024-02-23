package modifier;
public class main {

    public static void main(String[] args) {
        
        Person user = new Person("aaa","bbb");
        Person user1 = new Person();
        
        user1.setUsername("LoL");
        user1.setPassword("LiL");
        
        System.out.println("Username : "+user.getUsername());
        System.out.println("Password : "+user.getPassword());
        
      
    }
    
}
