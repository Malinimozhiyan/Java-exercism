
class TwelveDays {
    private String[] Days = {"", "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    private String[] Numbers = {"", "a", "two", "three", "four", "five", "six",
            "seven", "eight", "nine", "ten", "eleven", "twelve"};
    private String[] Gifts = {"" , "Partridge in a Pear Tree", "Turtle Doves", "French Hens",
            "Calling Birds", "Gold Rings", "Geese-a-Laying", "Swans-a-Swimming", "Maids-a-Milking", "Ladies Dancing",
            "Lords-a-Leaping", "Pipers Piping", "Drummers Drumming"};
    String stanza(int LineNo) {
        StringBuilder Sing = new StringBuilder();
        Sing.append(String.format("On the %s day of Christmas my true love gave to me: ", Days[LineNo]));
        for (int i = LineNo; i > 0; i--) {
            Sing.append(i == LineNo ? "" : i == 1 ? ", and " : ", ");
            Sing.append(String.format("%s %s", Numbers[i], Gifts[i]));
        }
        return Sing.append(".\n").toString();
    }
    String Song() {
        StringBuilder Sing = new StringBuilder();
        for (int i = 1; i <= 12; i++) {
            Sing.append(String.format("%s%s", stanza(i), i == 12 ? "" : "\n"));
        }
        return Sing.toString();
    }
	public static void main(String args[])
	{
	   TwelveDays obj = new TwelveDays();
	System.out.println(obj.Song());
	}
	
}
