package com.example.bbtt.starbuzz;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

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

    @Override
    public void onListItemClick (ListView listView,
                                 View itemView,
                                 int position,
                                 long id) {
        Intent intent = new Intent (DrinkCategoryActivity.this, DrinkActivity.class); //Вызов DrinkActivity
        intent.putExtra (DrinkActivity.EXTRA_DRINKNO, (int) id); //Интент передает дополнительные данные в виде id выбранного варианта из списка, под именем EXTRA_DRINKNO. Передает в DrinkActivity.
        startActivity (intent);
    }
}
