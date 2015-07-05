package spring.ex.eagle.aop.service.service;

public class LoginServiceImpl implements LoginService {
    public void login(String name, String password) throws Exception {
            check(name, password);
            System.err.println(name + " is logining system...");
    }
    private void check(String name, String password) throws Exception {
        if("eagle".equals(name) && "pass".equals(password) ) {
                 System.err.println(name + " passed check....");
        } else {
                throw new Exception("invalid password");
        }
}
}