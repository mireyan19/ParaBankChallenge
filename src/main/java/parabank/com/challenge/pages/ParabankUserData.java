package parabank.com.challenge.pages;

public class ParabankUserData {
	// Almacena los datos generados
    private static String firstName;
    private static String lastName;
    private static String address;
    private static String city;
    private static String state;
    private static String zipCode;
    private static String phoneNumber;
    private static String ssn;
    private static String username;
    private static String password;
    

    // Métodos para acceder y modificar los datos
    public static String getFirstName() { return firstName; }
    public static String getLastName() { return lastName; }
    public static String getAddress() { return address; }
    public static String getCity() { return city; }
    public static String getState() { return state; }
    public static String getZipCode() { return zipCode; }
    public static String getPhoneNumber() { return phoneNumber; }
    public static String getSsn() { return ssn; }
    public static String getUsername() { return username; }
    public static String getPassword() { return password; }

    public static void setFirstName(String firstName) { ParabankUserData.firstName = firstName; }
    public static void setLastName(String lastName) { ParabankUserData.lastName = lastName; }
    public static void setAddress(String address) { ParabankUserData.address = address; }
    public static void setCity(String city) { ParabankUserData.city = city; }
    public static void setState(String state) { ParabankUserData.state = state; }
    public static void setZipCode(String zipCode) { ParabankUserData.zipCode = zipCode; }
    public static void setPhoneNumber(String phoneNumber) { ParabankUserData.phoneNumber = phoneNumber; }
    public static void setSsn(String ssn) { ParabankUserData.ssn = ssn; }
    public static void setUsername(String username) { ParabankUserData.username = username; }
    public static void setPassword(String password) { ParabankUserData.password = password; }

}
