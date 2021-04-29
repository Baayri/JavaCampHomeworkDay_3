public class UserManager {

    public void signIn(User user){
        System.out.println(user.getUserName()+" Giris Yapti");
    }

    public void signUp(User user){
        System.out.println(user.getUserName()+" Kayit Oldu");
    }

    public void logOut(User user){
        System.out.println(user.getUserName()+" Cikis Yapti");
    }

    public void changePassword(User user){
        System.out.println(user.getUserName()+" Parola değiştirildi");
    }

}
