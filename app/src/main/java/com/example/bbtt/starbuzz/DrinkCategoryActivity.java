package com.example.bbtt.starbuzz;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>( //ListView заполняется данными из массива drinks класса Drinks.
          this,
          android.R.layout.simple_list_item_1,
          Drink.drinks);
        listDrinks.setAdapter(listAdapter);
    }
}
