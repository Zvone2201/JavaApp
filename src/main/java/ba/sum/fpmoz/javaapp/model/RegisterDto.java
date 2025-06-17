package ba.sum.fpmoz.javaapp.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class RegisterDto {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    private String phone;

    @NotEmpty
    private String address;

    @Size(min = 6, message = "Lozinka mora imati najmanje 6 znakova")
    private String password;

    private String confirmPassword;

    public @NotEmpty String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotEmpty String firstName) {
        this.firstName = firstName;
    }

    public @NotEmpty String getLastName() {
        return lastName;
    }

    public void setLastName(@NotEmpty String lastName) {
        this.lastName = lastName;
    }

    public @NotEmpty @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty @Email String email) {
        this.email = email;
    }

    public @NotEmpty String getPhone() {
        return phone;
    }

    public void setPhone(@NotEmpty String phone) {
        this.phone = phone;
    }

    public @NotEmpty String getAddress() {
        return address;
    }

    public void setAddress(@NotEmpty String address) {
        this.address = address;
    }

    public @Size(min = 6, message = "Lozinka mora imati najmanje 6 znakova") String getPassword() {
        return password;
    }

    public void setPassword(@Size(min = 6, message = "Lozinka mora imati najmanje 6 znakova") String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
