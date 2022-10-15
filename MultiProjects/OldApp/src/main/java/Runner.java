import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {

    public static void main(String[] args) {
        Phone phone = new Phone("+7", "90909988281");
        PhoneUtil phoneUtil = new PhoneUtil();
        String phoneNumber = phoneUtil.getFullNumber(phone);
        log.info(phoneNumber);
    }

}
