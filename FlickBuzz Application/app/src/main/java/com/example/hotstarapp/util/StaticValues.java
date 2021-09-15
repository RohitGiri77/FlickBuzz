package com.example.hotstarapp.util;

import org.json.JSONException;
import org.json.JSONObject;

public class StaticValues {

    public static String resourse = "{\n" +
            "  \"error\": false,\n" +
            "  \"statusCode\": 200,\n" +
            "  \"status\": \"success\",\n" +
            "  \"message\": \"Succesfully fetched records\",\n" +
            "  \"response\": {\n" +
            "    \"home_content\": [\n" +
            "      {\n" +
            "        \"current_page\": 1,\n" +
            "        \"data\": [\n" +
            "          {\n" +
            "            \"title\": \"Skyscraper (2018)\",\n" +
            "            \"slug\": \"skyscraper-2018\",\n" +
            "            \"thumbnail_image\": \"https://d2rq7c4c4iu0a6.cloudfront.net/5bbb4a9a7e082.jpeg\"\n" +
            "          },\n" +
            "          {\n" +    //https://d2rq7c4c4iu0a6.cloudfront.net/images/videos/thumbnails/2018/11/5bec3eb12ca92.jpeg
            "            \"title\": \"John Wick Chapter 3\",\n" +
            "            \"slug\": \"john-wick-chapter-3\",\n" +
            "            \"thumbnail_image\": \"https://pbs.twimg.com/media/E911Ti1WEAAfy-8.jpg\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"title\": \"Mission Impossible\",\n" +
            "            \"slug\": \"mission-impossible-rogue-nation-trailer\",\n" +
            "            \"thumbnail_image\": \"https://d2rq7c4c4iu0a6.cloudfront.net/5ba4b378ca271.jpeg\"\n" +
            "          },\n" +
            "          {\n" +   //https://d2rq7c4c4iu0a6.cloudfront.net/images/videos/thumbnails/2020/08/5f350084f3755.jpeg
            "            \"title\": \"The Bureau of Magical Things\",\n" +
            "            \"slug\": \"the-bureau-of-magical-things\",\n" +
            "            \"thumbnail_image\": \"https://www.granice.pl/sys6/pliki/text/03/02/2021/1f3af1a53e506490a444da58015ee25d.jpg\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"from\": 1,\n" +
            "        \"last_page\": 1,\n" +
            "        \"per_page\": 10,\n" +
            "        \"to\": 4,\n" +
            "        \"total\": 4,\n" +
            "        \"category_name\": \"Popular in Movies\",\n" +
            "        \"category_slug\": \"movies\",\n" +
            "        \"type\": \"section_one\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"current_page\": 1,\n" +
            "        \"data\": [\n" +
            "          {\n" +
            "            \"title\": \"Djokovic Defeats Federer for Cincy Title and Masters History\",\n" +
            "            \"slug\": \"djokovic-defeats-federer-for-cincy-title-and-masters-history\",\n" +
            "            \"thumbnail_image\": \"https://d2rq7c4c4iu0a6.cloudfront.net/5b8faa239a2f4.jpeg\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"title\": \"Angelique Kerber v Maria Sharapova match highlights (3R)\",\n" +
            "            \"slug\": \"angelique-kerber-v-maria-sharapova-match-highlights-3r\",\n" +
            "            \"thumbnail_image\": \"https://d2rq7c4c4iu0a6.cloudfront.net/5b8ea919028cd.jpeg\"\n" +
            "          },\n" +
            "          {\n" +
            "            \"title\": \"Simona Halep v Caroline Wozniacki match highlights\",\n" +
            "            \"slug\": \"simona-halep-v-caroline-wozniacki-match-highlights\",\n" +
            "            \"thumbnail_image\": \"https://d2rq7c4c4iu0a6.cloudfront.net/5b8fabf21e691.jpeg\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"from\": 1,\n" +
            "        \"last_page\": 1,\n" +
            "        \"per_page\": 10,\n" +
            "        \"to\": 3,\n" +
            "        \"total\": 3,\n" +
            "        \"category_name\": \"Popular in Sports\",\n" +
            "        \"category_slug\": \"sports\",\n" +
            "        \"type\": \"section_two\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"current_page\": 1,\n" +
            "        \"data\": [\n" +
            "          {\n" +    //https://d2rq7c4c4iu0a6.cloudfront.net/images/videos/thumbnails/2018/12/5c08ee56a067a.jpeg
            "            \"title\": \"'Mowgli' Official Trailer (2018)\",\n" +
            "            \"slug\": \"mowgli-official-trailer-2018-christian-bale-cate-blanchett-youtube-1080p-1\",\n" +
            "            \"thumbnail_image\": \"https://moviebabble.com/wp-content/uploads/2018/12/Mowgli-Legend-of-the-jungle.jpg\"\n" +
            "          },\n" +
            "          {\n" +   //https://d2rq7c4c4iu0a6.cloudfront.net/images/videos/thumbnails/2020/08/5f339caf63770.jpeg
            "            \"title\": \"Sonic The Hedgehog\",\n" +
            "            \"slug\": \"sonic-the-hedgehog-official-trailer-1\",\n" +
            "            \"thumbnail_image\": \"https://pbs.twimg.com/media/Euyrs_dVoAIfDqG.jpg\"\n" +
            "          }\n" +
            "        ],\n" +
            "        \"from\": 1,\n" +
            "        \"last_page\": 1,\n" +
            "        \"per_page\": 10,\n" +
            "        \"to\": 2,\n" +
            "        \"total\": 2,\n" +
            "        \"category_name\": \"Popular in Kids\",\n" +
            "        \"category_slug\": \"kids\",\n" +
            "        \"type\": \"section_three\"\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}";

    public static String getReq2(String req2, String objectString) {
        String response = null;
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject = new JSONObject(req2);
            if (jsonObject.has(objectString)) {
                response = jsonObject.getString(objectString);
            }
        } catch (JSONException e) {
            e.printStackTrace();

        }

        return response;
    }

}
