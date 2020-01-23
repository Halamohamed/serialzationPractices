package ec.utbildning.hala.data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Owner implements Serializable {
    private UUID ownerId;
    private String name;
    private LocalDate birthDate;

    public Owner(String name, LocalDate birthDate) {
        this.ownerId = UUID.randomUUID();
        this.name = name;
        this.birthDate = birthDate;
    }
    Owner(){}

    public UUID getOwnerId() {
        return ownerId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(ownerId, owner.ownerId) &&
                Objects.equals(name, owner.name) &&
                Objects.equals(birthDate, owner.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, name, birthDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Owner{");
        sb.append("ownerId=").append(ownerId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }
}
