package com.example.jeewantha.kongcept;

public class ModelRecycler {

    private String name, email, branchName, bankName, imgURL;

    public String getImgURL(){
        return imgURL;
    }

    public void setImgURL(String imgURL){
        this.imgURL = imgURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName= branchName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName= bankName;
    }

}
