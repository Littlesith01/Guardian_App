package com.example.guardian;

public class passwords {
    public class Guardians{
        private String CompanyName;
        private String Email;
        private String Passwords;

        public Guardians(String CompanyName, String Email, String Password){
            this.CompanyName = CompanyName;
            this.Email = Email;
            this.Passwords = Password;
        }
        public String getCompanyName(){
            return CompanyName;
        }
        public String getEmail(){
            return Email;
        }
        public String getPasswords(){
            return Passwords;
        }
    }
}
