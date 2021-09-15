package com.example.hotstarapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotstarapp.R;
import com.example.hotstarapp.adapters.VerticalListAdapter;
import com.example.hotstarapp.util.Converter;
import com.example.hotstarapp.util.StaticValues;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ArrayList<Item> items = new ArrayList<>();
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        activity = HomeActivity.this;


        String formattion = StaticValues.resourse;
        String response;
        String home_content = "[]";
        JSONObject jsonObject;
        JSONArray jsonArray;
        String dataKey;
        JSONObject dataJsonObj;
        String dataArray;
        JSONArray dataJsonArray;
        JSONObject extractedDataJSONObject;
        String title;
        String thumbnail_image;
        String movieType;

        try {
            jsonObject = new JSONObject(formattion);
            response = jsonObject.getString("response");
            Log.e("JSONOBJ ", "-->> " + response);
            home_content = StaticValues.getReq2(response, "home_content");
            jsonArray = new JSONArray(home_content);
            for (int js = 0; js < jsonArray.length(); js++) {
                Item item = new Item();
                ArrayList<Title> titles = new ArrayList<>();
                dataJsonObj = jsonArray.getJSONObject(js);
                dataKey = dataJsonObj.getString("data");
                movieType = dataJsonObj.getString("category_name");
                titles = Converter.convertJsonToTitles(dataKey);
                item.setCategory_name(movieType);
                item.setTitles(titles);
                items.add(item);
            }
            Log.e("home_content", "-->> " + home_content);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        String arrayListToString = Converter.convertItemsToJson(items);
        Log.e("Formattion ", "Formattion " + arrayListToString);
        RecyclerView verticalRecycler = findViewById(R.id.verticalRecycler);
        verticalRecycler.setAdapter(new VerticalListAdapter(activity, items));

    }
}
