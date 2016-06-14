package com.hfad.bitsandpieces.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ShareActionProvider;
import android.widget.TextView;

import com.hfad.bitsandpieces.R;
import com.hfad.bitsandpieces.domain.Pizza;

public class PizzaDetailActivity extends Activity {
    ShareActionProvider shareActionProvider;
    public static final String PIZZA_ID = "pizza_id";
    Pizza[] pizzas = Pizza.pizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        getActionBar().setDisplayHomeAsUpEnabled(true);

        int pizza_id = (int) getIntent().getExtras().get(PIZZA_ID);
        String name = pizzas[pizza_id].getName();
        TextView textView = (TextView) findViewById(R.id.tv_pizzaDetail);
        textView.setText(name);
        int image = pizzas[pizza_id].getImageId();
        ImageView imageView = (ImageView) findViewById(R.id.iv_pizzaDetail);
        imageView.setImageResource(image);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        TextView textView = (TextView) findViewById(R.id.tv_pizzaDetail);
        CharSequence name = textView.getText();
        MenuItem menuItem = menu.findItem(R.id.action_share);
        shareActionProvider = (ShareActionProvider) menuItem.getActionProvider();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, name);
        shareActionProvider.setShareIntent(intent);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.create_order:
                Intent intent = new Intent(this, OrderActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
