import java.util.*;
public class TestRuntimeException{

	public static void main(String[] args)
	{
      ArrayList<String> arrayList = new ArrayList<>();
        
        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");

        String day = "Sunday";

        if (!arrayList.contains(day)) {

            try {
                throw new DayNotAvailableException("Day not available",day);
            } catch (DayNotAvailableException e) {
                e.getLocalizedMessage();
                e.printStackTrace();
            }
        }
    }
}
