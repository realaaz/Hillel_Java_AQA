public class L090_dateConverter {

    public static void main(String[] args) {

        // 02/15/91 -> 15/02/1991
        System.out.println(dateConverter("02/15/91"));

    }


    public static String dateConverter(String inDate) {

        String[] arrDate = inDate.split("/");

        return arrDate[1] + "/" + arrDate[0] + "/19" + arrDate[2];
    }

}
