package UOL.COMPASS.challenge01.exception;

import lombok.Getter;

@Getter
public class InvalidChassiIdException extends RuntimeException {
    private final String chassiId;

    public InvalidChassiIdException(String chassiId) {
        super(chassiId);
        this.chassiId = chassiId;
    }

}