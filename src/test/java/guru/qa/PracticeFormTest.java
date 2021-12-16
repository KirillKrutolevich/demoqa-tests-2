package guru.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.cssSelector;

public class PracticeFormTest {
    @Test
    void RegistrationFormTest() {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("Kirill");
        $("#lastName").setValue("Krutolevich");
        $("#userEmail").setValue("email@mail.ru");
        $("#").setValue("");
        $("#userNumber").setValue("9379992");
        $("#dateOfBirthInput").click();


    }
}
