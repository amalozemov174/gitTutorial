public class PhoneUtil {

    public String getFullNumber(Phone phone) {
        return phone.getPrefix() + phone.getNumber();
    }

    public String getPhoneWithCode(Phone phone) {
        if(phone.getBonusCode() == null) {
            return phone.getPrefix() + phone.getNumber() + "";
        }
        else {
            return phone.getPrefix() + phone.getNumber() + "#" + phone.getBonusCode();
        }

    }
}
