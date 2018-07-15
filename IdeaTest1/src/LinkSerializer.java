public class LinkSerializer {

    public static String toJson(final Link link) {
        // BEGIN (write your solution here)
        String url;
        String code;
        String expiryDate;

        if (link.getFullUrl() != null){
            url = "\"fullUrl\"" + ":" + '"' + link.getFullUrl() + '"';
        } else {
            url = "null";
        }

        if (link.getCode() == null){
            code = "null";
        } else {
            code = "\"code\"" + ":" + '"' + link.getCode() + '"';
        }

        if (link.getExpiryDate() == null){
            expiryDate = "null";
        } else {
            int month = link.getExpiryDate().getMonth();
            int year = link.getExpiryDate().getYear();
            expiryDate = "\"expiryDate\"" +
                    ":{" + "\"month\"" + ":" + month + "," + "\"year\"" + ":" + year + "}";
        }

        String json = "Link:" + "{" +  url + "," +  code + "," + expiryDate  + "}";
        
        return json;
        // END
    }
}