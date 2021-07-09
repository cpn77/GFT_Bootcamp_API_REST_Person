//Inserindo Genero Sexo

package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PersonGender {

    MALE("Male"),
    FEMALE("Female");

    private final String description;
}
