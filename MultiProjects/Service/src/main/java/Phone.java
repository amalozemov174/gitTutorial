import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class Phone {
    @NonNull private final String prefix;
    @NonNull private final String number;
    //private String bonusCode;
}
