package enumm;

public class TestEnum {
public static void main(String[] args) {
	Enum today = Enum.SATURDAY;
	System.out.println("TODAY is "+today.getName());
	switch(today) {
	case MONDAY:
		System.out.println("Work hard");
		break;
	case TUESDAY:
		System.out.println("Work little more");
		break;
	case WEDNESDAY:
		System.out.println("Work work little more");
		break;
	case THURSDAY:
		System.out.println("Work work more,WEEKEND IS AR");
		break;
	case FRIDAY:
		System.out.println("yeah weekend has arrived,hard party");
	case SATURDAY:
		System.out.println("enjoy morning coffee,go shopping");
	case SUNDAY:
		System.out.println("do all cleaning works,snoozzz");
	}
}
}
