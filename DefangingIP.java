//Problem :Given a valid (IPv4) IP address, return a defanged version of that IP address.
//A defanged IP address replaces every period "." with "[.]".

//Analysis: Replace the string by replaceAll() method

public class DefangingIP {

    public String defangIP(String address){
        String str = address.replaceAll("\\.","[.]")
    }
}