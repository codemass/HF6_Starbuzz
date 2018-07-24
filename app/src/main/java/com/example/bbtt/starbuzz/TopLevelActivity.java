package com.example.bbtt.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        //Создать OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() { //itemClickListener - вложенный класс по отношению к классу AdapterView. ListView - субкласс AdapterView.
            public void onItemClick (AdapterView<?> listView, //Представление на котром был сделан клик (списковое представление в данном случае).
                                     View v, //Дополнительная информация о варианте спискового представления
                                     int position, //Например представление и его позиция
                                     long id) {
                if (position == 0) { //Drinks - первый вариант в списковом представлении - находится в позиции 0.
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class); //Интент выдается TopLevelActivity. Должен запускать DrinkCategoryActivity.
                    startActivity(intent);//Тут в интенте не передается каких либо значений, просто вызывается другая активити. Конкретно эта строка запускает интент.
                }
            }
        };

        //Добавить слушателя к ListView
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
