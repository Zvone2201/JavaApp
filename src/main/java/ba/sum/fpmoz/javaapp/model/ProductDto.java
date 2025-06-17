package ba.sum.fpmoz.javaapp.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

public class ProductDto {
    @NotEmpty(message = "Unesite naziv")
    private String name;

    @NotEmpty(message = "Unesite autora")
    private String author;

    @NotEmpty(message = "Unesite kategoriju")
    private String category;

    @Min(0)
    private double price;

    @Size(min = 10, message = "Opis mora imati barem 10 znakova")
    @Size(max = 2000, message = "Opis ne može imati više od 2000 znakova")
    private String description;

    private MultipartFile imageFile;

    public @NotEmpty(message = "Unesite naziv") String getName() {
        return name;
    }

    public void setName(@NotEmpty(message = "Unesite naziv") String name) {
        this.name = name;
    }

    public @NotEmpty(message = "Unesite autora") String getAuthor() {
        return author;
    }

    public void setAuthor(@NotEmpty(message = "Unesite autora") String author) {
        this.author = author;
    }

    public @NotEmpty(message = "Unesite kategoriju") String getCategory() {
        return category;
    }

    public void setCategory(@NotEmpty(message = "Unesite kategoriju") String category) {
        this.category = category;
    }

    @Min(0)
    public double getPrice() {
        return price;
    }

    public void setPrice(@Min(0) double price) {
        this.price = price;
    }

    public @Size(min = 10, message = "Opis mora imati barem 10 znakova") @Size(max = 2000, message = "Opis ne može imati više od 2000 znakova") String getDescription() {
        return description;
    }

    public void setDescription(@Size(min = 10, message = "Opis mora imati barem 10 znakova") @Size(max = 2000, message = "Opis ne može imati više od 2000 znakova") String description) {
        this.description = description;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }
}
