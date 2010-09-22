package jtsg

class YongHu {
    String loginName
    String password
    String role
    String realName
    Boolean enabled

    static constraints = {
        loginName(blank:false)
        password(blank:false)
        role(nullable:false, inList:['policeman','leader','admin'])
        realName(blank:false)
        enabled()
    }
}
